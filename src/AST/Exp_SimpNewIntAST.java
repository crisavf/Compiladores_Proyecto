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
public class Exp_SimpNewIntAST extends AExp_SimplAST {
    public Symbol numero;
    public AExpAST h1;
    public Exp_SimpNewIntAST( Symbol nm, AExpAST e){
        super();
        this.numero = nm;
        this.h1 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitExpnewIntAST(this, arg);
   }
}
