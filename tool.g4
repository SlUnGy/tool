grammar tool;

start: program;

program: haupt ;

haupt: 'haupt' '{' code* '}' ;

code: variablen_def
	| variablen_zuweisung ';' ;

variablen_zuweisung: NAME '=' ausdruck ;

ausdruck: int_ausdruck
	| bool_ausdruck;

int_ausdruck: produkt (('+' | '-') produkt)*;

produkt: faktor (('*' | '/') faktor)*;

faktor: '(' int_ausdruck ')'
	| NAME
	| WERT;
	
bool_ausdruck: '(' bool_ausdruck ')'
		| BOOLEAN;

variablen_def: variablen_typ NAME';'
		| variablen_typ variablen_zuweisung';' ;


variablen_typ: 'int'
		| 'bool';

WS: [ \r\t\n]+ -> skip;
NAME: [a-zA-Z]+ ;
WERT: ZAHL|BOOLEAN;
BOOLEAN: 'true'|'false' ;
ZAHL: [1-9][0-9]* | '0';
