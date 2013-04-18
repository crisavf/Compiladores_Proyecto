/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class DistiExpCuadrAST extends ADistiExpAST{
    
    public AExpAST h1;
    
    public DistiExpCuadrAST(AExpAST e){
        super();
        this.h1 = e;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitDistiExpCuadrAST(this, arg);
   }
}
