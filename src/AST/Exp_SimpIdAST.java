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
public class Exp_SimpIdAST extends AExp_SimplAST{
    public Symbol id1;
    //public String h1;
    
    public Exp_SimpIdAST( Symbol id1){
        super();
        this.id1 = id1;
    }

    public Object visit(Visitor v,Object arg) {
       return v.visitExp_SimpIdAST(this, arg);
   }
}
