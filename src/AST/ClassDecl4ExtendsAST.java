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
public class ClassDecl4ExtendsAST extends AClassDecl4AST{
    public ClassDecl4ExtendsAST(){
        super();
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitClassDecl4ExtendsAST(this, arg);
   }
}
