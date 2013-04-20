/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class VarImportDeclAST extends AVarImportDeclAST {
    public AImportDeclAST h1;
    public AVarImportDeclAST h2;
    public VarImportDeclAST(AImportDeclAST d , AVarImportDeclAST s){
        super();
        this.h1 = d;
        this.h2 = s;
    }

    
    public Object visit(Visitor v,Object arg) {
       return v.visitVarImportDeclAST(this, arg);
   }
}
