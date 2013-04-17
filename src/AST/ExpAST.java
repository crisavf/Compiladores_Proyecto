/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class ExpAST extends AExpAST{
    public AExp_SimplAST h1;
    public AVarDistiExpAST h2;
    public ExpAST(AExp_SimplAST es,AVarDistiExpAST ei){
        super();
        this.h1 = es;
        this.h2 = ei;
    }
    
        
    public Object visit(Visitor v,Object arg) {
       return v.visitDefExpAST(this, arg);
   } 
}
