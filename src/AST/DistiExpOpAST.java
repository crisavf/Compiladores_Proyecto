/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class DistiExpOpAST extends ADistiExpAST {
    public AOpAST h1;
    public AExpAST h2;
    public DistiExpOpAST(AOpAST o, AExpAST e){
        super();
        this.h1 = o;
        this.h2 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitTipoOpAST(this, arg);
   }
}
