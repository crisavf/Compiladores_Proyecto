/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public abstract class ATypeName2AST extends AAST{
    //Epsilon
    public ATypeName2AST(){
        super();
    }
    public abstract Object visit(Visitor v,Object arg);
}
