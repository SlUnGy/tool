package compiler;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import generated.*;

public class ToolCompilationVisitor extends ToolBaseVisitor<String> {

	public String visit(ParseTree pAST) {
		super.visit(pAST);
		return pAST.toStringTree();
	}

	@Override
	public String visitFunc_data_type(
			@NotNull ToolParser.Func_data_typeContext ctx) {
		System.out.println(ctx.getText());
		return visitChildren(ctx);
	}

	@Override
	public String visitInt_expr(@NotNull ToolParser.Int_exprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitStr_faktor(@NotNull ToolParser.Str_faktorContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitBool_faktor(@NotNull ToolParser.Bool_faktorContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitExpr(@NotNull ToolParser.ExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitAssign_to(@NotNull ToolParser.Assign_toContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFunc_def(@NotNull ToolParser.Func_defContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitWhile(@NotNull ToolParser.WhileContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitStr_expr(@NotNull ToolParser.Str_exprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitVar_data_type(
			@NotNull ToolParser.Var_data_typeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitParameter(@NotNull ToolParser.ParameterContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitDef(@NotNull ToolParser.DefContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitIf(@NotNull ToolParser.IfContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFunc_def_params(
			@NotNull ToolParser.Func_def_paramsContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitBool_expr(@NotNull ToolParser.Bool_exprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitVar_name(@NotNull ToolParser.Var_nameContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitVar_def(@NotNull ToolParser.Var_defContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFunc_call_params(
			@NotNull ToolParser.Func_call_paramsContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitInt_faktor(@NotNull ToolParser.Int_faktorContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitProdukt(@NotNull ToolParser.ProduktContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitCode(@NotNull ToolParser.CodeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitDo_while(@NotNull ToolParser.Do_whileContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFunc_call(@NotNull ToolParser.Func_callContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitMain_func(@NotNull ToolParser.Main_funcContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitProgram(@NotNull ToolParser.ProgramContext ctx) {
		return visitChildren(ctx);
	}
}
