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
public class DistiExpListAST extends ADistiExpAST{
    public Symbol id1;
    //public String id;
    public AExpListAST h1; 
    public DistiExpListAST(Symbol i,AExpListAST el){
        super();
        this.h1 = el;
        this.id1 = i;
    }

    public Object visit(Visitor v,Object arg) {
       return v.visitDistiExpListAST(this, arg);
   }
}
