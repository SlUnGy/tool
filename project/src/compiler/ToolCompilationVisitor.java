package compiler;

import java.util.LinkedList;

import org.antlr.v4.runtime.misc.NotNull;

import generated.*;
import generated.ToolParser.ExprContext;
import generated.ToolParser.ParameterContext;

public class ToolCompilationVisitor extends ToolBaseVisitor<String> {
	
	private Scope currentScope = new Scope(null);
	private String applicationName = "Default";
	private final static String seperator = ":";

	@Override
	public String visitStringFactorString(
			@NotNull ToolParser.StringFactorStringContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitBooleanFactorString(
			@NotNull ToolParser.BooleanFactorStringContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitAssignTo(@NotNull ToolParser.AssignToContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitExprBoolean(@NotNull ToolParser.ExprBooleanContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitIntegerFactorFunctionCall(
			@NotNull ToolParser.IntegerFactorFunctionCallContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitBooleanFactorFunctionCall(
			@NotNull ToolParser.BooleanFactorFunctionCallContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitVariableName(@NotNull ToolParser.VariableNameContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitCodeFunctionCall(
			@NotNull ToolParser.CodeFunctionCallContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitCodeAssignment(
			@NotNull ToolParser.CodeAssignmentContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitCodeVariableDefinition(
			@NotNull ToolParser.CodeVariableDefinitionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitStringFactorParenthesis(
			@NotNull ToolParser.StringFactorParenthesisContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitWhile(@NotNull ToolParser.WhileContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFunctionCall(@NotNull ToolParser.FunctionCallContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitCodeControllStructure(
			@NotNull ToolParser.CodeControllStructureContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitBooleanFactorParenthesis(
			@NotNull ToolParser.BooleanFactorParenthesisContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitIf(@NotNull ToolParser.IfContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFunctionDefinitionParameters(
			@NotNull ToolParser.FunctionDefinitionParametersContext ctx) {
				
		//Split param string (name:type)
		String param = visit(ctx.param);		
		
		if(ctx.remainder != null)
		{
			for(ParameterContext ec : ctx.remainder) {					
				param += ","+visit(ec);	
			}
		}
		
		return param;
	}

	@Override
	public String visitExprInteger(@NotNull ToolParser.ExprIntegerContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitExprVariableName(
			@NotNull ToolParser.ExprVariableNameContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitExprFunctionName(
			@NotNull ToolParser.ExprFunctionNameContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitProductCalc(@NotNull ToolParser.ProductCalcContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFunctionDataType(
			@NotNull ToolParser.FunctionDataTypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitBooleanFactorInverted(
			@NotNull ToolParser.BooleanFactorInvertedContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitStringExpression(
			@NotNull ToolParser.StringExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitIntegerFactorVariableName(
			@NotNull ToolParser.IntegerFactorVariableNameContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	protected String aggregateResult(String aggregate, String nextResult) {
		String result = "";
		if(aggregate != null){
			result += aggregate + "\n";
		}
		if(nextResult != null){
			result += nextResult + "\n";
		}
		return result;
	}

	@Override
	public String visitVariableDefinition(
			@NotNull ToolParser.VariableDefinitionContext ctx) {
		String value = "";
		if(ctx.value != null){
			value = visit(ctx.value);
		}
		
		final Datatype type = Datatype.resolveType(ctx.type.getText());
		if(type.equals(Datatype.TYPE_INVALID)){
			System.err.println("not able to resolve type from "+ctx.type.getText());
			System.exit(-1);
		}
		
		int newId = currentScope.define(ctx.variableName.getText(), type);
		
		if(currentScope.isRoot()){
			String definition = ".field static " + ctx.variableName.getText() + " " + type.getJasminType() + "\n";
			if(value != null){
				definition += ToolCompilationVisitor.seperator;
				definition += "ldc " + ctx.value.getText() + "\n";
				definition += "putstatic " + this.applicationName + "/" + ctx.variableName.getText() + " " + type.getJasminType() + "\n";
			}
			return definition;
		}
		else {
			return "ldc " + value + "\n";
		}
	}

	@Override
	public String visitParameterDefinition(
			@NotNull ToolParser.ParameterDefinitionContext ctx) {
		System.out.println("Parameter: "+ctx.name.getText()+":"+ctx.type.getText());
		return ctx.name.getText()+":"+ctx.type.getText();
	}

	@Override
	public String visitBooleanFactorBoolean(
			@NotNull ToolParser.BooleanFactorBooleanContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitBooleanFactorInt(
			@NotNull ToolParser.BooleanFactorIntContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitDoWhile(@NotNull ToolParser.DoWhileContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitMainFunction(@NotNull ToolParser.MainFunctionContext ctx) {
        String mainStuff = ".method public static main([Ljava/lang/String;)V \n .limit stack 100\n ";
        for (ToolParser.CodeContext c : ctx.instructions) {
            mainStuff += visit(c);
        }
        mainStuff += "\n return \n.end method";
		return mainStuff;
	}

	@Override
	public String visitExprString(@NotNull ToolParser.ExprStringContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitBooleanFactorVariableName(
			@NotNull ToolParser.BooleanFactorVariableNameContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitIntegerFactor(
			@NotNull ToolParser.IntegerFactorContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitDataType(@NotNull ToolParser.DataTypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFunctionDefinition(
			@NotNull ToolParser.FunctionDefinitionContext ctx) {
		
		Datatype type = Datatype.resolveType(ctx.type.getText());
		if(type.equals(Datatype.TYPE_INVALID)){
			System.err.println("not able to resolve type from "+ctx.type.getText());
			System.exit(-1);
		}
		
		String functionName = ctx.fn_name.getText();
		String[] parameters;
		LinkedList<String> paramNames= new LinkedList<String>();
		LinkedList<String> paramTypes= new LinkedList<String>();
		
		if(ctx.parameter_list != null)
		{
			parameters = visit(ctx.parameter_list).split(",");
			
			for(String param : parameters)
			{
				String[] t = param.split(":");
				paramNames.add(t[0]);
				
				type = Datatype.resolveType(t[1]);
				if(type.equals(Datatype.TYPE_INVALID)){
					System.err.println("not able to resolve type from '"+ctx.type.getText()+"'");
					System.exit(-1);
				}
				paramTypes.add(type.getJasminType());
			}
		}		
				
		String function = ".method public static "+functionName+"(";
		for(int i = 0; i < paramTypes.size(); i++)
		{
			if(i == paramTypes.size()-1)
			{
				function += paramTypes.get(i);
			}
			else
			{
				function += paramTypes.get(i) + ",";
			}	
			
		}
		
		function +=	")"+type.getJasminType();
		System.out.println(function);
		
		
		
		String code = visit(ctx.code);
		//System.out.print(code);
		
		return "";
		//return visitChildren(ctx);
	}

	@Override
	public String visitIntegerExpression(
			@NotNull ToolParser.IntegerExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFunctionCallParameters(
			@NotNull ToolParser.FunctionCallParametersContext ctx) {	
		
		//Split param string (name:type)
		String param = visit(ctx.param);		

		if(ctx.remainder != null)
		{
			for(ExprContext ec : ctx.remainder) {					
				param += ","+visit(ec);	
				//System.out.print("..."+visit(ec));
			}
		}
		
		return param;
	}

	@Override
	public String visitBooleanExpression(
			@NotNull ToolParser.BooleanExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitIntegerFactorParenthesis(
			@NotNull ToolParser.IntegerFactorParenthesisContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitStringFactorFunctionCall(
			@NotNull ToolParser.StringFactorFunctionCallContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitProgram(@NotNull ToolParser.ProgramContext ctx) {
		String staticInitializerBlock = "";
		String definition = "";
		if (ctx.before != null) {
			for(ToolParser.DefContext cb : ctx.before){
				 String complete[] = visit(cb).split(ToolCompilationVisitor.seperator);
				 definition += complete[0];
				 if(complete.length == 2){
					 staticInitializerBlock += complete[1];
				 }
			}
		}
		currentScope.printInfo();

		if (ctx.after != null) {
			for(ToolParser.DefContext ca : ctx.after){
				 String complete[] = visit(ca).split(ToolCompilationVisitor.seperator);
				 definition += complete[0];
				 if(complete.length == 2){
					 staticInitializerBlock += complete[1];
				 }
			}
		}
		currentScope.printInfo();
		
		String result = ".class " + applicationName + "\n" + ".super java/lang/Object" + "\n" + definition + "\n";
		if(staticInitializerBlock.length()>0){
			result += ".method static public <clinit>()V" +"\n";
			result += ".limit stack 100" + "\n";
			result += staticInitializerBlock + "return " + "\n";
			result += ".end method" + "\n";
		}
		result += visit(ctx.m) + "\n";
		
		return result;
	}
}
