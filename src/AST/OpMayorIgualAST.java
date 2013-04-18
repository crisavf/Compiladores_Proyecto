/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class OpMayorIgualAST extends AOpAST{
    
    public OpMayorIgualAST(){
        super();
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitOpMayorIgualAST(this, arg);
   }
}
