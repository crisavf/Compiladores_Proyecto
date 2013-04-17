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
public class StatWhileAST extends AStatementAST{
    public AExpAST h1;
    public AStatementAST h2; 
    public StatWhileAST(AExpAST e, AStatementAST s){
        super();
        this.h1 = e;
        this.h2 = s;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitwhileStatAST(this, arg);
   }
}
