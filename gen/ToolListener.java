// Generated from C:/Users/franz/Documents/Uni-Shizzle/Compilerbau/tool\Tool.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ToolParser}.
 */
public interface ToolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ToolParser#assignTo}.
	 * @param ctx the parse tree
	 */
	void enterAssignTo(@NotNull ToolParser.AssignToContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#assignTo}.
	 * @param ctx the parse tree
	 */
	void exitAssignTo(@NotNull ToolParser.AssignToContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#stringFactorFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterStringFactorFunctionCall(@NotNull ToolParser.StringFactorFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#stringFactorFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitStringFactorFunctionCall(@NotNull ToolParser.StringFactorFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#exprBoolean}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolean(@NotNull ToolParser.ExprBooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#exprBoolean}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolean(@NotNull ToolParser.ExprBooleanContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#stringFactorVariableName}.
	 * @param ctx the parse tree
	 */
	void enterStringFactorVariableName(@NotNull ToolParser.StringFactorVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#stringFactorVariableName}.
	 * @param ctx the parse tree
	 */
	void exitStringFactorVariableName(@NotNull ToolParser.StringFactorVariableNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(@NotNull ToolParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(@NotNull ToolParser.VariableNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#integerMultiplication}.
	 * @param ctx the parse tree
	 */
	void enterIntegerMultiplication(@NotNull ToolParser.IntegerMultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#integerMultiplication}.
	 * @param ctx the parse tree
	 */
	void exitIntegerMultiplication(@NotNull ToolParser.IntegerMultiplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#booleanGE}.
	 * @param ctx the parse tree
	 */
	void enterBooleanGE(@NotNull ToolParser.BooleanGEContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#booleanGE}.
	 * @param ctx the parse tree
	 */
	void exitBooleanGE(@NotNull ToolParser.BooleanGEContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull ToolParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull ToolParser.FunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#stringFactorParenthesis}.
	 * @param ctx the parse tree
	 */
	void enterStringFactorParenthesis(@NotNull ToolParser.StringFactorParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#stringFactorParenthesis}.
	 * @param ctx the parse tree
	 */
	void exitStringFactorParenthesis(@NotNull ToolParser.StringFactorParenthesisContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#booleanGreater}.
	 * @param ctx the parse tree
	 */
	void enterBooleanGreater(@NotNull ToolParser.BooleanGreaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#booleanGreater}.
	 * @param ctx the parse tree
	 */
	void exitBooleanGreater(@NotNull ToolParser.BooleanGreaterContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#defVariableDef}.
	 * @param ctx the parse tree
	 */
	void enterDefVariableDef(@NotNull ToolParser.DefVariableDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#defVariableDef}.
	 * @param ctx the parse tree
	 */
	void exitDefVariableDef(@NotNull ToolParser.DefVariableDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(@NotNull ToolParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(@NotNull ToolParser.ElseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#booleanUnequal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanUnequal(@NotNull ToolParser.BooleanUnequalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#booleanUnequal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanUnequal(@NotNull ToolParser.BooleanUnequalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#booleanFactorVariableName}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFactorVariableName(@NotNull ToolParser.BooleanFactorVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#booleanFactorVariableName}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFactorVariableName(@NotNull ToolParser.BooleanFactorVariableNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#booleanFactorInt}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFactorInt(@NotNull ToolParser.BooleanFactorIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#booleanFactorInt}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFactorInt(@NotNull ToolParser.BooleanFactorIntContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(@NotNull ToolParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(@NotNull ToolParser.StringExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#stringFactorString}.
	 * @param ctx the parse tree
	 */
	void enterStringFactorString(@NotNull ToolParser.StringFactorStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#stringFactorString}.
	 * @param ctx the parse tree
	 */
	void exitStringFactorString(@NotNull ToolParser.StringFactorStringContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#booleanAnd}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAnd(@NotNull ToolParser.BooleanAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#booleanAnd}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAnd(@NotNull ToolParser.BooleanAndContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#booleanLE}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLE(@NotNull ToolParser.BooleanLEContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#booleanLE}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLE(@NotNull ToolParser.BooleanLEContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#doWhile}.
	 * @param ctx the parse tree
	 */
	void enterDoWhile(@NotNull ToolParser.DoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#doWhile}.
	 * @param ctx the parse tree
	 */
	void exitDoWhile(@NotNull ToolParser.DoWhileContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#booleanFactorFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFactorFunctionCall(@NotNull ToolParser.BooleanFactorFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#booleanFactorFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFactorFunctionCall(@NotNull ToolParser.BooleanFactorFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#exprString}.
	 * @param ctx the parse tree
	 */
	void enterExprString(@NotNull ToolParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#exprString}.
	 * @param ctx the parse tree
	 */
	void exitExprString(@NotNull ToolParser.ExprStringContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(@NotNull ToolParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(@NotNull ToolParser.MainFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#defFunctionDef}.
	 * @param ctx the parse tree
	 */
	void enterDefFunctionDef(@NotNull ToolParser.DefFunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#defFunctionDef}.
	 * @param ctx the parse tree
	 */
	void exitDefFunctionDef(@NotNull ToolParser.DefFunctionDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(@NotNull ToolParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(@NotNull ToolParser.FunctionDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#integerSubtraction}.
	 * @param ctx the parse tree
	 */
	void enterIntegerSubtraction(@NotNull ToolParser.IntegerSubtractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#integerSubtraction}.
	 * @param ctx the parse tree
	 */
	void exitIntegerSubtraction(@NotNull ToolParser.IntegerSubtractionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull ToolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull ToolParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#integerProductFactor}.
	 * @param ctx the parse tree
	 */
	void enterIntegerProductFactor(@NotNull ToolParser.IntegerProductFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#integerProductFactor}.
	 * @param ctx the parse tree
	 */
	void exitIntegerProductFactor(@NotNull ToolParser.IntegerProductFactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#booleanLower}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLower(@NotNull ToolParser.BooleanLowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#booleanLower}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLower(@NotNull ToolParser.BooleanLowerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#booleanFactorParenthesis}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFactorParenthesis(@NotNull ToolParser.BooleanFactorParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#booleanFactorParenthesis}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFactorParenthesis(@NotNull ToolParser.BooleanFactorParenthesisContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#codeFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterCodeFunctionCall(@NotNull ToolParser.CodeFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#codeFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitCodeFunctionCall(@NotNull ToolParser.CodeFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#codeAssignment}.
	 * @param ctx the parse tree
	 */
	void enterCodeAssignment(@NotNull ToolParser.CodeAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#codeAssignment}.
	 * @param ctx the parse tree
	 */
	void exitCodeAssignment(@NotNull ToolParser.CodeAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#codeVariableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCodeVariableDefinition(@NotNull ToolParser.CodeVariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#codeVariableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCodeVariableDefinition(@NotNull ToolParser.CodeVariableDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#integerFactorFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterIntegerFactorFunctionCall(@NotNull ToolParser.IntegerFactorFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#integerFactorFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitIntegerFactorFunctionCall(@NotNull ToolParser.IntegerFactorFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(@NotNull ToolParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(@NotNull ToolParser.WhileContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#booleanEqual}.
	 * @param ctx the parse tree
	 */
	void enterBooleanEqual(@NotNull ToolParser.BooleanEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#booleanEqual}.
	 * @param ctx the parse tree
	 */
	void exitBooleanEqual(@NotNull ToolParser.BooleanEqualContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#codeControllStructure}.
	 * @param ctx the parse tree
	 */
	void enterCodeControllStructure(@NotNull ToolParser.CodeControllStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#codeControllStructure}.
	 * @param ctx the parse tree
	 */
	void exitCodeControllStructure(@NotNull ToolParser.CodeControllStructureContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(@NotNull ToolParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(@NotNull ToolParser.IfContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#functionDefinitionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinitionParameters(@NotNull ToolParser.FunctionDefinitionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#functionDefinitionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinitionParameters(@NotNull ToolParser.FunctionDefinitionParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#exprInteger}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(@NotNull ToolParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#exprInteger}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(@NotNull ToolParser.ExprIntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#exprVariableName}.
	 * @param ctx the parse tree
	 */
	void enterExprVariableName(@NotNull ToolParser.ExprVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#exprVariableName}.
	 * @param ctx the parse tree
	 */
	void exitExprVariableName(@NotNull ToolParser.ExprVariableNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#exprFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterExprFunctionName(@NotNull ToolParser.ExprFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#exprFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitExprFunctionName(@NotNull ToolParser.ExprFunctionNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#booleanOr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOr(@NotNull ToolParser.BooleanOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#booleanOr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOr(@NotNull ToolParser.BooleanOrContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#functionDataType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDataType(@NotNull ToolParser.FunctionDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#functionDataType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDataType(@NotNull ToolParser.FunctionDataTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#integerDivision}.
	 * @param ctx the parse tree
	 */
	void enterIntegerDivision(@NotNull ToolParser.IntegerDivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#integerDivision}.
	 * @param ctx the parse tree
	 */
	void exitIntegerDivision(@NotNull ToolParser.IntegerDivisionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinition(@NotNull ToolParser.VariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinition(@NotNull ToolParser.VariableDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void enterElseIf(@NotNull ToolParser.ElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void exitElseIf(@NotNull ToolParser.ElseIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#parameterDefinition}.
	 * @param ctx the parse tree
	 */
	void enterParameterDefinition(@NotNull ToolParser.ParameterDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#parameterDefinition}.
	 * @param ctx the parse tree
	 */
	void exitParameterDefinition(@NotNull ToolParser.ParameterDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#integerProduct}.
	 * @param ctx the parse tree
	 */
	void enterIntegerProduct(@NotNull ToolParser.IntegerProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#integerProduct}.
	 * @param ctx the parse tree
	 */
	void exitIntegerProduct(@NotNull ToolParser.IntegerProductContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#integerAddition}.
	 * @param ctx the parse tree
	 */
	void enterIntegerAddition(@NotNull ToolParser.IntegerAdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#integerAddition}.
	 * @param ctx the parse tree
	 */
	void exitIntegerAddition(@NotNull ToolParser.IntegerAdditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#booleanFactorBoolean}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFactorBoolean(@NotNull ToolParser.BooleanFactorBooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#booleanFactorBoolean}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFactorBoolean(@NotNull ToolParser.BooleanFactorBooleanContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#integerFactorVariableName}.
	 * @param ctx the parse tree
	 */
	void enterIntegerFactorVariableName(@NotNull ToolParser.IntegerFactorVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#integerFactorVariableName}.
	 * @param ctx the parse tree
	 */
	void exitIntegerFactorVariableName(@NotNull ToolParser.IntegerFactorVariableNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(@NotNull ToolParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(@NotNull ToolParser.DataTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#booleanFactorInverted}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFactorInverted(@NotNull ToolParser.BooleanFactorInvertedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#booleanFactorInverted}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFactorInverted(@NotNull ToolParser.BooleanFactorInvertedContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#integerFactor}.
	 * @param ctx the parse tree
	 */
	void enterIntegerFactor(@NotNull ToolParser.IntegerFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#integerFactor}.
	 * @param ctx the parse tree
	 */
	void exitIntegerFactor(@NotNull ToolParser.IntegerFactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#functionCallParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallParameters(@NotNull ToolParser.FunctionCallParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#functionCallParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallParameters(@NotNull ToolParser.FunctionCallParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#booleanFactorString}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFactorString(@NotNull ToolParser.BooleanFactorStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#booleanFactorString}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFactorString(@NotNull ToolParser.BooleanFactorStringContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#booleanFactor}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFactor(@NotNull ToolParser.BooleanFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#booleanFactor}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFactor(@NotNull ToolParser.BooleanFactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToolParser#integerFactorParenthesis}.
	 * @param ctx the parse tree
	 */
	void enterIntegerFactorParenthesis(@NotNull ToolParser.IntegerFactorParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToolParser#integerFactorParenthesis}.
	 * @param ctx the parse tree
	 */
	void exitIntegerFactorParenthesis(@NotNull ToolParser.IntegerFactorParenthesisContext ctx);
}