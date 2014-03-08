grammar tool;

start: def* haupt def*;

haupt: 'haupt' '{' code* '}';

def: variablen_def ';'
	| funktions_def;

code: variablen_def ';'
	| zuweisung ';'
	| funktions_aufruf ';';

zuweisung: NAME '=' ausdruck;

ausdruck: int_ausdruck 
	| bool_ausdruck;

int_ausdruck: produkt (('+' | '-') produkt)*;

produkt: int_faktor (('*' | '/') int_faktor)*;

int_faktor: '(' int_ausdruck ')'
	| funktions_aufruf
	| NAME
	| ZAHL;
	
bool_ausdruck: bool_faktor (('<' | '>' | '<=' | '>=' | '==' | '!=' | '||' | '&&') bool_faktor)*;

bool_faktor: '(' bool_ausdruck ')'
		| '!' bool_ausdruck
		| funktions_aufruf
		| int_ausdruck
		| NAME
		| BOOLEAN;

variablen_def: daten_typ ( NAME | zuweisung );

daten_typ: 'int' | 'bool';

funktions_def: 'definiere' daten_typ NAME '(' (parameter (',' parameter)*)? ')' '{' code* '}';

funktions_aufruf: NAME '(' ( ausdruck (',' ausdruck)* )?  ')';

parameter: daten_typ NAME ;

WS: [ \r\t\n]+ -> skip;
NAME: [a-zA-Z]+ ;
BOOLEAN: '_true' | '_false' ;
ZAHL: [1-9][0-9]* | '0';
