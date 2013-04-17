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
public class ThisIdAST extends AThisIdAST{
    public Symbol v_toks;
    public ThisIdAST(Symbol s){
        super();
        this.v_toks = s;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitconThisoIdAST(this, arg);
   }
}
