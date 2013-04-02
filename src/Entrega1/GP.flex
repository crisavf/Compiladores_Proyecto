/**
 * Scanner para la gram�tica de prueba del curso de Compiladores e Int�rpretes.
 * Walter Chavarria Mora 201128928
 */
%%

%class Scanner
%unicode
%ignorecase
/*%debug*/
%cup             //para que funcione con el parser
%line
%column
%type Symbol
%function nextToken

%eofval{
	return symbol("Final De Archivo",sym.EOF,yytext());
%eofval}

%{
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }

  private Symbol symbol(String token, int type, Object value) {
    return new Symbol(token ,type, yyline, yycolumn, value);
  }
  
  int countComment=0;
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

/* comments */
Comment =   {EndOfLineComment}

EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}

Identifier = [:jletter:] [:jletterdigit:]* | [$][:jletter:][:jletterdigit:]* | _[:jletter:][:jletterdigit:]* 

DecIntegerLiteral = 0 | 0.[0-9][0-9]* | [1-9][0-9]* | [1-9][0-9]*.[0-9][0-9]*

//Char = '[:jletter:]'

%state STRING
%state NESTEDCOMMENT
%%

/* Palabras reservadas */

<YYINITIAL> "INT"    	    	{ return symbol("Tipo Dato",sym.TINT,yytext()); }
<YYINITIAL> "STRING"            { return symbol("Tipo Dato",sym.TSTRING,yytext()); }
<YYINITIAL> "BOOLEAN"           { return symbol("Tipo Dato",sym.TBOOL,yytext()); }
//<YYINITIAL> "CHAR"            { return symbol("Tipo Dato",sym.TCHAR,yytext()); }
<YYINITIAL> "WHILE"             { return symbol("Palabra Reservada",sym.CICLO,yytext());}
<YYINITIAL> "IMPORT"            { return symbol("Palabra Reservada",sym.IMPORT,yytext());}
<YYINITIAL> "PUBLIC"            { return symbol("Palabra Reservada",sym.PUBLIC,yytext());}
<YYINITIAL> "STATIC"            { return symbol("Palabra Reservada",sym.STATIC,yytext());}
<YYINITIAL> "VOID"              { return symbol("Palabra Reservada",sym.VOID,yytext());}
<YYINITIAL> "MAIN"              { return symbol("Palabra Reservada",sym.MAIN,yytext());}
<YYINITIAL> "EXTENDS"           { return symbol("Palabra Reservada",sym.EXTENDS,yytext());}
<YYINITIAL> "IMPLEMENTS"        { return symbol("Palabra Reservada",sym.IMPLEMENTS,yytext());}
<YYINITIAL> "RETURN"            { return symbol("Palabra Reservada",sym.RETURN,yytext());}
<YYINITIAL> "SYSTEM"            { return symbol("Palabra Reservada",sym.SYSTEM,yytext());}
<YYINITIAL> "OUT"               { return symbol("Palabra Reservada",sym.OUT,yytext());}
<YYINITIAL> "PRINTLN"           { return symbol("Palabra Reservada",sym.PRINTLN,yytext());}
<YYINITIAL> "CLASS"             { return symbol ("Palabra Reservada",sym.CLASS,yytext());} 
  
<YYINITIAL> "IF"                { return symbol("Palabra Reservada",sym.CONDI,yytext());}
<YYINITIAL> "ELSE"              { return symbol("Palabra Reservada",sym.SINO,yytext());}
<YYINITIAL> "LENGTH"            { return symbol("Palabra Reservada",sym.LENGTH,yytext());}   	
<YYINITIAL> "TRUE"              { return symbol("Palabra Reservada",sym.TRUE,yytext());}
<YYINITIAL> "FALSE"             { return symbol("Palabra Reservada",sym.FALSE,yytext());}
<YYINITIAL> "THIS"              { return symbol("Palabra Reservada",sym.THIS,yytext());}  
<YYINITIAL> "NEW"               { return symbol("Palabra Reservada",sym.NEW,yytext());}
<YYINITIAL> "IN"                { return symbol("Palabra Reservada",sym.IN,yytext());}
<YYINITIAL> "READ"              { return symbol("Palabra Reservada",sym.READ,yytext());}
<YYINITIAL> "EXIT"              { return symbol("Palabra Reservada",sym.EXIT,yytext());}


<YYINITIAL> {
  /* identificadores */ 
  {Identifier}                   { return symbol("Identificador",sym.ID,yytext()); }
 
  /* literales enteros positivos */
  {DecIntegerLiteral}            { return symbol("Numero",sym.NUM,yytext()); }
  \"                             { string.setLength(0); yybegin(STRING); }
  
  /*{Char}                         { return symbol(sym.TCHAR,yytext()); }*/


  /* operadores */
  "+"                            { return symbol("Operador",sym.SUMA,yytext()); }
  "-"                            { return symbol("Operador",sym.REST,yytext()); }
  "/"                            { return symbol("Operador",sym.DIV,yytext()); }
  "*"                            { return symbol("Operador",sym.MULT,yytext()); }

  "="                            { return symbol("Operador",sym.ASIGN,yytext()); }
  "!"                            { return symbol("Operador",sym.NEG,yytext()); }
  "!="                           { return symbol("Operador",sym.DIFE,yytext()); }
  "||"                           { return symbol("Operador",sym.OR,yytext()); }
  "&&"                           { return symbol("Operador",sym.AND,yytext()); }
  "=="                           { return symbol("Operador",sym.COMPA,yytext()); }
  "<"                            { return symbol("Operador",sym.MENOR,yytext()); }
  ">"                            { return symbol("Operador",sym.MAYOR,yytext()); }
  "<="                           { return symbol("Operador",sym.MENORIGUAL,yytext()); }
  ">="                           { return symbol("Operador",sym.MAYORIGUAL,yytext()); }
  

  /* otros simbolos v�lidos */
  "("                            { return symbol("Simbolo Auxiliar",sym.PARENRedI,yytext()); }
  ")"                            { return symbol("Simbolo Auxiliar",sym.PARENRedD,yytext()); }
  "["                            { return symbol("Simbolo Auxiliar",sym.PARENCuaI,yytext()); }
  "]"                            { return symbol("Simbolo Auxiliar",sym.PARENCuaD,yytext()); }
  "{"                            { return symbol("Simbolo Auxiliar",sym.PARENCurI,yytext()); }
  "}"                            { return symbol("Simbolo Auxiliar",sym.PARENCurD,yytext()); }
  "."                            { return symbol("Simbolo Auxiliar",sym.PUNTO,yytext()); }
  ";"                            { return symbol("Simbolo Auxiliar",sym.PUNTOyCOMA,yytext()); }
  ","                            { return symbol("Simbolo Auxiliar",sym.COMA,yytext()); }
  ".*"				 { return symbol("Simbolo Auxiliar",sym.PUNTOyASTERISCO,yytext()); }
  "/*"                           { countComment++;yybegin(NESTEDCOMMENT);}
  

  /* commentarios */
  {Comment}                      { /* ignore */ } /*ya no se hace porque se realiza abajo */
 
  /* espacios en blanco */
  {WhiteSpace}                   { /* ignore */ }
}

<STRING> {
  \"                             { yybegin(YYINITIAL); 
                                   return symbol("Cadena",sym.STRING, string.toString()); }
  [^\n\r\"\\]+                   { string.append( yytext()); }
  \\t                            { string.append('\t'); }
  \\n                            { string.append('\n'); }

  \\r                            { string.append('\r'); }
  \\\"                           { string.append('\"'); }
  \\                             { string.append('\\'); }
}

<NESTEDCOMMENT>{
	"/*"    {countComment++;}
	"*/"	{countComment--;if(countComment==0){yybegin(YYINITIAL);}}
        [^]	{/*Ignore*/}
}

/* caracteres no v�lidos */
.|\n                             { 
                                   String error="[Error de Scanner] Caracter inválido: <" + yytext() + "> en fila: " + yyline + " columna: " + yycolumn;
                                   return symbol(error,sym.error,yytext());
                                    }