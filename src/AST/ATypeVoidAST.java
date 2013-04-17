/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public abstract class ATypeVoidAST extends AAST {
    //Epsilon
    public ATypeVoidAST(){
        super();
    }
    public abstract Object visit(Visitor v,Object arg);
}
