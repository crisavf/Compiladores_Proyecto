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
public class OpAST extends AOpAST{
    public Symbol v_toks;
    public OpAST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitOpTAST(this, arg);
   }
}
