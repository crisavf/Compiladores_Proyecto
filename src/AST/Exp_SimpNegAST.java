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
public class Exp_SimpNegAST extends AExp_SimplAST{
    public AExpAST h1;
    public Exp_SimpNegAST( AExpAST e){
        super();
        this.h1 = e;
    }

    public Object visit(Visitor v,Object arg) {
       return v.visitExp_SimpNegAST(this, arg);
   }
}
