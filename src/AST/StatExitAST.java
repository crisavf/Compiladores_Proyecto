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
public class StatExitAST extends AStatementAST {
    public Symbol numero;
    public StatExitAST(Symbol n){
        super();
        this.numero = n;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitStatExitAST(this, arg);
   }
}
