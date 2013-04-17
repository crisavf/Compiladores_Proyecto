/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public abstract class AExp_SimplAST extends AAST{
    public AExp_SimplAST(){
        super();
    }
    public abstract Object visit(Visitor v,Object arg);
}
