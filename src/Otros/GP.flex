import java_cup.runtime.*;
%%

%class Scanner
%unicode
%public
%ignorecase
/*%debug*/
%cup             //para que funcione con el parser
%line
%column
%type Symbol
%scanerror Exception
//%function nextToken   

%eofval{
	return symbol(sym.EOF,new String("EOF"));
%eofval}

%{
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }
  boolean errorScanner=false;
  String datos="";
  String datos2="";
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

<YYINITIAL> "INT"    	    	{   datos+="- Lexema:'"+yytext()+"' - Token:'INT':- Valor:'"+sym.TINT+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'INT':- Valor:'"+sym.TINT+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.TINT,yytext()); }
<YYINITIAL> "STRING[]"            {   datos+="- Lexema:'"+yytext()+"' - Token:'STRING':- Valor:'"+sym.TSTRING+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'STRING':- Valor:'"+sym.TSTRING+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.TSTRING,yytext()); }
<YYINITIAL> "BOOLEAN"           {   datos+="- Lexema:'"+yytext()+"' - Token:'BOOLEAN':- Valor:'"+sym.TBOOL+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'BOOLEAN':- Valor:'"+sym.TBOOL+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.TBOOL,yytext()); }
/*<YYINITIAL> "CHAR"            { 
                                    datos+=- Lexema:'"+yytext()+"' - Token:'CHAR':- Valor:'"+sym.TCHAR+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'CHAR':- Valor:'"+sym.TCHAR+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.TCHAR,yytext()); }
*/
<YYINITIAL> "WHILE"             {   datos+="- Lexema:'"+yytext()+"' - Token:'WHILE':- Valor:'"+sym.CICLO+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'WHILE':- Valor:'"+sym.CICLO+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.CICLO,yytext());}
<YYINITIAL> "IMPORT"            {   datos+="- Lexema:'"+yytext()+"' - Token:'IMPORT':- Valor:'"+sym.IMPORT+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'IMPORT':- Valor:'"+sym.IMPORT+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.IMPORT,yytext());}
<YYINITIAL> "PUBLIC"            {   datos+="- Lexema:'"+yytext()+"' - Token:'PUBLIC':- Valor:'"+sym.PUBLIC+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'PUBLIC':- Valor:'"+sym.PUBLIC+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.PUBLIC,yytext());}
<YYINITIAL> "STATIC"            {   datos+="- Lexema:'"+yytext()+"' - Token:'STATIC':- Valor:'"+sym.STATIC+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'STATIC':- Valor:'"+sym.STATIC+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.STATIC,yytext());}
<YYINITIAL> "VOID"              {   datos+="- Lexema:'"+yytext()+"' - Token:'VOID':- Valor:'"+sym.VOID+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'VOID':- Valor:'"+sym.VOID+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.VOID,yytext());}
<YYINITIAL> "MAIN"              {   datos+="- Lexema:'"+yytext()+"' - Token:'MAIN':- Valor:'"+sym.MAIN+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'MAIN':- Valor:'"+sym.MAIN+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.MAIN,yytext());}
<YYINITIAL> "EXTENDS"           {   datos+="- Lexema:'"+yytext()+"' - Token:'EXTENDS':- Valor:'"+sym.EXTENDS+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'EXTENDS':- Valor:'"+sym.EXTENDS+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.EXTENDS,yytext());}
<YYINITIAL> "IMPLEMENTS"        {   datos+="- Lexema:'"+yytext()+"' - Token:'IMPLEMENTS':- Valor:'"+sym.IMPLEMENTS+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'IMPLEMENTS':- Valor:'"+sym.IMPLEMENTS+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.IMPLEMENTS,yytext());}
<YYINITIAL> "RETURN"            {   datos+="- Lexema:'"+yytext()+"' - Token:'RETURN':- Valor:'"+sym.RETURN+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'RETURN':- Valor:'"+sym.RETURN+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.RETURN,yytext());}
<YYINITIAL> "SYSTEM"            {   datos+="- Lexema:'"+yytext()+"' - Token:'SYSTEM':- Valor:'"+sym.SYSTEM+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'SYSTEM':- Valor:'"+sym.SYSTEM+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.SYSTEM,yytext());}
<YYINITIAL> "OUT"               {   datos+="- Lexema:'"+yytext()+"' - Token:'OUT':- Valor:'"+sym.OUT+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'OUT':- Valor:'"+sym.OUT+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.OUT,yytext());}
<YYINITIAL> "PRINTLN"           {   datos+="- Lexema:'"+yytext()+"' - Token:'PRINTLN':- Valor:'"+sym.PRINTLN+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'PRINTLN':- Valor:'"+sym.PRINTLN+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.PRINTLN,yytext());}
<YYINITIAL> "CLASS"             {   datos+="- Lexema:'"+yytext()+"' - Token:'CLASS':- Valor:'"+sym.CLASS+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'CLASS':- Valor:'"+sym.CLASS+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol (sym.CLASS,yytext());} 
  
<YYINITIAL> "IF"                {   datos+="- Lexema:'"+yytext()+"' - Token:'IF':- Valor:'"+sym.CONDI+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'IF':- Valor:'"+sym.CONDI+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.CONDI,yytext());}
<YYINITIAL> "ELSE"              {   datos+="- Lexema:'"+yytext()+"' - Token:'ELSE':- Valor:'"+sym.SINO+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'ELSE':- Valor:'"+sym.SINO+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.SINO,yytext());}
<YYINITIAL> "LENGTH"            {   datos+="- Lexema:'"+yytext()+"' - Token:'LENGTH':- Valor:'"+sym.LENGTH+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'LENGTH':- Valor:'"+sym.LENGTH+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.LENGTH,yytext());}   	
<YYINITIAL> "TRUE"              {   datos+="- Lexema:'"+yytext()+"' - Token:'TRUE':- Valor:'"+sym.TRUE+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'TRUE':- Valor:'"+sym.TRUE+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.TRUE,yytext());}
<YYINITIAL> "FALSE"             {   datos+="- Lexema:'"+yytext()+"' - Token:'FALSE':- Valor:'"+sym.FALSE+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'FALSE':- Valor:'"+sym.FALSE+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.FALSE,yytext());}
<YYINITIAL> "THIS"              {   datos+="- Lexema:'"+yytext()+"' - Token:'THIS':- Valor:'"+sym.THIS+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'THIS':- Valor:'"+sym.THIS+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.THIS,yytext());}  
<YYINITIAL> "NEW"               {   datos+="- Lexema:'"+yytext()+"' - Token:'NEW':- Valor:'"+sym.NEW+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'NEW':- Valor:'"+sym.NEW+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.NEW,yytext());}
<YYINITIAL> "IN"                {   datos+="- Lexema:'"+yytext()+"' - Token:'IN':- Valor:'"+sym.IN+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'IN':- Valor:'"+sym.IN+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.IN,yytext());}
<YYINITIAL> "READ"              {   datos+="- Lexema:'"+yytext()+"' - Token:'READ':- Valor:'"+sym.READ+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'READ':- Valor:'"+sym.READ+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.READ,yytext());}
<YYINITIAL> "EXIT"              {   datos+="- Lexema:'"+yytext()+"' - Token:'EXIT':- Valor:'"+sym.EXIT+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'EXIT':- Valor:'"+sym.EXIT+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.EXIT,yytext());}


<YYINITIAL> {
  /* identificadores */ 
  {Identifier}                   {  datos+="- Lexema:'"+yytext()+"' - Token:'ID':- Valor:'"+sym.ID+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'ID':- Valor:'"+sym.ID+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.ID,yytext()); }
 
  /* literales enteros positivos */
{DecIntegerLiteral}            {    datos+="- Lexema:'"+yytext()+"' - Token:'NUM':- Valor:'"+sym.NUM+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'NUM':- Valor:'"+sym.NUM+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.NUM,yytext()); }
  \"                           { string.setLength(0); yybegin(STRING); }
  
  /*{Char}                     {    datos+="- Lexema:'"+yytext()+"' - Token:'TCHAR':- Valor:'"+sym.TCHAR+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'TCHAR':- Valor:'"+sym.TCHAR+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.TCHAR,yytext()); }*/


  /* operadores */
  "+"                            {  datos+="- Lexema:'"+yytext()+"' - Token:'+':- Valor:'"+sym.SUMA+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'+':- Valor:'"+sym.SUMA+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.SUMA,yytext()); }
  "-"                            {  datos+="- Lexema:'"+yytext()+"' - Token:'-':- Valor:'"+sym.REST+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'-':- Valor:'"+sym.REST+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.REST,yytext()); }
  "/"                            {  datos+="- Lexema:'"+yytext()+"' - Token:'/':- Valor:'"+sym.DIV+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'/':- Valor:'"+sym.DIV+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.DIV,yytext()); }
  "*"                            {  datos+="- Lexema:'"+yytext()+"' - Token:'*':- Valor:'"+sym.MULT+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'*':- Valor:'"+sym.MULT+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.MULT,yytext()); }

  "="                            {  datos+="- Lexema:'"+yytext()+"' - Token:'=':- Valor:'"+sym.ASIGN+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'=':- Valor:'"+sym.ASIGN+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.ASIGN,yytext()); }
  "!"                            {  datos+="- Lexema:'"+yytext()+"' - Token:'!':- Valor:'"+sym.NEG+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'!':- Valor:'"+sym.NEG+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.NEG,yytext()); }
  "!="                           {  datos+="- Lexema:'"+yytext()+"' - Token:'!=':- Valor:'"+sym.DIFE+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'!=':- Valor:'"+sym.DIFE+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.DIFE,yytext()); }
  "||"                           {  datos+="- Lexema:'"+yytext()+"' - Token:'||':- Valor:'"+sym.OR+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'||':- Valor:'"+sym.OR+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.OR,yytext()); }
  "&&"                           {  datos+="- Lexema:'"+yytext()+"' - Token:'&&':- Valor:'"+sym.CLASS+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'&&':- Valor:'"+sym.CLASS+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.AND,yytext()); }
  "=="                           {  datos+="- Lexema:'"+yytext()+"' - Token:'==':- Valor:'"+sym.COMPA+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'==':- Valor:'"+sym.COMPA+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.COMPA,yytext()); }
  "<"                            {  datos+="- Lexema:'"+yytext()+"' - Token:'<':- Valor:'"+sym.MENOR+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'<':- Valor:'"+sym.MENOR+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.MENOR,yytext()); }
  ">"                            {  datos+="- Lexema:'"+yytext()+"' - Token:'>':- Valor:'"+sym.MAYOR+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'>':- Valor:'"+sym.MAYOR+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.MAYOR,yytext()); }
  "<="                           {  datos+="- Lexema:'"+yytext()+"' - Token:'<=':- Valor:'"+sym.MENORIGUAL+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'<=':- Valor:'"+sym.MENORIGUAL+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.MENORIGUAL,yytext()); }
  ">="                           {  datos+="- Lexema:'"+yytext()+"' - Token:'=>':- Valor:'"+sym.MAYORIGUAL+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'=>':- Valor:'"+sym.MAYORIGUAL+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.MAYORIGUAL,yytext()); }
  

  /* otros simbolos v�lidos */
  "("                            {  datos+="- Lexema:'"+yytext()+"' - Token:'(':- Valor:'"+sym.PARENRedI+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'(':- Valor:'"+sym.PARENRedI+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.PARENRedI,yytext()); }
  ")"                            {  datos+="- Lexema:'"+yytext()+"' - Token:')':- Valor:'"+sym.PARENRedD+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:')':- Valor:'"+sym.PARENRedD+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.PARENRedD,yytext()); }
  "["                            {  datos+="- Lexema:'"+yytext()+"' - Token:'[':- Valor:'"+sym.PARENCuaI+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'[':- Valor:'"+sym.PARENCuaI+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.PARENCuaI,yytext()); }
  "]"                            {  datos+="- Lexema:'"+yytext()+"' - Token:']':- Valor:'"+sym.PARENCuaD+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:']':- Valor:'"+sym.PARENCuaD+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.PARENCuaD,yytext()); }
  "{"                            {  datos+="- Lexema:'"+yytext()+"' - Token:'{':- Valor:'"+sym.PARENCurI+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'{':- Valor:'"+sym.PARENCurI+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.PARENCurI,yytext()); }
  "}"                            {  datos+="- Lexema:'"+yytext()+"' - Token:'}':- Valor:'"+sym.PARENCurD+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                   System.out.println("- Lexema:'"+yytext()+"' - Token:'}':- Valor:'"+sym.PARENCurD+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.PARENCurD,yytext()); }
  "."                            {  datos+="- Lexema:'"+yytext()+"' - Token:'.':- Valor:'"+sym.PUNTO+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'.':- Valor:'"+sym.PUNTO+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.PUNTO,yytext()); }
  ";"                            {  datos+="- Lexema:'"+yytext()+"' - Token:';':- Valor:'"+sym.PUNTOyCOMA+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:';':- Valor:'"+sym.PUNTOyCOMA+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.PUNTOyCOMA,yytext()); }
  ","                            {  datos+="- Lexema:'"+yytext()+"' - Token:',':- Valor:'"+sym.COMA+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:',':- Valor:'"+sym.COMA+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.COMA,yytext()); }
  ".*"				 {  datos+="- Lexema:'"+yytext()+"' - Token:'.*':- Valor:'"+sym.PUNTOyASTERISCO+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                    System.out.println("- Lexema:'"+yytext()+"' - Token:'.*':- Valor:'"+sym.PUNTOyASTERISCO+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                    return symbol(sym.PUNTOyASTERISCO,yytext()); }
  "/*"                           { countComment++;yybegin(NESTEDCOMMENT);}
  

  /* commentarios */
  {Comment}                      { /* ignore */ } /*ya no se hace porque se realiza abajo */
 
  /* espacios en blanco */
  {WhiteSpace}                   { /* ignore */ }
}

<STRING> {
  \"                             { yybegin(YYINITIAL);
                                   datos+="- Lexema:'"+yytext()+"' - Token:'STRING':- Valor:'"+sym.STRING+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
                                   System.out.println("- Lexema:'"+yytext()+"' - Token:'STRING':- Valor:'"+sym.STRING+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
                                   return symbol(sym.STRING, string.toString()); }
  [^\n\r\"\\]+                   { string.append( yytext() ); }
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
.|\n                             {datos2+="\n[Error Scanner] Caracter no permitido '"+yytext()+"' - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n";
          /*System.out.println("Error caracter inv�lido: <" + yytext() + "> en fila: " + yyline + " columna: " + yycolumn );*/
                                   errorScanner=true;
				   //throw new Error("\n[Error Scanner] Caracter no permitido '"+yytext()+" - Fila:'"+yyline+" - Columna:'"+yycolumn+"'\n");
          }