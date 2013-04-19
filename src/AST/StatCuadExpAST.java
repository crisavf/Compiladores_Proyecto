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
public class StatCuadExpAST extends AStatementAST {
    public Symbol id1;
    //public String id;
    public ACuadExpAST h1;
    public AExpTypeAST h2; 
    public StatCuadExpAST(Symbol i,ACuadExpAST ce,AExpTypeAST ed){
        super();
        this.h1 = ce;
        this.h2 = ed;
        this.id1 = i;
    }

    
    public Object visit(Visitor v,Object arg) {
       return v.visitStatCuadExpAST(this, arg);
   } 
}
