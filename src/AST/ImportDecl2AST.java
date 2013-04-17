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
public class ImportDecl2AST extends AImportDecl2AST {
    //public Symbol pa;
    public ImportDecl2AST(){//Symbol p){
        super();
        //this.pa= p;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitconPuntoAsteriscoAST(this, arg);
   }
}
