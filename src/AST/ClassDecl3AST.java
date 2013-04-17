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
public class ClassDecl3AST extends AClassDecl3AST{
    public AClassDecl4AST h1;
    public Symbol id;
    public ClassDecl3AST(Symbol i,AClassDecl4AST cd3){
        super();
        this.h1 = cd3;
        this.id = i;
    }
        
      public Object visit(Visitor v,Object arg) {
       return v.visitCD3AST(this, arg);
   } 
}
