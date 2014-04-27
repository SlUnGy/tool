/*
	Bonusziele:
		-Strings
		-Debuginformationen
*/

/* Variablen & Funktions-Definition*/
int i = 1;
str mussManWissen="Schwarze Sonne -> anfang";
bool b = _true;
str nanana = "loool";

/* "leer" entspricht "void" typ, der Ort der Definition ist jedoch nicht wichtig. Das heißt Funktionen können auch nach der "Main" deklariert werden.*/
_definiere leer druckeWas(){
	sprich(mussManWissen);
	return();
}
_definiere bool gebeB(int pA, int pB){
	return(b);
}




/* Kontrollstrukturen & Funktions-Aufruf */
_definiere leer Kontrollstrukturen(){
	_wenn( i == 1 ){ /* "_wenn" entspricht if */
		druckeWas(); /* druckt "Schwarze Sonne" aufs stdout */
	}
	_oder_dies( !gebeB(1, 2) ) {/* "_oder_dies" entspricht else-if */
		i = 2;
	}
	_sonst { /* sonst entspricht else*/
		i = 3;
	}
	sprich(toStr(i)); /* druckt "1" */
	return();
}


/* schleifen und ausgabe auf stdout */
_definiere leer Schleifen(){
	_solange_bis { /* gegenstück zu "do while" */
		i = 1 + i;
		sprich(toStr(i) + " "); /* String zusammenfügen wie in Java */
	}(i <= 10);
	/* druckt "2 3 4 5 6 7 8 9 10 " */
	
	_schleife(i>1){ /* "while" equivalent */
		i = i - (1 * 1);
		sprich(toStr(i) + " ");
	}
	/* druckt "9 8 7 6 5 4 3 2 1 "*/
}


/* scopes test */
_definiere leer Scopes(){
	int i = 0;
	_wenn( _true ){
		i = 1000; /* überschreibt nicht die global definierte Variable "i", sondern ist nur hier gültig */
	}
	sprich(toStr(i));
	/* druckt "1"*/
}

/* "main" gegenstück */
_haupt () {
	Kontrollstrukturen();
	Schleifen();
	Scopes();
	int local = 21;
	gebeB(1 , 3);
	bool localb;
	localb = _true;
	local = local + local;
	
	str asd = nanana + " " + mussManWissen + ( toStr(unbenutzt) + ";" ) ;
	nanana = asd + "qwert";
}

int unbenutzt = 3;
str nonono = "ende";
