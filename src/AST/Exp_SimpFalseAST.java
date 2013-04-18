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
public class Exp_SimpFalseAST extends AExp_SimplAST{
    
    public Exp_SimpFalseAST(){
        super();
    }

    public Object visit(Visitor v,Object arg) {
       return v.visitExp_SimpFalseAST(this, arg);
   }
}
