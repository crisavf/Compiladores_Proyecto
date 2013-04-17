/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class BodyDeclAST extends ABodyDeclAST {
    public ABodyDecl2AST h1;
    public ABodyDeclAST h2; 
    public BodyDeclAST(ABodyDecl2AST bd1, ABodyDeclAST bd){
        super();
        this.h1 = bd1;
        this.h2 = bd;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitvarBodyDeclAST(this, arg);
   }
}
