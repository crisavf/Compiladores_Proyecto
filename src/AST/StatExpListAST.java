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
public class StatExpListAST extends AStatementAST{
    public AThisIdAST h1; 
    public Symbol id1;
    //public String id;
    public AExpListAST h2;
    public StatExpListAST( Symbol i,AThisIdAST t,AExpListAST el){
        super();
        this.h1 = t;
        this.h2 = el;
        this.id1 = i;
    }


    public Object visit(Visitor v,Object arg) {
       return v.visitStatExpListAST(this, arg);
   }
}