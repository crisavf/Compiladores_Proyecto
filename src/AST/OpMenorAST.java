/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class OpMenorAST extends AOpAST{
    
    public OpMenorAST(){
        super();
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitOpMenorAST(this, arg);
   }
}
