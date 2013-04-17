package AST;
public interface Visitor
{
// POR CADA CLASE CONCRETA DEL �RBOL, UN METODO PARA VISITARLO.
  
  public Object visitBodyCD1AST( ClassDeclBodyAST c, Object arg);
  public Object visitCD2AST( ClassDecl2AST c, Object arg);
  public Object visitCD3AST( ClassDecl3AST c, Object arg);
  public Object visitClassDAST( BodyDecl2ClassDeclAST c, Object arg);
  
  public Object visitConstructorDAST( BodyDecl2ConstDeclAST c, Object arg);
  public Object visitDefConstrAST( ConstrDeclAST c, Object arg);
  public Object visitDefExpAST( ExpAST c, Object arg);
  public Object visitDefMainAST( MainClassAST c, Object arg);
  public Object visitDefMethodDeclAST( MethodDeclAST c, Object arg);
  public Object visitDefReturnAST( ReturnExpAST c, Object arg);
  
  public Object visitExpReadAST( ExpTypeReadAST c, Object arg);
  public Object visitExpStatAST( StatCuadExpAST c, Object arg);
  public Object visitExp_SimplTokAST( Exp_SimplTokAST c, Object arg);
  public Object visitExplAST( ExpListAST c, Object arg);
  public Object visitExplistStatAST( StatExpListAST c, Object arg);
  public Object visitExpnegAST( Exp_SimpNegAST c, Object arg);
  public Object visitExpnewIntAST( Exp_SimpNewIntAST c, Object arg);
  public Object visitExpnewidAST( Exp_SimpNewIdAST c, Object arg);
  public Object visitExpredAST( Exp_SimpExpAST c, Object arg);
  public Object visitImpClssMnAST( ImpClssMnAST c, Object arg);
  public Object visitMethodDAST( BodyDecl2MethoDeclAST c, Object arg);
  public Object visitOpTAST( OpAST c, Object arg);
  public Object visitTNamesAST( TypeName2AST c, Object arg);
  public Object visitTididAST( VarDeclAST c, Object arg);
  public Object visitTipoCuadrAST( DistiExpCuadrAST c, Object arg);
  public Object visitTipoLengthAST( DistiExpLengthAST c, Object arg);
  public Object visitTipoListaAST( DistiExpListAST c, Object arg);
  public Object visitTipoOpAST( DistiExpOpAST c, Object arg);
  public Object visitVariableDAST( BodyDecl2VarDeclAST c, Object arg);
  
  public Object visitasigStatAST( StatAsigAST c, Object arg);
  public Object visitconExtendsoImplementsAST( ClassDecl4AST c, Object arg);
  public Object visitconIdoVoidAST( TypeVoidAST c, Object arg);
  public Object visitconPuntoAsteriscoAST( ImportDecl2AST c, Object arg);
  public Object visitconThisoIdAST( ThisIdAST c, Object arg);
  public Object visitelseStatAST( ElseStatementAST c, Object arg);
  public Object visitexitStatAST( StatExitAST c, Object arg);
  public Object visitifelseStatAST( StatIfElseAST c, Object arg);
  public Object visitimpTypeAST( ImportDeclAST c, Object arg);
  public Object visitprintlnStatAST( StatPrintlnAST c, Object arg);
  public Object visitsolaExpAST( ExpTypeExpAST c, Object arg);
  
  
  public Object visittipExpAST( VarDistiExpAST c, Object arg);
  public Object visitunaExpAST( CuadExpAST c, Object arg);
  public Object visitvarBodyDeclAST( BodyDeclAST c, Object arg);
  public Object visitvarClassDeclsAST( VarClassDeclAST c, Object arg);
  public Object visitvarExpListsAST( VarComaExpAST c, Object arg);
  public Object visitvarFormalListAST( FormalListAST c, Object arg);
  public Object visitvarFormalListsAST( VarTypeIdAST c, Object arg);
  public Object visitvarImportAST( VarImportDeclAST c, Object arg);
  public Object visitvarStatAST( StatVarStatAST c, Object arg);
  
  public Object visitvarStatementsAST( VarStatementAST c, Object arg);
  public Object visitvarTypeNameAST( TypeNameAST c, Object arg);
  public Object visitvarVarDeclsAST( VarVarDeclAST c, Object arg);
  public Object visitwhileStatAST( StatWhileAST c, Object arg);  

}
