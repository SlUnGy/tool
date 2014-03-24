package compiler;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.antlr.v4.runtime.misc.NotNull;

import generated.*;
import generated.ToolParser.ExprContext;

public class ToolCompilationVisitor extends ToolBaseVisitor<String> {
	
	private Scope currentScope = new Scope(null);
	private String applicationName = "Default";
	private final static String seperator = ":";

	@Override
	public String visitStringFaktorString(
			@NotNull ToolParser.StringFaktorStringContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitBooleanFaktorString(
			@NotNull ToolParser.BooleanFaktorStringContext ctx) {
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
	public String visitIntegerFaktorFunctionCall(
			@NotNull ToolParser.IntegerFaktorFunctionCallContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitBooleanFaktorFunctionCall(
			@NotNull ToolParser.BooleanFaktorFunctionCallContext ctx) {
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
	public String visitStringFaktorParenthesis(
			@NotNull ToolParser.StringFaktorParenthesisContext ctx) {
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
	public String visitBooleanFaktorParenthesis(
			@NotNull ToolParser.BooleanFaktorParenthesisContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitIf(@NotNull ToolParser.IfContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFunctionDefinitionParameters(
			@NotNull ToolParser.FunctionDefinitionParametersContext ctx) {
		return visitChildren(ctx);
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
	public String visitBooleanFaktorInverted(
			@NotNull ToolParser.BooleanFaktorInvertedContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitStringExpression(
			@NotNull ToolParser.StringExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitIntegerFaktorVariableName(
			@NotNull ToolParser.IntegerFaktorVariableNameContext ctx) {
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
	public String visitBooleanFaktorBoolean(
			@NotNull ToolParser.BooleanFaktorBooleanContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitBooleanFaktorInt(
			@NotNull ToolParser.BooleanFaktorIntContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitDoWhile(@NotNull ToolParser.DoWhileContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitMainFunction(@NotNull ToolParser.MainFunctionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitExprString(@NotNull ToolParser.ExprStringContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitBooleanFaktorVariableName(
			@NotNull ToolParser.BooleanFaktorVariableNameContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitIntegerFaktor(
			@NotNull ToolParser.IntegerFaktorContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitDataType(@NotNull ToolParser.DataTypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFunctionDefinition(
			@NotNull ToolParser.FunctionDefinitionContext ctx) {
		
		final Datatype type = Datatype.resolveType(ctx.type.getText());
		if(type.equals(Datatype.TYPE_INVALID)){
			System.err.println("not able to resolve type from "+ctx.type.getText());
			System.exit(-1);
		}
		
		String functionName = ctx.fn_name.getText();
		
		
		
		Function function = new Function(functionName, type, currentScope);
		System.out.println("New Function: "+functionName+" "+type.getType());
		
		if(ctx.parameter_list != null)
		{
			visit(ctx.parameter_list);
		}
		
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
		
		LinkedHashMap<String, Datatype> parameters = new LinkedHashMap<String, Datatype>();		
		
		//Split param string (name:type)
		String[] param = visit(ctx.param).split(":");		
		
		//Resolve data type from string
		Datatype type = Datatype.resolveType(param[1]);
		if(type.equals(Datatype.TYPE_INVALID)){
			System.err.println("not able to resolve type from "+param[1]);
			System.exit(-1);
		}
		
		parameters.put(param[0], type);
		
		if(ctx.remainder != null)
		{
			for(ExprContext ec : ctx.remainder) {	
				
				param = visit(ec).split(":");	
				
				type = Datatype.resolveType(param[1]);
				if(type.equals(Datatype.TYPE_INVALID)){
					System.err.println("not able to resolve type from "+param[1]);
					System.exit(-1);
				}
				
				parameters.put(param[0], type);
			}
		}
		
		
		return visitChildren(ctx);
	}

	@Override
	public String visitBooleanExpression(
			@NotNull ToolParser.BooleanExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitIntegerFaktorParenthesis(
			@NotNull ToolParser.IntegerFaktorParenthesisContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitStringFaktorFunctionCall(
			@NotNull ToolParser.StringFaktorFunctionCallContext ctx) {
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
			result += ".method static public <clinit>()V" +"\n" + staticInitializerBlock + ".end method" + "\n";
		}
		result += visit(ctx.m) + "\n";
		
		return result;
	}
}
