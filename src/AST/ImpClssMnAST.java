/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class ImpClssMnAST extends AProgramAST  {
    public AVarImportDeclAST h1;
    public AVarClassDeclAST h2;
    public AMainClassAST h3;
    public ImpClssMnAST(AVarImportDeclAST i, AVarClassDeclAST c, AMainClassAST m){
       super();
       this.h1 = i;
       this.h2 = c;
       this.h3 = m;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitImpClssMnAST(this, arg);
   }
    /*
     public Object visit(Visitor v,Object arg) {
       return v.visitcondeclAST(this,arg);
   }
   * */
}
