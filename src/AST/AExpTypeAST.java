/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public abstract class AExpTypeAST extends AAST {
    public AExpTypeAST(){
    super();
    }
    public abstract Object visit(Visitor v,Object arg);
}
