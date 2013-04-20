/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class VarStatementAST extends AVarStatementAST{
    public AStatementAST h1;
    public AVarStatementAST h2;
    public VarStatementAST(AStatementAST s,AVarStatementAST ss){
        super();
        this.h1 = s;
        this.h2 = ss;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitVarStatementAST(this, arg);
   }
}
