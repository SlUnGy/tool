// Generated from Tool.g4 by ANTLR 4.2
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
	 * Visit a parse tree produced by {@link ToolParser#stringFaktorString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFaktorString(@NotNull ToolParser.StringFaktorStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanFaktorString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFaktorString(@NotNull ToolParser.BooleanFaktorStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#assignTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignTo(@NotNull ToolParser.AssignToContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#exprBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolean(@NotNull ToolParser.ExprBooleanContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#integerFaktorFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerFaktorFunctionCall(@NotNull ToolParser.IntegerFaktorFunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanFaktorFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFaktorFunctionCall(@NotNull ToolParser.BooleanFaktorFunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(@NotNull ToolParser.VariableNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#codeFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeFunctionCall(@NotNull ToolParser.CodeFunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#codeAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeAssignment(@NotNull ToolParser.CodeAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#codeVariableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeVariableDefinition(@NotNull ToolParser.CodeVariableDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#stringFaktorParenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFaktorParenthesis(@NotNull ToolParser.StringFaktorParenthesisContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull ToolParser.WhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull ToolParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#codeControllStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeControllStructure(@NotNull ToolParser.CodeControllStructureContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(@NotNull ToolParser.DefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanFaktorParenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFaktorParenthesis(@NotNull ToolParser.BooleanFaktorParenthesisContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull ToolParser.IfContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#functionDefinitionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinitionParameters(@NotNull ToolParser.FunctionDefinitionParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#exprInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInteger(@NotNull ToolParser.ExprIntegerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#exprVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVariableName(@NotNull ToolParser.ExprVariableNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#exprFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFunctionName(@NotNull ToolParser.ExprFunctionNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#productCalc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductCalc(@NotNull ToolParser.ProductCalcContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#functionDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDataType(@NotNull ToolParser.FunctionDataTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanFaktorInverted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFaktorInverted(@NotNull ToolParser.BooleanFaktorInvertedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#stringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(@NotNull ToolParser.StringExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#integerFaktorVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerFaktorVariableName(@NotNull ToolParser.IntegerFaktorVariableNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(@NotNull ToolParser.VariableDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#parameterDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDefinition(@NotNull ToolParser.ParameterDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanFaktorBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFaktorBoolean(@NotNull ToolParser.BooleanFaktorBooleanContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanFaktorInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFaktorInt(@NotNull ToolParser.BooleanFaktorIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#doWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhile(@NotNull ToolParser.DoWhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(@NotNull ToolParser.MainFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#exprString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(@NotNull ToolParser.ExprStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanFaktorVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFaktorVariableName(@NotNull ToolParser.BooleanFaktorVariableNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#integerFaktor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerFaktor(@NotNull ToolParser.IntegerFaktorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(@NotNull ToolParser.DataTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(@NotNull ToolParser.FunctionDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#integerExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpression(@NotNull ToolParser.IntegerExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull ToolParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#functionCallParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallParameters(@NotNull ToolParser.FunctionCallParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(@NotNull ToolParser.BooleanExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#integerFaktorParenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerFaktorParenthesis(@NotNull ToolParser.IntegerFaktorParenthesisContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#stringFaktorFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFaktorFunctionCall(@NotNull ToolParser.StringFaktorFunctionCallContext ctx);
}