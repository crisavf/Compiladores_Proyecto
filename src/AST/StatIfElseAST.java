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
public class StatIfElseAST extends AVarStatementAST{
    public AExpAST h1;
    public AStatementAST h2;
    public AElseStatementAST h3;
    public StatIfElseAST(AExpAST e, AStatementAST s,AElseStatementAST es){
        super();
        this.h1 = e;
        this.h2 = s;
        this.h3 = es;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitifelseStatAST(this, arg);
   }
}
