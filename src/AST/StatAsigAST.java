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
public class StatAsigAST extends AStatementAST{
    public Symbol id;
    public AExpTypeAST h1;
    public StatAsigAST(Symbol i, Symbol ig,Symbol p ,AExpTypeAST ed){
        super();
        this.h1 = ed;
        this.id = i;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitasigStatAST(this, arg);
   }
}
