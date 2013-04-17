/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public abstract class ABodyDecl2AST extends AAST {
    public ABodyDecl2AST(){
        super();
    }
    public abstract Object visit(Visitor v,Object arg);
}
