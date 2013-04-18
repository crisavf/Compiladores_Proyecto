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
    //public Symbol h1;
    public String h1;
    
    public Exp_SimpIdAST( String id){
        super();
        this.h1 = id;
    }

    public Object visit(Visitor v,Object arg) {
       return v.visitExp_SimpIdAST(this, arg);
   }
}
