/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class VarDistiExpAST extends AVarDistiExpAST{
    public ADistiExpAST h1;
    public AVarDistiExpAST h2;
    public VarDistiExpAST(ADistiExpAST t, AVarDistiExpAST e){
        super();
        this.h1 = t;
        this.h2 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitVarDistiExpAST(this, arg);
   }
}
