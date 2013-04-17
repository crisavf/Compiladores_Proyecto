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
public class Exp_SimpNewIdAST extends AExp_SimplAST{
    public Symbol id;
    public AExpListAST h1;
    public Exp_SimpNewIdAST(Symbol i, AExpListAST e){
        super();
        this.id = i;
        this.h1 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitExpnewidAST(this, arg);
   }
}
