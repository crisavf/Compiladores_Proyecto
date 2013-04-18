/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class OpAndAST extends AOpAST{
    
    public OpAndAST(){
        super();
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitOpAndAST(this, arg);
   }
}
