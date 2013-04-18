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
public class Exp_SimpThisAST extends AExp_SimplAST{
    
    public Exp_SimpThisAST(){
        super();
    }

    public Object visit(Visitor v,Object arg) {
       return v.visitExp_SimpThisAST(this, arg);
   }
}
