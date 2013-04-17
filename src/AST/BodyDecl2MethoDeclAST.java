/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class BodyDecl2MethoDeclAST extends ABodyDecl2AST {
    public AMethodDeclAST h1;
    public BodyDecl2MethoDeclAST(AMethodDeclAST  md){
        super();
        this.h1 = md;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitMethodDAST(this, arg);
   }
}
