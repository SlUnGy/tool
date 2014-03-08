// Generated from tool.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link toolParser}.
 */
public interface toolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link toolParser#int_ausdruck}.
	 * @param ctx the parse tree
	 */
	void enterInt_ausdruck(@NotNull toolParser.Int_ausdruckContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#int_ausdruck}.
	 * @param ctx the parse tree
	 */
	void exitInt_ausdruck(@NotNull toolParser.Int_ausdruckContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#ausdruck}.
	 * @param ctx the parse tree
	 */
	void enterAusdruck(@NotNull toolParser.AusdruckContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#ausdruck}.
	 * @param ctx the parse tree
	 */
	void exitAusdruck(@NotNull toolParser.AusdruckContext ctx);

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
	 * Enter a parse tree produced by {@link toolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull toolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull toolParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#variablen_typ}.
	 * @param ctx the parse tree
	 */
	void enterVariablen_typ(@NotNull toolParser.Variablen_typContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#variablen_typ}.
	 * @param ctx the parse tree
	 */
	void exitVariablen_typ(@NotNull toolParser.Variablen_typContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#variablen_zuweisung}.
	 * @param ctx the parse tree
	 */
	void enterVariablen_zuweisung(@NotNull toolParser.Variablen_zuweisungContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#variablen_zuweisung}.
	 * @param ctx the parse tree
	 */
	void exitVariablen_zuweisung(@NotNull toolParser.Variablen_zuweisungContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#bool_ausdruck}.
	 * @param ctx the parse tree
	 */
	void enterBool_ausdruck(@NotNull toolParser.Bool_ausdruckContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#bool_ausdruck}.
	 * @param ctx the parse tree
	 */
	void exitBool_ausdruck(@NotNull toolParser.Bool_ausdruckContext ctx);

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
	 * Enter a parse tree produced by {@link toolParser#faktor}.
	 * @param ctx the parse tree
	 */
	void enterFaktor(@NotNull toolParser.FaktorContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#faktor}.
	 * @param ctx the parse tree
	 */
	void exitFaktor(@NotNull toolParser.FaktorContext ctx);

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
	 * Enter a parse tree produced by {@link toolParser#variablen_def}.
	 * @param ctx the parse tree
	 */
	void enterVariablen_def(@NotNull toolParser.Variablen_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#variablen_def}.
	 * @param ctx the parse tree
	 */
	void exitVariablen_def(@NotNull toolParser.Variablen_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#haupt}.
	 * @param ctx the parse tree
	 */
	void enterHaupt(@NotNull toolParser.HauptContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#haupt}.
	 * @param ctx the parse tree
	 */
	void exitHaupt(@NotNull toolParser.HauptContext ctx);
}