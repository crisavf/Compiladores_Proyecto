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
public class FormalListAST extends AFormalListAST {
    public Symbol id1;
    public Symbol id2;
    //public String id1;
    //public String id2;
    public AVarTypeIdAST h1;
    public FormalListAST(Symbol i1,Symbol i2,AVarTypeIdAST fls){
        super();
        this.h1 = fls;
        this.id1 = i1;
        this.id2 = i2;
    }

    public Object visit(Visitor v,Object arg) {
       return v.visitFormalListAST(this, arg);
   }
}
