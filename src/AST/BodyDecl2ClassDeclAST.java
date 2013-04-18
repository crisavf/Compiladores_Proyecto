/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class BodyDecl2ClassDeclAST extends ABodyDecl2AST{
    public  AClassDeclAST h1;
    public BodyDecl2ClassDeclAST(AClassDeclAST cd2){
        super();
        this.h1 = cd2;
    }
        
      public Object visit(Visitor v,Object arg) {
       return v.visitBodyDecl2ClassDeclAST(this, arg);
   } 
}
