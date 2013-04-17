
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class ClassDeclBodyAST extends AClassDeclAST {
    public AClassDecl2AST h1;
    public ABodyDeclAST h2;
    public ClassDeclBodyAST(AClassDecl2AST cd1,ABodyDeclAST bd){
        super();
        this.h1=cd1;
        this.h2 = bd;
    }
    
      public Object visit(Visitor v,Object arg) {
       return v.visitBodyCD1AST(this, arg);
   }    
}
