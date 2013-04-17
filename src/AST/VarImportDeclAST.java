/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class VarImportDeclAST extends AVarImportDecl {
    public AVarImportDecl h1;
    public VarImportDeclAST h2;
    public VarImportDeclAST(AVarImportDecl d , VarImportDeclAST s){
        super();
        this.h1 = d;
        this.h2 = s;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitvarImportAST(this, arg);
   }
}
