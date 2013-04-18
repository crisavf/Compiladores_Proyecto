/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class OpSumAST extends AOpAST{
    
    public OpSumAST(){
        super();
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitOpSumAST(this, arg);
   }
}
