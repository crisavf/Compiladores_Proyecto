package Entrega1;

import java.io.*;
public class reconocedor_tokens
{
    String reconocedor_tokens(String nombreFile) {
        System.out.print("LLegue");
        String texto="";
    try{
        Scanner s=new Scanner(new FileReader(nombreFile)); 

        Symbol res;
        do{
        res = s.nextToken();
        System.out.println(res.sym);
        texto+=res.sym+"\n";
        }while(res.sym != sym.EOF);
    }
    catch(IOException e){}
      
      return texto;
    
    }
}