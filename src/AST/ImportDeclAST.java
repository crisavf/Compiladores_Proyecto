/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import java_cup.runtime.Symbol;

/**
 *
 * @author Battou
 */
public class ImportDeclAST extends AImportDeclAST{
    public ATypeNameAST h1;
    public AImportDecl2AST h2;
    public ImportDeclAST(ATypeNameAST tn,AImportDecl2AST imp1){
        super();
        this.h1 = tn;
        this.h2 = imp1;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitimpTypeAST(this, arg);
   }
}