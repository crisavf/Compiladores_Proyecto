/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Walter
 */
public class ExpListAST extends AExpListAST {
   public AExpAST h1;
   public AVarComaExpAST h2;
   public ExpListAST(AExpAST e, AVarComaExpAST l){
       super();
       this.h1 = e;
       this.h2 = l;
   }

   public Object visit(Visitor v,Object arg) {
       return v.visitExpListAST(this, arg);
   }
}
