/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class BodyDecl2ConstDeclAST extends ABodyDecl2AST{
    public AConstrDeclAST h1;
    public BodyDecl2ConstDeclAST(AConstrDeclAST cd){
        super();
        this.h1 = cd;
    }
        
      public Object visit(Visitor v,Object arg) {
       return v.visitBodyDecl2ConstDeclAST(this, arg);
   } 
}
