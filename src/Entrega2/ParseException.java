package compiladorminijava;

public class ParseException extends Exception 
{
   public ParseException(){
   super();}
   
   public ParseException(String mensaje){
   super(mensaje);}
}