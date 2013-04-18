/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class OpDifeAST extends AOpAST{
    
    public OpDifeAST(){
        super();
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitOpDifeAST(this, arg);
   }
}
