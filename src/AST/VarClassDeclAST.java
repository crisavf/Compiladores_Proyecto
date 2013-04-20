/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class VarClassDeclAST extends AVarClassDeclAST {
    public AClassDeclAST h1;
    public AVarClassDeclAST h2;
    public VarClassDeclAST(AClassDeclAST cd, AVarClassDeclAST cds){
        super();
        this.h1 = cd;
        this.h2 = cds;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitVarClassDeclAST(this, arg);
   }
}
