/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class VarVarDeclAST extends AVarVarDeclAST{
    public AVarDeclAST h1;
    public AVarVarDeclAST h2;
    public VarVarDeclAST(AVarDeclAST vd,AVarVarDeclAST vds){
        super();
        this.h1=vd;
        this.h2 = vds;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitVarVarDeclAST(this, arg);
   }
}
