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
public class Exp_SimpNumAST extends AExp_SimplAST{
    public Symbol num;
    //public String h1;
    
    public Exp_SimpNumAST( Symbol e){
        super();
        this.num = e;
    }



    public Object visit(Visitor v,Object arg) {
       return v.visitExp_SimpNumAST(this, arg);
   }
}
