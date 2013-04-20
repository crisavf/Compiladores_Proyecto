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
public class StatAsigAST extends AStatementAST{
    public Symbol id1;
    //public String id;
    public AExpTypeAST h1;
    public StatAsigAST(Symbol i,AExpTypeAST ed){
        super();
        this.h1 = ed;
        this.id1 = i;
    }

    public Object visit(Visitor v,Object arg) {
       return v.visitStatAsigAST(this, arg);
   }
}
