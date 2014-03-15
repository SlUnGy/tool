// Generated from Tool.g4 by ANTLR 4.1
package generated;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ToolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ToolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ToolParser#func_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_data_type(@NotNull ToolParser.Func_data_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#int_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_expr(@NotNull ToolParser.Int_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#str_faktor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr_faktor(@NotNull ToolParser.Str_faktorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#bool_faktor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_faktor(@NotNull ToolParser.Bool_faktorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull ToolParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#assign_to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_to(@NotNull ToolParser.Assign_toContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(@NotNull ToolParser.Func_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull ToolParser.WhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#str_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr_expr(@NotNull ToolParser.Str_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#var_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_data_type(@NotNull ToolParser.Var_data_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull ToolParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(@NotNull ToolParser.DefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull ToolParser.IfContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#func_def_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def_params(@NotNull ToolParser.Func_def_paramsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(@NotNull ToolParser.Bool_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(@NotNull ToolParser.Var_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(@NotNull ToolParser.Var_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#func_call_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call_params(@NotNull ToolParser.Func_call_paramsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#int_faktor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_faktor(@NotNull ToolParser.Int_faktorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#produkt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProdukt(@NotNull ToolParser.ProduktContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(@NotNull ToolParser.CodeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(@NotNull ToolParser.Do_whileContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(@NotNull ToolParser.Func_callContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#main_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_func(@NotNull ToolParser.Main_funcContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull ToolParser.ProgramContext ctx);
}