grammar Tool;

start: before=def_list? m=main after=def_list?#program;

def_list: definition=def next=def_list?#definitionList;

main: MAIN L_PAREN R_PAREN L_C_BRACE instructions=code* R_C_BRACE#mainFunction;

def: variableDef=var_def SEMICOLON
	| functionDef=func_def
	;

code: instruction=var_def SEMICOLON #codeVariableDefinition
	| instruction=assignment SEMICOLON #codeAssignment
	| instruction=func_call SEMICOLON #codeFunctionCall
	| instruction=contr_structure #codeControllStructure
	;

contr_structure: IF L_PAREN if_condition=bool_expr R_PAREN L_C_BRACE if_instructions=code+ R_C_BRACE ( ELSEIF L_PAREN elif_condigion=bool_expr R_PAREN L_C_BRACE elif_instructions=code+ R_C_BRACE )* ( ELSE L_C_BRACE else_instructions=code+ R_C_BRACE )? #if
		| DO_WHILE L_C_BRACE instructions=code+ R_C_BRACE L_PAREN condition=bool_expr R_PAREN SEMICOLON #doWhile
		| WHILE L_PAREN condition=bool_expr R_PAREN L_C_BRACE instructions=code+ R_C_BRACE #while
		;

assignment: variableName=NAME ASSIGN_TO value=expr #assignTo;

expr: e=var_name #exprVariableName
	| e=func_call #exprFunctionName
	| e=int_expr #exprInteger
	| e=str_expr #exprString
	| e=bool_expr #exprBoolean
	; 

var_name: name=NAME #variableName;

int_expr: left=product right=int_expr_right? #integerExpression;
int_expr_right: operator=('+' | '-') right=int_expr #integerExpressionRight;

product: left=int_faktor right=product_right? #productCalc;
product_right: operator=('*' | '/') right=product #productRight;

int_faktor: L_PAREN e=int_expr R_PAREN #integerFaktorParenthesis
	| e=func_call #integerFaktorFunctionCall
	| e=var_name #integerFaktorVariableName
	| e=NUMBER #integerFaktor
	;
	
bool_expr: left=bool_faktor right=bool_expr_right?#booleanExpression;
bool_expr_right: operator=('<' | '>' | '<=' | '>=' | '==' | '!=' | '||' | '&&') right=bool_expr#booleanExpressionRight;

bool_faktor: L_PAREN bool_expr R_PAREN #booleanFaktorParenthesis
		| INVERT bool_expr #booleanFaktorInverted
		| func_call #booleanFaktorFunctionCall
		| int_expr #booleanFaktorInt
		| str_expr #booleanFaktorString
		| var_name #booleanFaktorVariableName
		| BOOLEAN #booleanFaktorBoolean;

str_expr: left=str_faktor right=str_expr_right? #stringExpression;
str_expr_right: CAT right=str_expr #stringExpressionRight;

str_faktor: L_PAREN str_expr R_PAREN #stringFaktorParenthesis
		| func_call #stringFaktorFunctionCall
		| STRING #stringFaktorString;

var_def: type=var_data_type  variableName=NAME (ASSIGN_TO value=expr)? #variableDefinition; 

var_data_type: type=TYPE_INT #dataType
		| type=TYPE_BOOL #dataType
		| type=TYPE_STRING #dataType
		;

func_data_type:	var_data_type #functionDataType 
		| type=TYPE_VOID #functionDataType
		;

func_def: DEFINE type=func_data_type fn_name=NAME L_PAREN parameter_list=func_def_params? R_PAREN L_C_BRACE instructions=code* R_C_BRACE #functionDefinition;

func_def_params: param=parameter ( COMMA rest=func_def_params )?#functionDefinitionParameters;

func_call: fn_name=NAME L_PAREN parameters=func_call_params?  R_PAREN #functionCall;

func_call_params: param=expr ( COMMA rest=func_call_params )?#functionCallParameters;

parameter: type=var_data_type name=NAME#parameterDefinition;

L_PAREN: '(';
R_PAREN: ')';
R_C_BRACE: '}';
L_C_BRACE: '{';
SEMICOLON: ';';
COMMA: ',';
ASSIGN_TO: '=';
CAT: '+';

INVERT: '!';

MAIN: '_haupt';

IF: '_wenn';
ELSEIF: '_oder_dies';
ELSE: '_sonst';

DO_WHILE: '_solange_bis';
WHILE: '_schleife';

DEFINE: '_definiere';

TYPE_INT: 'int';
TYPE_BOOL: 'bool';
TYPE_STRING: 'str';

/* for functions */
TYPE_VOID: 'leer';

NAME: [a-zA-Z]+;
STRING: '"' .*? '"'; 
BOOLEAN: '_true' | '_false';
NUMBER: [1-9][0-9]* | '0';

COMMENT: '/*' .*? '*/' -> skip;
WS: [ \r\t\n]+ -> skip;
