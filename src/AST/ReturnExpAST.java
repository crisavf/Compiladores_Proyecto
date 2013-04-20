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
public class ReturnExpAST extends AReturnExpAST{
    public AExpAST h1;
    public ReturnExpAST(AExpAST e){
        super();
        this.h1 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitReturnExpAST(this, arg);
   } 
}
