/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class ExpTypeExpAST extends AExpTypeAST{
    public AExpAST  h1;
    public ExpTypeExpAST(AExpAST e){
        super();
        this.h1 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitExpTypeExpAST(this, arg);
   }
}
