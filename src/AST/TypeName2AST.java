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
public class TypeName2AST extends ATypeName2AST{
    public ATypeName2AST h1;
    public Symbol id1;
    //public String id;
    public TypeName2AST(Symbol i,ATypeName2AST tns){
        super();
        this.h1 = tns;
        this.id1 = i;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitTypeName2AST(this, arg);
   }
}
