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
public class ExpTypeReadAST extends AExpTypeAST{
    public Symbol id;
    public ExpTypeReadAST(Symbol i1){
        super();
        this.id = i1;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitExpReadAST(this, arg);
   } 
}