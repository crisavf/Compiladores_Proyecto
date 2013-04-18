/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class OpCompaAST extends AOpAST{
    
    public OpCompaAST(){
        super();
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitOpCompaAST(this, arg);
   }
}
