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
import generated.ToolParser.Elif_structureContext;
import generated.ToolParser.ElseIfContext;
import generated.ToolParser.FunctionCallContext;
import generated.ToolParser.ParameterContext;
import reservedFunctions.*;

public class ToolCompilationVisitor extends ToolBaseVisitor<String> {

	private TokenStream tokenStream;
	private String applicationName;
	private Scope currentScope;
	private Stack currentStack;
	private Map<String, ReservedFunctions> reservedFunctions;

	private final static String separator = "#";

	public ToolCompilationVisitor(TokenStream pTS) {
		super();
		this.tokenStream = pTS;
		this.applicationName = "default/Default";
		this.currentScope = new Scope(null, this.applicationName);
		this.currentStack = new Stack(null);
		this.reservedFunctions = new HashMap<String, ReservedFunctions>() {
			private static final long serialVersionUID = -1000729011127015471L;
			{
				put("return", new reservedFunctions.Return());
				put("sprich", new reservedFunctions.Sprich());
				put("toStr", new reservedFunctions.ToStr());
			}
		};
	}

	private int getLine(ParserRuleContext ctx) {
		if (ctx != null) {
			return tokenStream.get(ctx.getSourceInterval().a).getLine();
		} else {
			return 0;
		}
	}

	private void printError(String pError, ParserRuleContext ctx) {
		System.err.printf("ERROR (line %d): %s" + System.lineSeparator(), getLine(ctx), pError);
	}

	private String functionCall(String fName, String fParams, int line) throws UnknownNameException {

		if (reservedFunctions.containsKey(fName)) {

			ReservedFunctions functionCall = reservedFunctions.get(fName);
			String parameters = "";

			if (fParams != null) {
				parameters = fParams + System.lineSeparator();
			}

			return parameters + functionCall.getJasmineStatements(parameters, currentStack, line) + System.lineSeparator();

		} else {
			String invocation = "invokestatic " + this.applicationName + "/" + fName;
			Function called;

			called = this.currentScope.getFun(fName);

			called.popParameters(currentStack, line);

			invocation += called.getDescriptor() + System.lineSeparator();

			if (fParams != null) {
				invocation = fParams + System.lineSeparator() + invocation;
			}

			if (this.currentScope.getFun(fName).getReturnType() != Datatype.TYPE_VOID) {
				currentStack.push(this.currentScope.getFun(fName).getReturnType());
			}

			return invocation;
		}
	}

	@Override
	public String visitAssignTo(@NotNull ToolParser.AssignToContext ctx) {
		try {
			final String loadValue = visit(ctx.value);
			currentStack.pop(this.currentScope.getVar(ctx.variableName.getText()).getType(), getLine(ctx));
			return System.lineSeparator() + loadValue + System.lineSeparator() + this.currentScope.getVarStoreInstruction(ctx.variableName.getText()) + System.lineSeparator();

		} catch (UnknownNameException e) {
			printError(e.getMessage(), ctx);
			System.exit(-1);
			return "";
		}
	}

	@Override
	public String visitVariableName(@NotNull ToolParser.VariableNameContext ctx) {
		return ctx.name.getText();
	}

	@Override
	public String visitCodeFunctionCall(@NotNull ToolParser.CodeFunctionCallContext ctx) {
		try {
			String fCall = ".line " + getLine(ctx) + System.lineSeparator() + functionCall(ctx.fn_name.getText(), (ctx.parameters != null) ? visit(ctx.parameters) : null, getLine(ctx));

			if (reservedFunctions.containsKey(ctx.fn_name.getText())) {

				if (reservedFunctions.get(ctx.fn_name.getText()).getReturnType() != Datatype.TYPE_VOID) {
					currentStack.pop(reservedFunctions.get(ctx.fn_name.getText()).getReturnType(), getLine(ctx));
					fCall = fCall + System.lineSeparator() + "pop" + System.lineSeparator();
				}

			} else {
				if (currentScope.getFun(ctx.fn_name.getText()).getReturnType() != Datatype.TYPE_VOID) {
					currentStack.pop(currentScope.getFun(ctx.fn_name.getText()).getReturnType(), getLine(ctx));
					fCall = fCall + System.lineSeparator() + "pop" + System.lineSeparator();
				}
			}

			return fCall;
		} catch (UnknownNameException e) {
			printError(e.getMessage(), ctx);
			System.exit(-1);
			return "";
		}
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
		final String safeBegin = LabelCounter.createSafeName("begin_code");
		final String safeEnd = LabelCounter.createSafeName("end_code");

		String code = "";
		if (ctx.instructions != null) {
			for (ToolParser.CodeContext instr : ctx.instructions) {
				code += visit(instr);
			}
		}

		String complete = "";
		complete += safeBegin + ":" + System.lineSeparator();
		complete += visit(ctx.while_condition) + System.lineSeparator();
		currentStack.pop(Datatype.TYPE_BOOL, getLine(ctx));
		complete += "ifeq " + safeEnd + System.lineSeparator();
		complete += code;
		complete += "goto " + safeBegin + System.lineSeparator();
		complete += safeEnd + ":" + System.lineSeparator();
		return complete;
	}

	@Override
	public String visitFunctionCall(@NotNull ToolParser.FunctionCallContext ctx) {
		try {
			return functionCall(ctx.fn_name.getText(), (ctx.parameters != null) ? visit(ctx.parameters) : null, getLine(ctx));
		} catch (UnknownNameException e) {
			printError(e.getMessage(), ctx);
			System.exit(-1);
			return "";
		}
	}

	@Override
	public String visitCodeControllStructure(@NotNull ToolParser.CodeControllStructureContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitIf(@NotNull ToolParser.IfContext ctx) {
		String cond = visit(ctx.if_condition);

		String cond_true = LabelCounter.createSafeName("cond_true");
		String cond_false = LabelCounter.createSafeName("cond_false");
		String cond_end = LabelCounter.createSafeName("cond_end");

		String instructions = "";
		String conditions = "";
		String returnString = "";

		// Branch if condition is true
		currentStack.pop(Datatype.TYPE_BOOL, getLine(ctx));
		conditions = cond + "ifne " + cond_true + System.lineSeparator();

		instructions += cond_true + ":" + System.lineSeparator();

		if (ctx.if_instructions != null) {
			for (ToolParser.CodeContext cc : ctx.if_instructions) {
				instructions += visit(cc);
			}
			instructions += "goto " + cond_end + System.lineSeparator();
		}

		if (ctx.elifs != null) {
			String[] result = null;
			String label;
			for (ToolParser.Elif_structureContext eif : ctx.elifs) {
				label = LabelCounter.createSafeName("cond_elseif");
				result = visit(eif).split(ToolCompilationVisitor.separator);
				conditions += result[0] + label + System.lineSeparator();
				instructions += label + ":" + System.lineSeparator() + result[1] + "goto " + cond_end + System.lineSeparator();
			}
		}

		instructions += cond_false + ":" + System.lineSeparator();
        if (ctx.else_structure() != null) {
            visit(ctx.else_structure());
        }

		returnString = conditions + "goto " + cond_false + System.lineSeparator() + instructions + cond_end + ":";

		return returnString;
	}

	@Override
	public String visitElseIf(@NotNull ToolParser.ElseIfContext ctx) {
		String cond = visit(ctx.elif_condition);
		String instructions = "";
		
		currentStack.pop(Datatype.TYPE_BOOL, getLine(ctx));
		if (ctx.elif_instructions != null) {
			for (ToolParser.CodeContext cc : ctx.elif_instructions) {
				instructions += visit(cc);
			}
		}
		return ".line " + getLine(ctx) + System.lineSeparator() + cond + "ifne "+ ToolCompilationVisitor.separator + instructions + System.lineSeparator();
	}

	@Override
	public String visitFunctionDefinitionParameters(@NotNull ToolParser.FunctionDefinitionParametersContext ctx) {

		// Split param string (name:type)
		String param = visit(ctx.param);

		if (ctx.remainder != null) {
			for (ToolParser.ParameterContext ec : ctx.remainder) {
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
			String name = visit(ctx.e);
			currentStack.push(currentScope.getVar(name).getType());
			return currentScope.getVarLoadInstruction(name);
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
	public String visitExprBoolean(@NotNull ToolParser.ExprBooleanContext ctx) {
		return visit(ctx.e);
	}

	@Override
	public String visitBooleanFactorString(@NotNull ToolParser.BooleanFactorStringContext ctx) {
		return visit(ctx.factor);
	}

	@Override
	public String visitBooleanFactorFunctionCall(@NotNull ToolParser.BooleanFactorFunctionCallContext ctx) {
		return visit(ctx.factor);
	}

	@Override
	public String visitBooleanFactorParenthesis(@NotNull ToolParser.BooleanFactorParenthesisContext ctx) {
		return visit(ctx.factor);
	}

	@Override
	public String visitBooleanFactorInverted(@NotNull ToolParser.BooleanFactorInvertedContext ctx) {
		return visit(ctx.factor);
	}

	@Override
	public String visitBooleanFactorBoolean(@NotNull ToolParser.BooleanFactorBooleanContext ctx) {
		String returnString = null;

		switch (ctx.factor.getText()) {
			case "_true":
				returnString = "ldc 1";
				break;
			case "_false":
				returnString = "ldc 0";
				break;
		}
		currentStack.push(Datatype.TYPE_BOOL);
		return returnString;
	}

	@Override
	public String visitBooleanFactorInt(@NotNull ToolParser.BooleanFactorIntContext ctx) {
		return visit(ctx.factor);
	}

	@Override
	public String visitBooleanFactorVariableName(@NotNull ToolParser.BooleanFactorVariableNameContext ctx) {
		return visit(ctx.factor);
	}

	@Override
	public String visitBooleanLower(@NotNull ToolParser.BooleanLowerContext ctx) {
		String tmp = visit(ctx.left)+System.lineSeparator()+visit(ctx.right)+Operator.OP_LT.compileOperator()+System.lineSeparator();
		currentStack.pop(Datatype.TYPE_INT, getLine(ctx));
		currentStack.pop(Datatype.TYPE_INT, getLine(ctx));
		currentStack.push(Datatype.TYPE_BOOL);
		return tmp;
	}

	@Override
	public String visitBooleanGreater(@NotNull ToolParser.BooleanGreaterContext ctx) {
		String tmp = visit(ctx.left)+System.lineSeparator()+visit(ctx.right)+Operator.OP_GT.compileOperator()+System.lineSeparator();
		currentStack.pop(Datatype.TYPE_INT, getLine(ctx));
		currentStack.pop(Datatype.TYPE_INT, getLine(ctx));
		currentStack.push(Datatype.TYPE_BOOL);
		return tmp;
	}

	@Override
	public String visitBooleanLE(@NotNull ToolParser.BooleanLEContext ctx) {
		String tmp = visit(ctx.left)+System.lineSeparator()+visit(ctx.right)+Operator.OP_LE.compileOperator()+System.lineSeparator();
		currentStack.pop(Datatype.TYPE_INT, getLine(ctx));
		currentStack.pop(Datatype.TYPE_INT, getLine(ctx));
		currentStack.push(Datatype.TYPE_BOOL);
		return tmp;
	}

	@Override
	public String visitBooleanGE(@NotNull ToolParser.BooleanGEContext ctx) {
		String tmp = visit(ctx.left)+System.lineSeparator()+visit(ctx.right)+Operator.OP_GE.compileOperator()+System.lineSeparator();
		currentStack.pop(Datatype.TYPE_INT, getLine(ctx));
		currentStack.pop(Datatype.TYPE_INT, getLine(ctx));
		currentStack.push(Datatype.TYPE_BOOL);
		return tmp;
	}

	@Override
	public String visitBooleanEqual(@NotNull ToolParser.BooleanEqualContext ctx) {
		String tmp = visit(ctx.left)+System.lineSeparator()+visit(ctx.right)+Operator.OP_EQ.compileOperator()+System.lineSeparator();
		currentStack.popUnchecked();
		currentStack.popUnchecked();
		currentStack.push(Datatype.TYPE_BOOL);
		return tmp;
	}

	@Override
	public String visitBooleanUnequal(@NotNull ToolParser.BooleanUnequalContext ctx) {
		String tmp = visit(ctx.left)+System.lineSeparator()+visit(ctx.right)+Operator.OP_NE.compileOperator()+System.lineSeparator();
		currentStack.popUnchecked();
		currentStack.popUnchecked();
		currentStack.push(Datatype.TYPE_BOOL);
		return tmp;
	}

	@Override
	public String visitBooleanOr(@NotNull ToolParser.BooleanOrContext ctx) {
		String tmp = visit(ctx.left)+System.lineSeparator()+visit(ctx.right)+Operator.OP_OR.compileOperator()+System.lineSeparator();
		currentStack.pop(Datatype.TYPE_BOOL, getLine(ctx));
		currentStack.pop(Datatype.TYPE_BOOL, getLine(ctx));
		currentStack.push(Datatype.TYPE_BOOL);
		return tmp;
	}

	@Override
	public String visitBooleanAnd(@NotNull ToolParser.BooleanAndContext ctx) {
		String tmp = visit(ctx.left)+System.lineSeparator()+visit(ctx.right)+Operator.OP_AND.compileOperator()+System.lineSeparator();
		currentStack.pop(Datatype.TYPE_BOOL, getLine(ctx));
		currentStack.pop(Datatype.TYPE_BOOL, getLine(ctx));
		currentStack.push(Datatype.TYPE_BOOL);
		return tmp;
	}

	@Override
	public String visitIntegerAddition(@NotNull ToolParser.IntegerAdditionContext ctx) {
		String tmp = visit(ctx.left) + System.lineSeparator() + visit(ctx.right) + System.lineSeparator() + Operator.OP_ADD.compileOperator();
		currentStack.pop(Datatype.TYPE_INT, getLine(ctx));
		currentStack.pop(Datatype.TYPE_INT, getLine(ctx));
		currentStack.push(Datatype.TYPE_INT);
		return tmp;
	}

	@Override
	public String visitIntegerSubtraction(@NotNull ToolParser.IntegerSubtractionContext ctx) {
		String tmp = visit(ctx.left) + System.lineSeparator() + visit(ctx.right) + System.lineSeparator() + Operator.OP_SUB.compileOperator();
		currentStack.pop(Datatype.TYPE_INT, getLine(ctx));
		currentStack.pop(Datatype.TYPE_INT, getLine(ctx));
		currentStack.push(Datatype.TYPE_INT);
		return tmp;
	}

	@Override
	public String visitIntegerProductFactor(@NotNull ToolParser.IntegerProductFactorContext ctx) {
		return visit(ctx.left);
	}

	@Override
	public String visitIntegerMultiplication(@NotNull ToolParser.IntegerMultiplicationContext ctx) {
		String tmp = visit(ctx.left) + System.lineSeparator() + visit(ctx.right) + System.lineSeparator() + Operator.OP_MUL.compileOperator();
		currentStack.pop(Datatype.TYPE_INT, getLine(ctx));
		currentStack.pop(Datatype.TYPE_INT, getLine(ctx));
		currentStack.push(Datatype.TYPE_INT);
		return tmp;
	}

	@Override
	public String visitIntegerDivision(@NotNull ToolParser.IntegerDivisionContext ctx) {
		String tmp = visit(ctx.left) + System.lineSeparator() + visit(ctx.right) + System.lineSeparator() + Operator.OP_DIV.compileOperator();
		currentStack.pop(Datatype.TYPE_INT, getLine(ctx));
		currentStack.pop(Datatype.TYPE_INT, getLine(ctx));
		currentStack.push(Datatype.TYPE_INT);
		return tmp;
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
		return "ldc " + ctx.factor.getText() + System.lineSeparator();
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
	public String visitStringExpression(@NotNull ToolParser.StringExpressionContext ctx) {
		String fullString = visit(ctx.left) + System.lineSeparator();
		for (ToolParser.Str_factorContext subStrFactorContext : ctx.right) {
			fullString += visit(subStrFactorContext) + Operator.OP_CAT.compileOperator() + System.lineSeparator();
		}
		return fullString;
	}

	@Override
	public String visitStringFactorFunctionCall(@NotNull ToolParser.StringFactorFunctionCallContext ctx) {
		return visit(ctx.factor);
	}

	@Override
	public String visitStringFactorVariableName(@NotNull ToolParser.StringFactorVariableNameContext ctx) {
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
		currentStack.push(Datatype.TYPE_STRING);
		return "ldc " + ctx.factor.getText() + System.lineSeparator();
	}

	@Override
	protected String aggregateResult(String aggregate, String nextResult) {
		String result = "";
		if (aggregate != null) {
			result += aggregate + System.lineSeparator();
		}
		if (nextResult != null) {
			result += nextResult + System.lineSeparator();
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
				definition = ".field static " + ctx.variableName.getText() + " " + type.getJasminType() + System.lineSeparator();
				if (value != null) {
					definition += ToolCompilationVisitor.separator;
				}
			}
			// if the variable doesn't get a value assigned we don't need to do
			// store a value inside the jasmin code
			if (value.length() > 0) {
				definition += value + System.lineSeparator();
				try {
					definition += currentScope.getVarStoreInstruction(ctx.variableName.getText()) + System.lineSeparator();
				} catch (UnknownNameException e) {
					printError(e.getMessage(), ctx);
					System.exit(-1);
				}
			}
			// POP the value from stack as it has been stored
			currentStack.pop(type, tokenStream.get(ctx.getSourceInterval().a).getLine());
		} catch (RedefinitionException e1) {
			printError(e1.getMessage(), ctx);
		}

		return definition;
	}

	@Override
	public String visitParameterDefinition(@NotNull ToolParser.ParameterDefinitionContext ctx) {
		return ctx.name.getText() + ToolCompilationVisitor.separator + ctx.type.getText();
	}

	@Override
	public String visitDoWhile(@NotNull ToolParser.DoWhileContext ctx) {
		final String safeBegin = LabelCounter.createSafeName("begin_code");

		String code = "";
		if (ctx.instructions != null) {
			for (ToolParser.CodeContext instr : ctx.instructions) {
				code += visit(instr);
			}
		}

		String returnString = null;
		returnString = safeBegin + ":" + System.lineSeparator();
		returnString += code;
        returnString += ".line " + getLine(ctx) + System.lineSeparator();
		returnString += visit(ctx.condition());
		currentStack.pop(Datatype.TYPE_BOOL, getLine(ctx));
		returnString += "ifne " + safeBegin + System.lineSeparator();

		return returnString;
	}

	@Override
	public String visitMainFunction(@NotNull ToolParser.MainFunctionContext ctx) {
		String code = "";

		this.currentScope = new Scope(currentScope, this.applicationName);
		this.currentStack = new Stack(currentStack);

		for (ToolParser.CodeContext c : ctx.instructions) {
			code += visit(c);
		}

		String mainStuff = ".method public static main([Ljava/lang/String;)V" + System.lineSeparator();
		mainStuff += ".limit stack " + this.currentStack.getMaxStackSize() + System.lineSeparator();
		mainStuff += ".limit locals " + this.currentScope.getLocalSize() + System.lineSeparator();
		mainStuff += code;

		mainStuff += System.lineSeparator() + "return" + System.lineSeparator() + ".end method";
		this.currentScope = this.currentScope.getParent();
		this.currentStack = this.currentStack.getParent();
		return mainStuff;
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
				String[] t = param.split(ToolCompilationVisitor.separator);

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

			for (int i = 0; i <= paramNames.size() - 1; i++) {
				currentScope.defineVar(paramNames.get(i), paramTypes.get(i));
			}

			currentStack = new Stack(currentStack);

			if (ctx.instructions.size() > 0) {
				for (ToolParser.CodeContext cctx : ctx.instructions) {
					code += visit(cctx) + System.lineSeparator();
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
		String param = visit(ctx.param) + System.lineSeparator();
		// TODO: Clean up this datatype mess
		if (ctx.remainder != null && ctx.remainder.size() > 0) {
			for (ToolParser.ExprContext expr : ctx.remainder) {
				param += visit(expr) + System.lineSeparator();
			}
		}

		return param;
	}

	/*
	 * takes definitions and returns it formatted like {static variable
	 * definitions, method definitions}
	 */
	private String[] splitDefinition(String pDefinitions) {
		String split[] = new String[] { "", "" };

		for (String part : pDefinitions.split(System.lineSeparator())) {
			if (part.startsWith(".field static")) {
				split[0] += part + System.lineSeparator();
			} else {
				split[1] += part + System.lineSeparator();
			}
		}
		return split;
	}

	/*
	 * parses context information to return {static variable def, method def,
	 * static variable initialization}
	 */
	private String[] processContextInformation(List<ToolParser.DefContext> pList) {
		String def[] = new String[] { "", "", "" };
		for (ToolParser.DefContext cb : pList) {
			String complete[] = visit(cb).split(ToolCompilationVisitor.separator);
			String tmp[] = splitDefinition(complete[0]);
			def[0] += tmp[0];
			def[1] += tmp[1];
			if (complete.length == 2) {
				def[2] += complete[1];
			}
		}
		return def;
	}

	@Override
	public String visitProgram(@NotNull ToolParser.ProgramContext ctx) {
		String def[] = new String[] { "", "", "" };
		this.currentStack = new Stack(this.currentStack);

		if (ctx.before != null) {
			String tmp[] = processContextInformation(ctx.before);
			def[0] += tmp[0];
			def[1] += tmp[1];
			def[2] += tmp[2];
		}

		if (ctx.after != null) {
			String tmp[] = processContextInformation(ctx.after);
			def[0] += tmp[0];
			def[1] += tmp[1];
			def[2] += tmp[2];
		}

		String result = ".class " + applicationName + System.lineSeparator() + ".super java/lang/Object" + System.lineSeparator();
		result += def[0] + System.lineSeparator() + def[1] + System.lineSeparator();
		if (def[2].length() > 0) {
			result += ".method static public <clinit>()V" + System.lineSeparator();
			result += ".limit stack " + this.currentStack.getMaxStackSize() + System.lineSeparator();
			result += ".limit locals 0" + System.lineSeparator();
			result += def[2] + "return " + System.lineSeparator();
			result += ".end method" + System.lineSeparator();
		}
		this.currentStack = this.currentStack.getParent();
		result += visit(ctx.m) + System.lineSeparator();

		return result;
	}
	
	@Override
	public String visitDefVariableDef(@NotNull ToolParser.DefVariableDefContext ctx) {
		return  System.lineSeparator() + visitChildren(ctx);
	}
	
	@Override
	public String visitDefFunctionDef(@NotNull ToolParser.DefFunctionDefContext ctx) {
		return ".line " + getLine(ctx) + System.lineSeparator() + visit(ctx.functionDef);
	}
	
	@Override 
	public String visitElse(@NotNull ToolParser.ElseContext ctx) {
		String instructions = "";
		if (ctx.else_instructions != null) {
			for (CodeContext cc : ctx.else_instructions) {
				instructions += visit(cc);
			}
		}
		return ".line " + getLine(ctx) + System.lineSeparator() + instructions;
	}

    @Override
    public String visitCond(@NotNull ToolParser.CondContext ctx) {
        return ".line " + getLine(ctx) + System.lineSeparator() + visit(ctx.bool_expr());
    }
}
