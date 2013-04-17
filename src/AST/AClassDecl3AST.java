/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public abstract class AClassDecl3AST extends AAST {
    public AClassDecl3AST(){
        super();
    }
    public abstract Object visit(Visitor v,Object arg);
}
