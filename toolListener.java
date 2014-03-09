// Generated from tool.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link toolParser}.
 */
public interface toolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link toolParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull toolParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull toolParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#int_expression}.
	 * @param ctx the parse tree
	 */
	void enterInt_expression(@NotNull toolParser.Int_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#int_expression}.
	 * @param ctx the parse tree
	 */
	void exitInt_expression(@NotNull toolParser.Int_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(@NotNull toolParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(@NotNull toolParser.Var_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterBool_expression(@NotNull toolParser.Bool_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitBool_expression(@NotNull toolParser.Bool_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#int_faktor}.
	 * @param ctx the parse tree
	 */
	void enterInt_faktor(@NotNull toolParser.Int_faktorContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#int_faktor}.
	 * @param ctx the parse tree
	 */
	void exitInt_faktor(@NotNull toolParser.Int_faktorContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#bool_faktor}.
	 * @param ctx the parse tree
	 */
	void enterBool_faktor(@NotNull toolParser.Bool_faktorContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#bool_faktor}.
	 * @param ctx the parse tree
	 */
	void exitBool_faktor(@NotNull toolParser.Bool_faktorContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#produkt}.
	 * @param ctx the parse tree
	 */
	void enterProdukt(@NotNull toolParser.ProduktContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#produkt}.
	 * @param ctx the parse tree
	 */
	void exitProdukt(@NotNull toolParser.ProduktContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(@NotNull toolParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(@NotNull toolParser.CodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(@NotNull toolParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(@NotNull toolParser.Func_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(@NotNull toolParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(@NotNull toolParser.MainContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#cont_structure}.
	 * @param ctx the parse tree
	 */
	void enterCont_structure(@NotNull toolParser.Cont_structureContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#cont_structure}.
	 * @param ctx the parse tree
	 */
	void exitCont_structure(@NotNull toolParser.Cont_structureContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull toolParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull toolParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull toolParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull toolParser.ParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(@NotNull toolParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(@NotNull toolParser.Func_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(@NotNull toolParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(@NotNull toolParser.DefContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull toolParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull toolParser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(@NotNull toolParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(@NotNull toolParser.Data_typeContext ctx);
}