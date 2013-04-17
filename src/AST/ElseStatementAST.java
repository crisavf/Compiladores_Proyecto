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
public class ElseStatementAST extends AElseStatementAST{
    public AStatementAST h1;
    public ElseStatementAST(AStatementAST s){
        super();
        this.h1 = s;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitelseStatAST(this, arg);
   }
}
