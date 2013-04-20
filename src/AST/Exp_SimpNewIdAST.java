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
public class Exp_SimpNewIdAST extends AExp_SimplAST{
    public Symbol id1;
    //public String id;
    public AExpListAST h1;
    public Exp_SimpNewIdAST(Symbol i, AExpListAST e){
        super();
        this.id1 = i;
        this.h1 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitExp_SimpNewIdAST(this, arg);
   }
}
