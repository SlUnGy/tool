package compiler;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.NotNull;

import compiler.Scope.RedefinitionException;
import compiler.Scope.UnknownNameException;
import generated.*;
import generated.ToolParser.CodeContext;
import generated.ToolParser.DefContext;
import generated.ToolParser.ExprContext;
import generated.ToolParser.ParameterContext;

public class ToolCompilationVisitor extends ToolBaseVisitor<String> {

	private TokenStream tokenStream;
	private String applicationName;
	private Scope currentScope;
	private Stack currentStack;
	private Map<String, Function> reservedFunctions;

	private final static String seperator = "#";

	public ToolCompilationVisitor(TokenStream pTS) {
		super();
		this.tokenStream = pTS;
		this.applicationName = "Default";
		this.currentScope = new Scope(null, this.applicationName);
		this.currentStack = new Stack(null);
		this.reservedFunctions = new HashMap<String, Function>() {
			private static final long serialVersionUID = -1000729011127015471L;
			{
				put("return", new Function(	"return",
											"return", 
											Datatype.TYPE_VOID
											));
				put("sprich", new Function(	"sprich",
											"getstatic java/lang/System/out Ljava/io/PrintStream;\n"+ "swap\n" + "\n" + "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V",
											Datatype.TYPE_VOID
											));
				put("toStr",  new Function(	"toStr",
											"invokestatic java/lang/Integer/toString(I)Ljava/lang/String;", 
											Datatype.TYPE_STRING
											));
			}
		};
	}

	private void printError(String pError, ParserRuleContext ctx) {
		System.err.printf("ERROR (line %d): %s" + System.lineSeparator(), tokenStream.get(ctx.getSourceInterval().a).getLine(), pError);
	}

	@Override
	public String visitBooleanFactorString(@NotNull ToolParser.BooleanFactorStringContext ctx) {
		return visit(ctx.factor);
	}

	@Override
	public String visitAssignTo(@NotNull ToolParser.AssignToContext ctx) {
		try {
			final String loadValue = visit(ctx.value);
			currentStack.pop(this.currentScope.getVar(ctx.variableName.getText()).getType());
			return "\n" + loadValue + "\n" + this.currentScope.getVarStoreInstruction(ctx.variableName.getText()) + "\n";

		} catch (UnknownNameException e) {
			printError(e.getMessage(), ctx);
			System.exit(-1);
			return "";
		}
	}

	@Override
	public String visitExprBoolean(@NotNull ToolParser.ExprBooleanContext ctx) {
		return visit(ctx.e);
	}

	@Override
	public String visitBooleanFactorFunctionCall(@NotNull ToolParser.BooleanFactorFunctionCallContext ctx) {
		return visit(ctx.factor);
	}

	@Override
	public String visitVariableName(@NotNull ToolParser.VariableNameContext ctx) {
		return ctx.name.getText();
	}
	
	@Override
	public String visitCodeFunctionCall(@NotNull ToolParser.CodeFunctionCallContext ctx) {
		return visit(ctx.instruction);
	}

	@Override
	public String visitCodeAssignment(@NotNull ToolParser.CodeAssignmentContext ctx) {
		return visit(ctx.instruction);
	}

	@Override
	public String visitCodeVariableDefinition(@NotNull ToolParser.CodeVariableDefinitionContext ctx) {
		return visit(ctx.instruction);
	}

	@Override
	public String visitWhile(@NotNull ToolParser.WhileContext ctx) {
		final String cond = visit(ctx.condition);
		final String safeBegin = LabelCounter.createSafeName("begin_code");
		final String safeEnd = LabelCounter.createSafeName("end_code");

		String code = "";
		if (ctx.instructions != null) {
			for (ToolParser.CodeContext instr : ctx.instructions) {
				code += visit(instr);
			}
		}

		String complete = "";
		complete += safeBegin + ":" + "\n";
		complete += cond + "\n";
		complete += Operator.OP_EQ.compileOperator() + "\n";

		complete += "ifeq " + safeEnd + "\n";
		complete += code;
		complete += "goto " + safeBegin + "\n";
		complete += safeEnd + ":" + "\n";
		return complete;
	}

	@Override
	public String visitFunctionCall(@NotNull ToolParser.FunctionCallContext ctx) {
		if (reservedFunctions.containsKey(ctx.fn_name.getText())) {
			
			Function functionCall = reservedFunctions.get(ctx.fn_name.getText());
			String parameters = "";
			

			if (ctx.parameters != null) {
				parameters = visit(ctx.parameters) + "\n";
			}
			
			return parameters + functionCall.getInvocation();

		} else {
			String invocation = "invokevirtual " + this.applicationName + "/" + ctx.fn_name.getText();
			Function called;
			try {
				called = this.currentScope.getFun(ctx.fn_name.getText());

				invocation += called.getDescriptor() + "\n";

				if (ctx.parameters != null) {
					invocation = visit(ctx.parameters) + "\n" + invocation;
				}
				
				if(this.currentScope.getFun(ctx.fn_name.getText()).getReturnType() != Datatype.TYPE_VOID)
				{
					currentStack.push(this.currentScope.getFun(ctx.fn_name.getText()).getReturnType());
				}

				return invocation;

			} catch (UnknownNameException e) {
				printError(e.getMessage(), ctx);
				System.exit(-1);
				return "";
			}
		}
	}

	@Override
	public String visitCodeControllStructure(@NotNull ToolParser.CodeControllStructureContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitBooleanFactorParenthesis(@NotNull ToolParser.BooleanFactorParenthesisContext ctx) {
		return visit(ctx.factor);
	}

	@Override
	public String visitIf(@NotNull ToolParser.IfContext ctx) {
		String cond = visit(ctx.if_condition);

		String instructions = "";
		if (ctx.if_instructions != null) {
			for (CodeContext cc : ctx.if_instructions) {
				instructions += visit(cc);
			}
		}

		return cond + instructions + "\n";
	}

	@Override
	public String visitElseIf(@NotNull ToolParser.ElseIfContext ctx) {
		String cond = visit(ctx.elif_condition);
		String instructions = "";
		if (ctx.elif_instructions != null) {
			for (ToolParser.CodeContext cc : ctx.elif_instructions) {
				instructions += visit(cc);
			}
		}
		return cond + instructions + "\n";
	}

	@Override
	public String visitFunctionDefinitionParameters(@NotNull ToolParser.FunctionDefinitionParametersContext ctx) {

		// Split param string (name:type)
		String param = visit(ctx.param);

		if (ctx.remainder != null) {
			for (ParameterContext ec : ctx.remainder) {
				param += "," + visit(ec);
			}
		}

		return param;
	}

	@Override
	public String visitExprInteger(@NotNull ToolParser.ExprIntegerContext ctx) {
		return visit(ctx.e);
	}

	@Override
	public String visitExprString(@NotNull ToolParser.ExprStringContext ctx) {
		return visit(ctx.e);
	}

	@Override
	public String visitExprVariableName(@NotNull ToolParser.ExprVariableNameContext ctx) {
		try {
			return currentScope.getVarLoadInstruction(visit(ctx.e));
		} catch (UnknownNameException e) {
			printError(e.getMessage(), ctx);
			System.exit(-1);
			return "";
		}
	}

	@Override
	public String visitExprFunctionName(@NotNull ToolParser.ExprFunctionNameContext ctx) {
		return visit(ctx.e);
	}

	@Override
	public String visitIntegerAddition(@NotNull ToolParser.IntegerAdditionContext ctx) {
		currentStack.pop(Datatype.TYPE_INT);
		currentStack.pop(Datatype.TYPE_INT);
		currentStack.push(Datatype.TYPE_INT);
		return visit(ctx.left) + "\n" + visit(ctx.right) + "\n" + Operator.OP_ADD.compileOperator();
	}

	@Override
	public String visitIntegerSubtraction(@NotNull ToolParser.IntegerSubtractionContext ctx) {
		currentStack.pop(Datatype.TYPE_INT);
		currentStack.pop(Datatype.TYPE_INT);
		currentStack.push(Datatype.TYPE_INT);
		return visit(ctx.left) + "\n" + visit(ctx.right) + "\n" + Operator.OP_SUB.compileOperator();
	}

	@Override
	public String visitIntegerProductFactor(@NotNull ToolParser.IntegerProductFactorContext ctx) {
		return visit(ctx.left);
	}

	@Override
	public String visitIntegerMultiplication(@NotNull ToolParser.IntegerMultiplicationContext ctx) {
		currentStack.pop(Datatype.TYPE_INT);
		currentStack.pop(Datatype.TYPE_INT);
		currentStack.push(Datatype.TYPE_INT);
		return visit(ctx.left) + "\n" + visit(ctx.right) + "\n" + Operator.OP_MUL.compileOperator();
	}

	@Override
	public String visitIntegerDivision(@NotNull ToolParser.IntegerDivisionContext ctx) {
		currentStack.pop(Datatype.TYPE_INT);
		currentStack.pop(Datatype.TYPE_INT);
		currentStack.push(Datatype.TYPE_INT);
		return visit(ctx.left) + "\n" + visit(ctx.right) + "\n" + Operator.OP_DIV.compileOperator();
	}

	@Override
	public String visitIntegerFactorVariableName(@NotNull ToolParser.IntegerFactorVariableNameContext ctx) {
		try {
			currentStack.push(Datatype.TYPE_INT);
			return this.currentScope.getVarLoadInstruction(ctx.factor.getText());
		} catch (UnknownNameException e) {
			printError(e.getMessage(), ctx);
			System.exit(-1);
			return "";
		}
	}

	@Override
	public String visitIntegerFactor(@NotNull ToolParser.IntegerFactorContext ctx) {
		currentStack.push(Datatype.TYPE_INT);
		return "ldc " + ctx.factor.getText() + "\n";
	}

	@Override
	public String visitIntegerFactorParenthesis(@NotNull ToolParser.IntegerFactorParenthesisContext ctx) {
		return visit(ctx.factor);
	}

	@Override
	public String visitIntegerFactorFunctionCall(@NotNull ToolParser.IntegerFactorFunctionCallContext ctx) {
		return visit(ctx.factor);
	}

	@Override
	public String visitFunctionDataType(@NotNull ToolParser.FunctionDataTypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitBooleanFactorInverted(@NotNull ToolParser.BooleanFactorInvertedContext ctx) {
		return visit(ctx.factor);
	}

	@Override
	public String visitStringExpression(@NotNull ToolParser.StringExpressionContext ctx) {
        String fullString = visit(ctx.left)+System.lineSeparator();
        for (ToolParser.Str_factorContext subStrFactorContext : ctx.right) {
            fullString += visit(subStrFactorContext) + Operator.OP_CAT.compileOperator()+System.lineSeparator();
        }
        return fullString;
	}

	@Override
	public String visitStringFactorFunctionCall(@NotNull ToolParser.StringFactorFunctionCallContext ctx) {
		return visit(ctx.factor);
	}
	
	@Override
	public String visitStringFactorVariableName(@NotNull ToolParser.StringFactorVariableNameContext ctx){
		try {
			currentStack.push(Datatype.TYPE_STRING);
			return this.currentScope.getVarLoadInstruction(visit(ctx.factor));
		} catch (UnknownNameException e) {
			printError(e.getMessage(), ctx);
			System.exit(-1);
			return "";
		}
	}

	@Override
	public String visitStringFactorParenthesis(@NotNull ToolParser.StringFactorParenthesisContext ctx) {
		return visit(ctx.factor);
	}

	@Override
	public String visitStringFactorString(@NotNull ToolParser.StringFactorStringContext ctx) {
		currentStack.push(Datatype.TYPE_INT);
		return "ldc "+ctx.factor.getText()+"\n";
	}

	@Override
	protected String aggregateResult(String aggregate, String nextResult) {
		String result = "";
		if (aggregate != null) {
			result += aggregate + "\n";
		}
		if (nextResult != null) {
			result += nextResult + "\n";
		}
		return result;
	}

	@Override
	public String visitVariableDefinition(@NotNull ToolParser.VariableDefinitionContext ctx) {
		String value = "";
		if (ctx.value != null) {
			value = visit(ctx.value);
		}

		final Datatype type = Datatype.resolveType(ctx.type.getText());
		String definition = "";
		try {
			currentScope.defineVar(ctx.variableName.getText(), type);
			if (currentScope.isRoot()) {
				definition = ".field static " + ctx.variableName.getText() + " " + type.getJasminType() + "\n";
				if (value != null) {
					definition += ToolCompilationVisitor.seperator;
				}
			}
			// if the variable doesn't get a value assigned we don't need to do store a value inside the jasmin code
			if(value.length() > 0){
				definition += value + "\n";
				try {
					definition += currentScope.getVarStoreInstruction(ctx.variableName.getText())+System.lineSeparator();
				} catch (UnknownNameException e) {
					printError(e.getMessage(), ctx);
					System.exit(-1);
				}
			}
			//POP the value from stack as it has been stored
			currentStack.pop(type);
		} catch (RedefinitionException e1) {
			printError(e1.getMessage(), ctx);
		}

		return definition;
	}

	@Override
	public String visitParameterDefinition(@NotNull ToolParser.ParameterDefinitionContext ctx) {
		return ctx.name.getText() + ToolCompilationVisitor.seperator + ctx.type.getText();
	}

	@Override
	public String visitBooleanFactorBoolean(@NotNull ToolParser.BooleanFactorBooleanContext ctx) {
		String returnString = null;
		
		switch(ctx.factor.getText())
		{
			case "_true":
				returnString = "ldc 0";
			break;
			case "_false":
				returnString = "ldc 1";
			break;
		}
		currentStack.push(Datatype.TYPE_BOOL);
		return returnString;
	}

	@Override
	public String visitBooleanFactorInt(@NotNull ToolParser.BooleanFactorIntContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitDoWhile(@NotNull ToolParser.DoWhileContext ctx) {
		final String cond = visit(ctx.condition);
		final String safeBegin = LabelCounter.createSafeName("begin_code");

		String code = "";
		if (ctx.instructions != null) {
			for (ToolParser.CodeContext instr : ctx.instructions) {
				code += visit(instr);
			}
		}

		String returnString = null;
		returnString = safeBegin+":\n";
		returnString += code;
		returnString += cond;
		returnString += "ifeq " + safeBegin + "\n";	
		
		return returnString;
	}

	@Override
	public String visitMainFunction(@NotNull ToolParser.MainFunctionContext ctx) {
		this.currentScope = new Scope(currentScope, this.applicationName);
		String mainStuff = ".method public static main([Ljava/lang/String;)V\n.limit stack 100\n";
		for (ToolParser.CodeContext c : ctx.instructions) {
			mainStuff += visit(c);
		}
		mainStuff += "\nreturn\n.end method";
		this.currentScope = this.currentScope.getParent();
		return mainStuff;
	}

	@Override
	public String visitBooleanFactorVariableName(@NotNull ToolParser.BooleanFactorVariableNameContext ctx) {
		return visit(ctx.factor);
	}

	@Override
	public String visitDataType(@NotNull ToolParser.DataTypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFunctionDefinition(@NotNull ToolParser.FunctionDefinitionContext ctx) {
		Datatype returnType = Datatype.resolveType(ctx.type.getText());
		String functionName = ctx.fn_name.getText();

		String[] parameters;
		LinkedList<String> paramNames = new LinkedList<>();
		LinkedList<Datatype> paramTypes = new LinkedList<>();

		if (ctx.parameter_list != null) {
			parameters = visit(ctx.parameter_list).split(",");

			for (String param : parameters) {
				String[] t = param.split(ToolCompilationVisitor.seperator);

				paramNames.add(t[0]);
				paramTypes.add(Datatype.resolveType(t[1]));
			}
		}

		Function function = new Function(functionName, returnType, paramNames, paramTypes);
		String code = "";
		int localVarSize = 0;
		int localStackSize = 0;
		try {
			currentScope.defineFun(functionName, function);
			currentScope = new Scope(currentScope, this.applicationName);
			currentStack = new Stack(currentStack);

			if (ctx.instructions.size() > 0) {
				for (ToolParser.CodeContext cctx : ctx.instructions) {
					code += visit(cctx) + "\n";
				}
			}
			localVarSize = currentScope.getLocalSize();
			localStackSize = currentStack.getMaxStackSize();
			currentScope = currentScope.getParent();
			currentStack = currentStack.getParent();
		} catch (RedefinitionException e) {
			printError(e.getMessage(), ctx);
		}

		return function.createFunctionStatement(code, localVarSize, localStackSize);
	}

	@Override
	public String visitFunctionCallParameters(@NotNull ToolParser.FunctionCallParametersContext ctx) {
		String param = visit(ctx.param)+System.lineSeparator();
		//TODO: Clean up this datatype mess
		if(ctx.remainder != null && ctx.remainder.size()>0){
			for(ToolParser.ExprContext expr : ctx.remainder){
				param += visit(expr)+System.lineSeparator();
			}
		}

		return param;
	}

	
	/*
	 * takes definitions and returns it formatted like {static variable definitions, method definitions} 
	 */
	private String[] splitDefinition(String pDefinitions){
		String split[]= new String[]{"",""};
		
        for(String part : pDefinitions.split(System.lineSeparator())){
        	if(part.startsWith(".field static")){
        		split[0] += part + System.lineSeparator();
			}
			else {
				split[1] += part + System.lineSeparator();
			}
        }
		return split;
	}

	/*
	 * parses context information to return {static variable def, method def, static variable initialization}
	 */
	private String[] processContextInformation(List<DefContext> pList){
		String def[] = new String[]{"","",""};
		for (ToolParser.DefContext cb : pList) {
			String complete[] = visit(cb).split(ToolCompilationVisitor.seperator);
			String tmp[] = splitDefinition(complete[0]);
			def[0]+=tmp[0];
			def[1]+=tmp[1];
			if (complete.length == 2) {
				def[2] += complete[1];
			}
		}
		return def;
	}

	@Override
	public String visitProgram(@NotNull ToolParser.ProgramContext ctx) {
		String def[] = new String[]{"","",""};

		if (ctx.before != null) {
			String tmp[] = processContextInformation(ctx.before);
			def[0]+=tmp[0];
			def[1]+=tmp[1];
			def[2]+=tmp[2];
		}

		if (ctx.after != null) {
			String tmp[] = processContextInformation(ctx.after);
			def[0]+=tmp[0];
			def[1]+=tmp[1];
			def[2]+=tmp[2];
		}

		String result = ".class " + applicationName + System.lineSeparator() + ".super java/lang/Object" + System.lineSeparator();
		result += def[0] + System.lineSeparator() + def[1] + System.lineSeparator();
		if (def[2].length() > 0) {
			result += ".method static public <clinit>()V" + "\n";
			result += ".limit stack 100" + "\n";
			result += def[2] + "return " + "\n";
			result += ".end method" + "\n";
		}
		result += visit(ctx.m) + "\n";

		return result;
	}
}
