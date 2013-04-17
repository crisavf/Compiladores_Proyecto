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
public class StatPrintlnAST extends AStatementAST {
    public AExpAST h1;
    public StatPrintlnAST(AExpAST e){
        super();
        this.h1= e;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitprintlnStatAST(this, arg);
   }
}
