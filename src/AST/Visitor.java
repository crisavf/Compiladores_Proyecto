package AST;
public interface Visitor
{
// POR CADA CLASE CONCRETA DEL �RBOL, UN METODO PARA VISITARLO.
  
  public Object visitClassDeclBodyAST( ClassDeclBodyAST c, Object arg);
  public Object visitClassDecl2AST( ClassDecl2AST c, Object arg);
  public Object visitClassDecl3AST( ClassDecl3AST c, Object arg);
  public Object visitBodyDecl2ClassDeclAST( BodyDecl2ClassDeclAST c, Object arg);
  
  public Object visitBodyDecl2ConstDeclAST( BodyDecl2ConstDeclAST c, Object arg);
  public Object visitConstrDeclAST( ConstrDeclAST c, Object arg);
  public Object visitExpAST( ExpAST c, Object arg);
  public Object visitMainClassAST( MainClassAST c, Object arg);
  public Object visitMethodDeclAST( MethodDeclAST c, Object arg);
  public Object visitReturnExpAST( ReturnExpAST c, Object arg);
  
  public Object visitExpTypeReadAST( ExpTypeReadAST c, Object arg);
  public Object visitStatCuadExpAST( StatCuadExpAST c, Object arg);
  
  public Object visitExpListAST( ExpListAST c, Object arg);
  public Object visitStatExpListAST( StatExpListAST c, Object arg);
  public Object visitExp_SimpNegAST( Exp_SimpNegAST c, Object arg);
  public Object visitExp_SimpNewIntAST( Exp_SimpNewIntAST c, Object arg);
  public Object visitExp_SimpNewIdAST( Exp_SimpNewIdAST c, Object arg);
  public Object visitExp_SimpExpAST( Exp_SimpExpAST c, Object arg);
  public Object visitImpClssMnAST( ImpClssMnAST c, Object arg);
  public Object visitBodyDecl2MethoDeclAST( BodyDecl2MethoDeclAST c, Object arg);

  public Object visitTypeName2AST( TypeName2AST c, Object arg);
  public Object visitVarDeclAST( VarDeclAST c, Object arg);
  public Object visitDistiExpCuadrAST( DistiExpCuadrAST c, Object arg);
  public Object visitDistiExpLengthAST( DistiExpLengthAST c, Object arg);
  public Object visitDistiExpListAST( DistiExpListAST c, Object arg);
  public Object visitDistiExpOpAST( DistiExpOpAST c, Object arg);
  public Object visitBodyDecl2VarDeclAST( BodyDecl2VarDeclAST c, Object arg);
  
  public Object visitStatAsigAST( StatAsigAST c, Object arg);
  public Object visitImportDecl2AST( ImportDecl2AST c, Object arg);
  public Object visitElseStatementAST( ElseStatementAST c, Object arg);
  public Object visitStatExitAST( StatExitAST c, Object arg);
  public Object visitStatIfElseAST( StatIfElseAST c, Object arg);
  public Object visitImportDeclAST( ImportDeclAST c, Object arg);
  public Object visitStatPrintlnAST( StatPrintlnAST c, Object arg);
  public Object visitExpTypeExpAST( ExpTypeExpAST c, Object arg);
  
  
  public Object visitVarDistiExpAST( VarDistiExpAST c, Object arg);
  public Object visitCuadExpAST( CuadExpAST c, Object arg);
  public Object visitBodyDeclAST( BodyDeclAST c, Object arg);
  public Object visitVarClassDeclAST( VarClassDeclAST c, Object arg);
  public Object visitVarComaExpAST( VarComaExpAST c, Object arg);
  public Object visitFormalListAST( FormalListAST c, Object arg);
  public Object visitVarTypeIdAST( VarTypeIdAST c, Object arg);
  public Object visitVarImportDeclAST( VarImportDeclAST c, Object arg);
  public Object visitStatVarStatAST( StatVarStatAST c, Object arg);
  
  public Object visitVarStatementAST( VarStatementAST c, Object arg);
  public Object visitTypeNameAST( TypeNameAST c, Object arg);
  public Object visitVarVarDeclAST( VarVarDeclAST c, Object arg);
  public Object visitStatWhileAST( StatWhileAST c, Object arg);
  
  
  
  
  
  public Object visitOpSumAST( OpSumAST c, Object arg);  
  public Object visitOpRestAST( OpRestAST c, Object arg);  
  public Object visitOpMulAST( OpMulAST c, Object arg);  
  public Object visitOpDivAST( OpDivAST c, Object arg);  
  public Object visitOpDifeAST( OpDifeAST c, Object arg);  
  public Object visitOpCompaAST( OpCompaAST c, Object arg);  
  public Object visitOpMenorAST( OpMenorAST c, Object arg);  
  public Object visitOpMenorIgualAST( OpMenorIgualAST c, Object arg);  
  public Object visitOpMayorIgualAST( OpMayorIgualAST c, Object arg);  
  public Object visitOpOrAST( OpOrAST c, Object arg);  
  public Object visitOpAndAST( OpAndAST c, Object arg);  
  public Object visitOpMayorAST(OpMayorAST c, Object arg);
  public Object visitExp_SimpStringAST(Exp_SimpStringAST c, Object arg);
  
  public Object visitExp_SimpTrueAST(Exp_SimpTrueAST c, Object arg);
  public Object visitExp_SimpFalseAST(Exp_SimpFalseAST c, Object arg);
  public Object visitExp_SimpNumAST(Exp_SimpNumAST c, Object arg);
  public Object visitExp_SimpThisAST(Exp_SimpThisAST c, Object arg);
  public Object visitExp_SimpIdAST(Exp_SimpIdAST c, Object arg);
  
  
  public Object visitThisIdIdAST(ThisIdIdAST c, Object arg);
  public Object visitThisIdThisAST(ThisIdThisAST c, Object arg);
  
  public Object visitTypeVoidIdAST(TypeVoidIdAST c, Object arg);
  public Object visitTypeVoidVoidAST(TypeVoidVoidAST c, Object arg);
  
  public Object visitClassDecl4ImplementsAST(ClassDecl4ImplementsAST c, Object arg);
  public Object visitClassDecl4ExtendsAST(ClassDecl4ExtendsAST c, Object arg);

  
}
