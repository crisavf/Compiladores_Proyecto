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
public class ClassDecl4AST extends AClassDecl4AST{
    public Symbol v_toks;
    public ClassDecl4AST(Symbol e){
        super();
        this.v_toks =e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitconExtendsoImplementsAST(this, arg);
   }
}
