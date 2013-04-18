/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class OpMulAST extends AOpAST{
    
    public OpMulAST(){
        super();
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitOpMulAST(this, arg);
   }
}
