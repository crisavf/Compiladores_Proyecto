/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import java_cup.runtime.Symbol;

/**
 *
 * @author Walter
 */
public class ConstrDeclAST extends AConstrDeclAST{
    //public Symbol id;
    public String id;
    public AFormalListAST h1;
    public AVarVarDeclAST h2;
    public AVarStatementAST h3;

    public ConstrDeclAST(String i,AFormalListAST fl,AVarVarDeclAST vd, AVarStatementAST s){
        super();
        this.h1 = fl;
        this.h2 = vd;
        this.h3 = s;
        this.id = i;
    }
    
        
      public Object visit(Visitor v,Object arg) {
       return v.visitConstrDeclAST(this, arg);
   } 
}
