// Generated from tool.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link toolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface toolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link toolParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull toolParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#str_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr_expression(@NotNull toolParser.Str_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#int_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_expression(@NotNull toolParser.Int_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(@NotNull toolParser.Var_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(@NotNull toolParser.Var_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#bool_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expression(@NotNull toolParser.Bool_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#str_faktor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr_faktor(@NotNull toolParser.Str_faktorContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#int_faktor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_faktor(@NotNull toolParser.Int_faktorContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#bool_faktor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_faktor(@NotNull toolParser.Bool_faktorContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#produkt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProdukt(@NotNull toolParser.ProduktContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(@NotNull toolParser.CodeContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(@NotNull toolParser.Func_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(@NotNull toolParser.MainContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull toolParser.WhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull toolParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull toolParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(@NotNull toolParser.Func_callContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(@NotNull toolParser.DefContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(@NotNull toolParser.Do_whileContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull toolParser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(@NotNull toolParser.Data_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link toolParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull toolParser.IfContext ctx);
}