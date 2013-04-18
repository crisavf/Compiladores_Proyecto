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
public class TypeNameAST  extends ATypeNameAST{
    public Symbol id;
    public ATypeName2AST h1;
    public TypeNameAST(Symbol i,ATypeName2AST tn){
        super();
        this.h1 = tn;
        this.id = i;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitTypeNameAST(this, arg);
   }
}
