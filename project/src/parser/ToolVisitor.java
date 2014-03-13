package parser;
// Generated from Tool.g4 by ANTLR 4.1
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
	 * Visit a parse tree produced by {@link ToolParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull ToolParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#str_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr_expression(@NotNull ToolParser.Str_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#int_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_expression(@NotNull ToolParser.Int_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(@NotNull ToolParser.Var_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(@NotNull ToolParser.Var_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#bool_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expression(@NotNull ToolParser.Bool_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#str_faktor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr_faktor(@NotNull ToolParser.Str_faktorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#int_faktor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_faktor(@NotNull ToolParser.Int_faktorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#bool_faktor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_faktor(@NotNull ToolParser.Bool_faktorContext ctx);

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
	 * Visit a parse tree produced by {@link ToolParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(@NotNull ToolParser.Func_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(@NotNull ToolParser.MainContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull ToolParser.WhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull ToolParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull ToolParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(@NotNull ToolParser.Func_callContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(@NotNull ToolParser.DefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(@NotNull ToolParser.Do_whileContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull ToolParser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(@NotNull ToolParser.Data_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull ToolParser.IfContext ctx);
}