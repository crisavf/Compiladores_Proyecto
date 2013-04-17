/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class BodyDecl2VarDeclAST extends ABodyDecl2AST{
    public AVarDeclAST h1;
    public BodyDecl2VarDeclAST(AVarDeclAST vd){
        super();
        this.h1 = vd;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitVariableDAST(this, arg);
   }
}
