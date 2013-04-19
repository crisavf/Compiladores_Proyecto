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
    //public Symbol id;
    public String id1;
    public ClassDecl3AST(String i,AClassDecl4AST cd3){
        super();
        this.h1 = cd3;
        this.id1 = i;
    }
        
      public Object visit(Visitor v,Object arg) {
       return v.visitClassDecl3AST(this, arg);
   } 
}
