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
public class TypeVoidIdAST extends ATypeVoidAST{
    public Symbol id1;
    //public String id;
    public TypeVoidIdAST(Symbol i){
        super();
        this.id1 = i;
    }

    public Object visit(Visitor v,Object arg) {
       return v.visitTypeVoidIdAST(this, arg);
   }
}
