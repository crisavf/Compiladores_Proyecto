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
public class ClassDecl2AST extends AClassDecl2AST{
    public Symbol id1;
    //public String id1;
    public AClassDecl3AST h1;
    public ClassDecl2AST(Symbol i,AClassDecl3AST cd2){
        super();
        this.h1 = cd2;
        this.id1 = i;
    }
        
    public Object visit(Visitor v,Object arg) {
       return v.visitClassDecl2AST(this, arg);
   } 
}
