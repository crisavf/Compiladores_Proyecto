/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class StatVarStatAST extends AStatementAST{
    public AVarStatementAST h1;
    public StatVarStatAST(AVarStatementAST s){
        super();
        this.h1 = s;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitStatVarStatAST(this, arg);
   }
}
