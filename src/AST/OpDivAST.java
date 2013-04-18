/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class OpDivAST extends AOpAST{
    
    public OpDivAST(){
        super();
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitOpDivAST(this, arg);
   }
}
