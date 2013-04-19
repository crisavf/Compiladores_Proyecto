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
public class Exp_SimpStringAST extends AExp_SimplAST{
    public Symbol Stri;
    //public String h1;
    public Exp_SimpStringAST(Symbol e){
        super();
        this.Stri = e;
        
    }

    public Object visit(Visitor v,Object arg) {
       return v.visitExp_SimpStringAST(this, arg);
   }
}
