// Generated from C:/Users/franz/Documents/Uni-Shizzle/Compilerbau/tool\Tool.g4 by ANTLR 4.x
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
	 * Visit a parse tree produced by {@link ToolParser#assignTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignTo(@NotNull ToolParser.AssignToContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#stringFactorFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFactorFunctionCall(@NotNull ToolParser.StringFactorFunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#exprBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolean(@NotNull ToolParser.ExprBooleanContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#stringFactorVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFactorVariableName(@NotNull ToolParser.StringFactorVariableNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(@NotNull ToolParser.VariableNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#integerMultiplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerMultiplication(@NotNull ToolParser.IntegerMultiplicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanGE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanGE(@NotNull ToolParser.BooleanGEContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull ToolParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#stringFactorParenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFactorParenthesis(@NotNull ToolParser.StringFactorParenthesisContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanGreater}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanGreater(@NotNull ToolParser.BooleanGreaterContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#defVariableDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefVariableDef(@NotNull ToolParser.DefVariableDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(@NotNull ToolParser.ElseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanUnequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanUnequal(@NotNull ToolParser.BooleanUnequalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanFactorVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFactorVariableName(@NotNull ToolParser.BooleanFactorVariableNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanFactorInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFactorInt(@NotNull ToolParser.BooleanFactorIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#stringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(@NotNull ToolParser.StringExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#stringFactorString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFactorString(@NotNull ToolParser.StringFactorStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAnd(@NotNull ToolParser.BooleanAndContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanLE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLE(@NotNull ToolParser.BooleanLEContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#doWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhile(@NotNull ToolParser.DoWhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanFactorFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFactorFunctionCall(@NotNull ToolParser.BooleanFactorFunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#exprString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(@NotNull ToolParser.ExprStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(@NotNull ToolParser.MainFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#defFunctionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefFunctionDef(@NotNull ToolParser.DefFunctionDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(@NotNull ToolParser.FunctionDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#integerSubtraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerSubtraction(@NotNull ToolParser.IntegerSubtractionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull ToolParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#integerProductFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerProductFactor(@NotNull ToolParser.IntegerProductFactorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanLower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLower(@NotNull ToolParser.BooleanLowerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanFactorParenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFactorParenthesis(@NotNull ToolParser.BooleanFactorParenthesisContext ctx);

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
	 * Visit a parse tree produced by {@link ToolParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(@NotNull ToolParser.CondContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#integerFactorFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerFactorFunctionCall(@NotNull ToolParser.IntegerFactorFunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull ToolParser.WhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanEqual(@NotNull ToolParser.BooleanEqualContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#codeControllStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeControllStructure(@NotNull ToolParser.CodeControllStructureContext ctx);

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
	 * Visit a parse tree produced by {@link ToolParser#booleanOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOr(@NotNull ToolParser.BooleanOrContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#functionDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDataType(@NotNull ToolParser.FunctionDataTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#integerDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerDivision(@NotNull ToolParser.IntegerDivisionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(@NotNull ToolParser.VariableDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#elseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIf(@NotNull ToolParser.ElseIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#parameterDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDefinition(@NotNull ToolParser.ParameterDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#integerProduct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerProduct(@NotNull ToolParser.IntegerProductContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#integerAddition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerAddition(@NotNull ToolParser.IntegerAdditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanFactorBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFactorBoolean(@NotNull ToolParser.BooleanFactorBooleanContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#integerFactorVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerFactorVariableName(@NotNull ToolParser.IntegerFactorVariableNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(@NotNull ToolParser.DataTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanFactorInverted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFactorInverted(@NotNull ToolParser.BooleanFactorInvertedContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#integerFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerFactor(@NotNull ToolParser.IntegerFactorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#functionCallParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallParameters(@NotNull ToolParser.FunctionCallParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanFactorString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFactorString(@NotNull ToolParser.BooleanFactorStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#booleanFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFactor(@NotNull ToolParser.BooleanFactorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ToolParser#integerFactorParenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerFactorParenthesis(@NotNull ToolParser.IntegerFactorParenthesisContext ctx);
}