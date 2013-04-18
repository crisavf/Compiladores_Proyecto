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
public class Exp_SimpTrueAST extends AExp_SimplAST{
    
    public Exp_SimpTrueAST(){
        super();
    }


    public Object visit(Visitor v,Object arg) {
       return v.visitExp_SimpTrueAST(this, arg);
   }
}
