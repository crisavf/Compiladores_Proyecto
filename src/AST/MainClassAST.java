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
public class MainClassAST extends AMainClassAST{
    public Symbol id1;

    public Symbol id2;
    public AStatementAST h1;

    public MainClassAST(Symbol i1,Symbol i2,AStatementAST s){
        super(); 
        this.h1 = s;
        this.id1 = i1;
        this.id2 = i2;
    }
    
        
    public Object visit(Visitor v,Object arg) {
       return v.visitMainClassAST(this, arg);
   } 
}
