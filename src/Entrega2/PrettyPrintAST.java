package Entrega2;

import AST.*;

//Implementa los m�todos para imprimir el AST utilizando Visitors
public class PrettyPrintAST implements Visitor
{
   String DatosImpresion="";
    
  public void imprimir(AAST raiz)
  {
    raiz.visit(this,new Integer(0));
  }
  
  public void printtab(int n)
  {
    for(int num=n; num != 0; num--){
        DatosImpresion+="+++";
      System.out.print("+++");
    }
    DatosImpresion+=">";
    System.out.print(">");
  }
  
  
  // TODOS LOS M�TODOS PARA IMPRIMIR EL AST

    public Object visitOpSumAST( OpSumAST c, Object arg){
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
    }
    
    public Object visitExp_SimpStringAST(Exp_SimpStringAST c, Object arg){
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
    }
    
    public Object visitExp_SimpTrueAST(Exp_SimpTrueAST c, Object arg){
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
    }
    public Object visitExp_SimpFalseAST(Exp_SimpFalseAST c, Object arg){
      int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
    }
    public Object visitExp_SimpNumAST(Exp_SimpNumAST c, Object arg){
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
    }
    public Object visitExp_SimpThisAST(Exp_SimpThisAST c, Object arg){
      int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
    }
    
    public Object visitExp_SimpIdAST(Exp_SimpIdAST c, Object arg){
      int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
    }

    
    
    
    
    
    
    
    
  public Object visitOpRestAST( OpRestAST c, Object arg){
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
  }
  public Object visitOpMulAST( OpMulAST c, Object arg){
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
  }
  public Object visitOpDivAST( OpDivAST c, Object arg){
      int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
  }  
  public Object visitOpDifeAST( OpDifeAST c, Object arg){
      int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
  }
  public Object visitOpCompaAST( OpCompaAST c, Object arg){
      int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
  } 
  public Object visitOpMenorAST( OpMenorAST c, Object arg){
      int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
  } 
  public Object visitOpMenorIgualAST( OpMenorIgualAST c, Object arg){
      int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
  } 
  public Object visitOpMayorIgualAST( OpMayorIgualAST c, Object arg){
      int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
  } 
  public Object visitOpOrAST( OpOrAST c, Object arg){
      int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
  }
  public Object visitOpAndAST( OpAndAST c, Object arg){
      int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
  } 
  public Object visitOpMayorAST(OpMayorAST c, Object arg){
      int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
  }

  public Object visitTypeVoidIdAST( TypeVoidIdAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    DatosImpresion+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
                    
    return null;
  } 
  
  public Object visitTypeVoidVoidAST( TypeVoidVoidAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    DatosImpresion+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
                    
    return null;
  }   

  
   public Object visitClassDecl4ExtendsAST( ClassDecl4ExtendsAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    DatosImpresion+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
                    
    return null;
  }
 
    public Object visitClassDecl4ImplementsAST( ClassDecl4ImplementsAST c, Object arg){
          int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    DatosImpresion+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
                    
    return null;
  }

    public Object visitClassDecl2AST(ClassDecl2AST c, Object arg) {
           int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    DatosImpresion+=c.getClass().getName()+"\n";
    System.out.println(c.getClass().getName());
    if(c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      DatosImpresion+="NULL"+"\n";
      System.out.println("NULL");
    }
    return null;
    }

    
    public Object visitClassDeclBodyAST(ClassDeclBodyAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h2!=null)
          c.h2.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitClassDecl3AST(ClassDecl3AST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }

    
    public Object visitBodyDecl2ClassDeclAST(BodyDecl2ClassDeclAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }

    
    public Object visitBodyDecl2ConstDeclAST(BodyDecl2ConstDeclAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }

    
    public Object visitConstrDeclAST(ConstrDeclAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h2!=null)
          c.h2.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h3!=null)
          c.h3.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitExpAST(ExpAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h2!=null)
          c.h2.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }

    public Object visitMainClassAST(MainClassAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitMethodDeclAST(MethodDeclAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h2!=null)
          c.h2.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h3!=null)
          c.h3.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h4!=null)
          c.h4.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h5!=null)
          c.h5.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitReturnExpAST(ReturnExpAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitExpTypeReadAST(ExpTypeReadAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
    }

    public Object visitStatCuadExpAST(StatCuadExpAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h2!=null)
          c.h2.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitExpListAST(ExpListAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h2!=null)
          c.h2.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitStatExpListAST(StatExpListAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h2!=null)
          c.h2.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitExp_SimpNegAST(Exp_SimpNegAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitExp_SimpNewIntAST(Exp_SimpNewIntAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitExp_SimpNewIdAST(Exp_SimpNewIdAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitExp_SimpExpAST(Exp_SimpExpAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitImpClssMnAST(ImpClssMnAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h2!=null)
          c.h2.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h3!=null)
          c.h3.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitBodyDecl2MethoDeclAST(BodyDecl2MethoDeclAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitTypeName2AST(TypeName2AST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitVarDeclAST(VarDeclAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
    }


    public Object visitDistiExpCuadrAST(DistiExpCuadrAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitDistiExpLengthAST(DistiExpLengthAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
    }


    public Object visitDistiExpListAST(DistiExpListAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }

        return null;
    }


    public Object visitDistiExpOpAST(DistiExpOpAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h2!=null)
          c.h2.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitBodyDecl2VarDeclAST(BodyDecl2VarDeclAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitStatAsigAST(StatAsigAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitImportDecl2AST(ImportDecl2AST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
    }


    public Object visitElseStatementAST(ElseStatementAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }

        return null;
    }


    public Object visitStatExitAST(StatExitAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
    }


    public Object visitStatIfElseAST(StatIfElseAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h2!=null)
          c.h2.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h3!=null)
          c.h3.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitImportDeclAST(ImportDeclAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h2!=null)
          c.h2.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }

        return null;
    }


    public Object visitStatPrintlnAST(StatPrintlnAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitExpTypeExpAST(ExpTypeExpAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitVarDistiExpAST(VarDistiExpAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h2!=null)
          c.h2.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitCuadExpAST(CuadExpAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitBodyDeclAST(BodyDeclAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h2!=null)
          c.h2.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitVarClassDeclAST(VarClassDeclAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h2!=null)
          c.h2.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitVarComaExpAST(VarComaExpAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h2!=null)
          c.h2.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitFormalListAST(FormalListAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitVarTypeIdAST(VarTypeIdAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitVarImportDeclAST(VarImportDeclAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h2!=null)
          c.h2.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitStatVarStatAST(StatVarStatAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitVarStatementAST(VarStatementAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h2!=null)
          c.h2.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitTypeNameAST(TypeNameAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitVarVarDeclAST(VarVarDeclAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h2!=null)
          c.h2.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        return null;
    }


    public Object visitStatWhileAST(StatWhileAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        if (c.h1!=null)
          c.h1.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }
        if (c.h2!=null)
          c.h2.visit(this,new Integer(numaux+1));
        else
        {
          printtab(numaux+1);
          DatosImpresion+="NULL"+"\n";
          System.out.println("NULL");
        }

        return null;
    }


    public Object visitThisIdIdAST(ThisIdIdAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());
        return null;
    }


    public Object visitThisIdThisAST(ThisIdThisAST c, Object arg) {
        int numaux = ((Integer)arg).intValue();
        printtab(numaux);
        DatosImpresion+=c.getClass().getName()+"\n";
        System.out.println(c.getClass().getName());

        return null;
    }
    
    public String GetInfoArbol(){
       return DatosImpresion;
    }
}
