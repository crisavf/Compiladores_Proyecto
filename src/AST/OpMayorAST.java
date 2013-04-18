/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class OpMayorAST extends AOpAST{
    
    public OpMayorAST(){
        super();
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitOpMayorAST(this, arg);
   }
}
