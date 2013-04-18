/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class CuadExpAST extends ACuadExpAST{
    public AExpAST h1;
    public CuadExpAST(AExpAST e){
        super();
        this.h1 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitCuadExpAST(this, arg);
   }
}
