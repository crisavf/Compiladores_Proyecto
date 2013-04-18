/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class OpMenorIgualAST extends AOpAST{
    
    public OpMenorIgualAST(){
        super();
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitOpMenorIgualAST(this, arg);
   }
}
