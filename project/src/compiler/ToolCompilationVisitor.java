package compiler;

import org.antlr.v4.runtime.misc.NotNull;

import compiler.Datatype.UnknownDatatypeException;
import generated.*;

public class ToolCompilationVisitor extends ToolBaseVisitor<String> {
	
	private Scope currentScope = new Scope(null);
	private String applicationName = "Default";

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
	public String visitProductRight(@NotNull ToolParser.ProductRightContext ctx) {
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
	public String visitBooleanExpressionRight(
			@NotNull ToolParser.BooleanExpressionRightContext ctx) {
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
	public String visitVariableDefinition(
			@NotNull ToolParser.VariableDefinitionContext ctx) {
		String setValue = "";
		if(ctx.value != null){
			setValue = visit(ctx.value);
		}
		
		final Datatype type = Datatype.resolveType(ctx.type.getText());
		if(type.equals(Datatype.TYPE_INVALID)){
			System.err.println("not able to resolve type from "+ctx.type.getText());
			System.exit(-1);
		}
		
		int newId = currentScope.define(ctx.variableName.getText(), type);
		
		return "a" + newId + "\n" + setValue + "\n";
	}

	@Override
	public String visitParameterDefinition(
			@NotNull ToolParser.ParameterDefinitionContext ctx) {
		return visitChildren(ctx);
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
		return visitChildren(ctx);
	}

	@Override
	public String visitIntegerExpression(
			@NotNull ToolParser.IntegerExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFunctionCallParameters(
			@NotNull ToolParser.FunctionCallParametersContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitBooleanExpression(
			@NotNull ToolParser.BooleanExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitStringExpressionRight(
			@NotNull ToolParser.StringExpressionRightContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitIntegerFaktorParenthesis(
			@NotNull ToolParser.IntegerFaktorParenthesisContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitIntegerExpressionRight(
			@NotNull ToolParser.IntegerExpressionRightContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitStringFaktorFunctionCall(
			@NotNull ToolParser.StringFaktorFunctionCallContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public String visitDefinitionList
			(@NotNull ToolParser.DefinitionListContext ctx){
		String rest = "";
		if(ctx.next != null){
			rest = visit(ctx.next);
		}
		return visit(ctx.definition) + "\n" + rest + "\n";
	}

	@Override
	public String visitProgram(@NotNull ToolParser.ProgramContext ctx) {
		String before = "";
		if (ctx.before != null) {
			before = visit(ctx.before);
		}
		currentScope.printInfo();
		String after = "";
		if (ctx.after != null) {
			after = visit(ctx.after);
		}
		currentScope.printInfo();
		return ".class " + applicationName + "\n.super java/lang/Object\n" + before + "\n" + after + "\n" + visit(ctx.m) + "\n";
	}
}
