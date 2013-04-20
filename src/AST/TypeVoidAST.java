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
public class TypeVoidAST extends ATypeVoidAST{
    public Symbol v_toks;
    public TypeVoidAST(Symbol i){
        super();
        this.v_toks = i;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitconIdoVoidAST(this, arg);
   }
}
