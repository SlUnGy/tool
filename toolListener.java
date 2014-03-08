// Generated from tool.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link toolParser}.
 */
public interface toolListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link toolParser#zuweisung}.
	 * @param ctx the parse tree
	 */
	void enterZuweisung(@NotNull toolParser.ZuweisungContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#zuweisung}.
	 * @param ctx the parse tree
	 */
	void exitZuweisung(@NotNull toolParser.ZuweisungContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#funktions_aufruf}.
	 * @param ctx the parse tree
	 */
	void enterFunktions_aufruf(@NotNull toolParser.Funktions_aufrufContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#funktions_aufruf}.
	 * @param ctx the parse tree
	 */
	void exitFunktions_aufruf(@NotNull toolParser.Funktions_aufrufContext ctx);

	/**
	 * Enter a parse tree produced by {@link toolParser#funktions_def}.
	 * @param ctx the parse tree
	 */
	void enterFunktions_def(@NotNull toolParser.Funktions_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#funktions_def}.
	 * @param ctx the parse tree
	 */
	void exitFunktions_def(@NotNull toolParser.Funktions_defContext ctx);

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
	 * Enter a parse tree produced by {@link toolParser#daten_typ}.
	 * @param ctx the parse tree
	 */
	void enterDaten_typ(@NotNull toolParser.Daten_typContext ctx);
	/**
	 * Exit a parse tree produced by {@link toolParser#daten_typ}.
	 * @param ctx the parse tree
	 */
	void exitDaten_typ(@NotNull toolParser.Daten_typContext ctx);

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