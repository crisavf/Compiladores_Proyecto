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
public class ThisIdThisAST extends AThisIdAST{
    public ThisIdThisAST(){
        super();
    }

    public Object visit(Visitor v,Object arg) {
       return v.visitThisIdThisAST(this, arg);
   }
}
