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
public class ThisIdIdAST extends AThisIdAST{
    public Symbol id1;
    //public String id;
    public ThisIdIdAST(Symbol s){
        super();
        this.id1 = s;
    }

    public Object visit(Visitor v,Object arg) {
       return v.visitThisIdIdAST(this, arg);
   }
}
