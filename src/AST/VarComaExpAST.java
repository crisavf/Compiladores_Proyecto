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
public class VarComaExpAST extends AVarComaExpAST {
    public AExpAST h1;
    public AVarComaExpAST h2;

    public VarComaExpAST( AExpAST e, AVarComaExpAST l) {
                super();
        this.h1 = e;
        this.h2 = l;
    }

    public Object visit(Visitor v,Object arg) {
       return v.visitVarComaExpAST(this, arg);
   }
}
