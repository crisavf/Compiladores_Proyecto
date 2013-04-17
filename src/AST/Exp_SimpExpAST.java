/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class Exp_SimpExpAST extends AExp_SimplAST{
    public AExpAST h1;  
    public Exp_SimpExpAST(AExpAST e){
        super();
        this.h1 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitExpredAST(this, arg);
   }
}
