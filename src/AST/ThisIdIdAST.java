/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import java_cup.runtime.Symbol;

/**
 *
 * @author Battou
 */
public class ThisIdIdAST extends AThisIdAST{
    public Symbol id;
    public ThisIdIdAST(Symbol s){
        super();
        this.id = s;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitThisIdIdAST(this, arg);
   }
}
