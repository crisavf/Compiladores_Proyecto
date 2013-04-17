/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public abstract class AExpAST extends AAST {
    public AExpAST(){
        super();
    }
    public abstract Object visit(Visitor v,Object arg);
}
