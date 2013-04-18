/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import java_cup.runtime.Symbol;

/**
 *
 * @author Walter
 */
public class DistiExpLengthAST extends ADistiExpAST{
//    public Symbol punto;
//    public Symbol length;
    public DistiExpLengthAST(){//Symbol p,Symbol l){
        super();
        //this.punto = p;
        //this.length =l;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitDistiExpLengthAST(this, arg);
   }
}
