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
public class Exp_SimplTokAST extends AExp_SimplAST{
    //public Symbol v_toks;
    public Exp_SimplTokAST(){//Symbol v){
        super();
        //this.v_toks = v;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitExp_SimplTokAST(this, arg);
   }
}
