/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import java_cup.runtime.Symbol;

/**
 *
 * @author Battou
 */
public class MethodDeclAST extends AMethodDeclAST{

    public ATypeVoidAST h1;
    public Symbol id;
    public AFormalListAST h2;
    public AVarVarDeclAST h3;
    public AVarStatementAST h4;
    public AReturnExpAST h5;
    
    public MethodDeclAST(Symbol i,ATypeVoidAST iv,AFormalListAST fl,AVarVarDeclAST vd,AVarStatementAST s, AReturnExpAST r){
        super();
        this.h1 = iv;
        this.h2 = fl;
        this.h3 = vd;
        this.h4 = s;
        this.h5 = r;
        this.id = i;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitDefMethodDeclAST(this, arg);
   } 
}
