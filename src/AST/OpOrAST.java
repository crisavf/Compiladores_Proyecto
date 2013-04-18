/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class OpOrAST extends AOpAST{
    
    public OpOrAST(){
        super();
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitOpOrAST(this, arg);
   }
}
