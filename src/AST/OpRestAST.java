/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class OpRestAST extends AOpAST{
    
    public OpRestAST(){
        super();
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitOpRestAST(this, arg);
   }
}
