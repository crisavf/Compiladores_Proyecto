package Entrega2;

import AST.*;

//Implementa los m�todos para imprimir el AST utilizando Visitors
public class PrettyPrintAST implements Visitor
{
   
  public void imprimir(AAST raiz)
  {
    raiz.visit(this,new Integer(0));
  }
  
  public void printtab(int n)
  {
    for(int num=n; num != 0; num--)
      System.out.print("+++");
    System.out.print(">");
  }
  
  
  
  // TODOS LOS M�TODOS PARA IMPRIMIR EL AST
  public Object visitBodyCD1AST( ClassDeclBodyAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  
  /*Faltan los strings*/
  public Object visitCD2AST( ClassDecl2AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }    
    return null;
  }
  
  /*Faltan*/
  public Object visitCD3AST( ClassDecl3AST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }    
    return null;
  }
  
  
  public Object visitClassDAST( BodyDecl2ClassDeclAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }    
    return null;
  }
  
  
  public Object visitConstructorDAST( BodyDecl2ConstDeclAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }    
    return null;
  }
  
  
  public Object visitDefConstrAST( ConstrDeclAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }    
    if(c.h3!=null)
      c.h3.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }     
    return null;
  }
  
  public Object visitDefExpAST( ExpAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    } 
    return null;
  }
  
   public Object visitDefMainAST( MainClassAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  
   
   public Object visitDefMethodDeclAST( MethodDeclAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h3!=null)
      c.h3.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h4!=null)
      c.h4.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
     if(c.h5!=null)
      c.h5.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
   
   
  /*no hay nada*/
  public Object visitExpReadAST( ExpTypeReadAST c, Object arg){
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
                    
    return null;
  }
  
  public Object visitExpStatAST( StatCuadExpAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  
  /*No hay nada*/
  public Object visitExp_SimplTokAST( Exp_SimplTokAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
           
    return null;
  }
  public Object visitExplAST( ExpListAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitExplistStatAST( StatExpListAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }        
    return null;
  }
  
  public Object visitExpnegAST( Exp_SimpNegAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitExpnewIntAST( Exp_SimpNewIntAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }          
    return null;
  }
  public Object visitExpnewidAST( Exp_SimpNewIdAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }          
    return null;
  }
  
  
  public Object visitExpredAST( Exp_SimpExpAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }         
    return null;
  }
  public Object visitImpClssMnAST( ImpClssMnAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h3!=null)
      c.h3.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }       
    return null;
  }
  public Object visitMethodDAST( BodyDecl2MethoDeclAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitOpTAST( OpAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
                    
    return null;
  }
  public Object visitTNamesAST( TypeName2AST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitTididAST( VarDeclAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
                    
    return null;
  }
  public Object visitTipoCuadrAST( DistiExpCuadrAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitTipoLengthAST( DistiExpLengthAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
                    
    return null;
  }
  public Object visitTipoListaAST( DistiExpListAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitTipoOpAST( DistiExpOpAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitVariableDAST( BodyDecl2VarDeclAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  
  public Object visitasigStatAST( StatAsigAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitconExtendsoImplementsAST( ClassDecl4AST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
                    
    return null;
  }
  public Object visitconIdoVoidAST( TypeVoidAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
                    
    return null;
  }
  public Object visitconPuntoAsteriscoAST( ImportDecl2AST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
                    
    return null;
  }
  public Object visitconThisoIdAST( ThisIdAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
                    
    return null;
  }
  public Object visitelseStatAST( ElseStatementAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitexitStatAST( StatExitAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
                    
    return null;
  }
  public Object visitifelseStatAST( StatIfElseAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h3!=null)
      c.h3.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitimpTypeAST( ImportDeclAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitprintlnStatAST( StatPrintlnAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitsolaExpAST( ExpTypeExpAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  
  
  public Object visittipExpAST( VarDistiExpAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitunaExpAST( CuadExpAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitvarBodyDeclAST( BodyDeclAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitvarClassDeclsAST( VarClassDeclAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitvarExpListsAST( VarComaExpAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitvarFormalListAST( FormalListAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitvarFormalListsAST( VarTypeIdAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitvarImportAST( VarImportDeclAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitvarStatAST( StatVarStatAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  
  public Object visitvarStatementsAST( VarStatementAST c, Object arg){
      int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;}
  public Object visitvarTypeNameAST( TypeNameAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitvarVarDeclsAST( VarVarDeclAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
  public Object visitwhileStatAST( StatWhileAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if(c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
                    
    return null;
  }
    public Object visitDefReturnAST(ReturnExpAST c, Object arg) {
                  int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
    }
  
}