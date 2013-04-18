/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrega2;

import java_cup.runtime.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.CaretListener;
import javax.swing.filechooser.FileNameExtensionFilter;




/**
 *
 * @author Wally
 */
public class Compi {

    /**
     * @param args the command line arguments
     */
}
 class Editor extends JFrame implements ActionListener
{
 
     String error=null;
     
 //Menu
 JMenuBar MBarra=new JMenuBar();
 JMenu MArchivo=new JMenu("Archivo");
 JMenuItem MNuevo=new JMenuItem("Nuevo");
 JMenuItem MAbrir=new JMenuItem("Abrir");
 JMenuItem MSalir=new JMenuItem("Salir"); 
 JMenuItem MGuardar=new JMenuItem("Guardar");
 JMenuItem MImprimir=new JMenuItem("Imprimir");;
 JMenu MEdicion=new JMenu("Edicion");
 JMenuItem MCortar=new JMenuItem("Cortar");
 JMenuItem MCopiar=new JMenuItem("Copiar");
 JMenuItem MPegar=new JMenuItem("Pegar");
 JMenuItem MBuscar=new JMenuItem("Buscar");
 JMenuItem MRemplazar=new JMenuItem("Reemplazar");
 JMenuItem MSelec=new JMenuItem("Seleccionar todo");
 JMenu MRun=new JMenu("Run");
 JMenuItem MCompilar=new JMenuItem("Compilar");
 JMenuItem MAST=new JMenuItem("AST");
 //Toolbar
 JToolBar TBarra=new JToolBar(); 
 JButton BNuevo=new JButton();
 JButton BAbrir=new JButton();
 JButton BCopiar=new JButton();
 JButton BCortar=new JButton();
 JButton BPegar=new JButton(); 
 JButton BGuardar=new JButton();
 JButton BCompilar=new JButton();
 JButton BAST=new JButton();
  
 //PopUpMenu Boton derecho 
 JPopupMenu PopMenu=new JPopupMenu (); 
   JMenuItem PopCortar=new JMenuItem ("Cortar");
   JMenuItem PopCopiar=new JMenuItem ("Copiar");
   JMenuItem PopPegar=new JMenuItem ("Pegar");
   JMenuItem PopSelTodo=new JMenuItem ("Seleccionar Todo");
    
 //Imagenes 
 ImageIcon INuevo=new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/New.png")).getImage());//nuevo.gif");
 ImageIcon IAbrir=new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Open.png")).getImage());//".../Open.png");//abrir.gif");
 ImageIcon ICopiar=new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Copy.png")).getImage());//".../Copy.png");//copiar.gif");
 ImageIcon ICortar=new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Cut.png")).getImage());//".../Cut.png");//cortar.gif");
 ImageIcon IPegar=new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Paste.png")).getImage());//".../Paste.png");//pegar.gif");
 ImageIcon IGuardar=new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Save.png")).getImage());//".../Save.png");//guardar.gif");
 ImageIcon IImprimir=new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Print.png")).getImage());//".../Print.png"); //impresora.gif");
 ImageIcon IBuscar=new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Search.png")).getImage());//".../buscar.gif");
 ImageIcon ISalir=new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Exit.png")).getImage());//".../Exit.png");// salir.gif");
 ImageIcon ICompilar=new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Compile.png")).getImage());//".../Compile.png");
 ImageIcon IAST=new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/AST.png")).getImage());//".../AST.png");// 

 
 String nombreFile=" "; //nombre del programa
 
 //Label
 JLabel Contador = new JLabel("Fila: 0    Columna: 0");
 
//Cajas de texto 
 JTextArea Texto = new JTextArea();
 JTextArea Errores=new JTextArea(6,1);
 
 String Copiar="";
 
 Editor()
 {
//SubMenuArchivo 
  MArchivo.add(MNuevo);
  MNuevo.setIcon(INuevo);
  MNuevo.addActionListener(this);
  MArchivo.add(MAbrir);
  MAbrir.setIcon(IAbrir);
  MAbrir.addActionListener(this);
  MArchivo.add(MSalir);
  MSalir.addActionListener(this);
  MArchivo.add(MGuardar);
  MGuardar.setIcon(IGuardar);
  MGuardar.addActionListener(this);
  MArchivo.add(MImprimir);
  MImprimir.setIcon(IImprimir);
  MImprimir.addActionListener(this);
  MArchivo.addSeparator();
  MArchivo.add(MSalir);
  MSalir.setIcon(ISalir);
  MSalir.addActionListener(this);
  
//SubMenu Edicion
  MEdicion.add(MCortar);
  MCortar.setIcon(ICortar);
  MCortar.addActionListener(this);
  MEdicion.add(MCopiar);
  MCopiar.setIcon(ICopiar);
  MCopiar.addActionListener(this);
  MEdicion.add(MPegar);
  MPegar.setIcon(IPegar);  
  MEdicion.addSeparator();
  MEdicion.add(MBuscar);
  MBuscar.setIcon(IBuscar);
  MBuscar.addActionListener(this);
  MPegar.addActionListener(this);
  MEdicion.add(MRemplazar);
  MRemplazar.addActionListener(this);
  MEdicion.addSeparator();
  MEdicion.add(MSelec);
  MSelec.addActionListener(this);

//SubMenu Correr
  
  MRun.add(MCompilar);
  MCompilar.setIcon(ICompilar);
  MCompilar.addActionListener(this);
  MRun.add(MAST);
  MAST.setIcon(IAST);
  MAST.addActionListener(this);
  
//MenuPrincipal
  MBarra.add(MArchivo);
  MBarra.add(MEdicion);
  MBarra.add(MRun);
  setJMenuBar(MBarra);
  
  
  //ToolBar
  TBarra.add(BNuevo);
  BNuevo.addActionListener(this);
  BNuevo.setIcon(INuevo);
  TBarra.add(BAbrir);
  BAbrir.addActionListener(this);
  BAbrir.setIcon(IAbrir);
  TBarra.add(BGuardar);
  BGuardar.setIcon(IGuardar);
  BGuardar.addActionListener(this);
  TBarra.addSeparator();
  TBarra.add(BCopiar);
  BCopiar.setIcon(ICopiar);
  BCopiar.addActionListener(this);
  TBarra.add(BCortar);
  BCortar.setIcon(ICortar);
  BCortar.addActionListener(this);
  TBarra.add(BPegar);
  BPegar.setIcon(IPegar);  
  BPegar.addActionListener(this);
  TBarra.addSeparator();
  TBarra.add(BCompilar);
  BCompilar.setIcon(ICompilar);  
  BCompilar.addActionListener(this);
  TBarra.add(BAST);
  BAST.setIcon(IAST);  
  BAST.addActionListener(this);
  BGuardar.setToolTipText ("Guardar");
  BNuevo.setToolTipText ("Nuevo");
  BAbrir.setToolTipText ("Abrir");
  BCopiar.setToolTipText ("Copiar");
  BCortar.setToolTipText ("Cortar");
  BPegar.setToolTipText ("Pegar");
  BCompilar.setToolTipText ("Compilar");
  BAST.setToolTipText ("AST");
  
  
  //PopUpMenu
  PopCortar.addActionListener (this);
  PopMenu.add (PopCortar); 
  PopCopiar.addActionListener(this);
  PopMenu.add(PopCopiar);
  PopPegar.addActionListener(this);
  PopMenu.add(PopPegar);

  PopCortar.setIcon (ICortar);
  PopCopiar.setIcon(ICopiar);
  PopPegar.setIcon(IPegar);
  Texto.setComponentPopupMenu (PopMenu);
  
//Contador de lineas y Columnas
  TBarra.addSeparator();
  TBarra.addSeparator();
  TBarra.addSeparator();
  

  TBarra.add(Contador);
//AreasDeTexto  
  Texto.addCaretListener(Caret);
  Texto.requestFocus();
  Errores.setEditable(false);
  add(TBarra,"North");
  
  //Aadir barras de scroll a la caja de texto principal
  JScrollPane barrillas=new JScrollPane(Texto,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
  add(barrillas);
  
  //Aadir barras de scroll a la caja de texto de los errores
  JScrollPane barrasError=new JScrollPane(Errores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
  add(barrasError,"South");
  //add(Contador,"South","South");
  
  //Cerrar Ventana
  addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
    {
     System.exit(0);
    }
  });
  
  setTitle("TextEdit"); 
  setSize(1000,600);
  setLocationRelativeTo(null);
  setVisible(true);
   
 }
 
 
  public void actionPerformed(ActionEvent ae)
   {
    if(ae.getSource()==MImprimir) imprimir();
        
    if(ae.getSource()==MSalir) dispose();
    
    if(ae.getSource()==MNuevo || ae.getSource()==BNuevo) Nuevo();//Texto.setText("");
    
    if(ae.getSource()==MCopiar || ae.getSource()==PopCopiar || ae.getSource()==BCopiar) Texto.copy();
    
    if(ae.getSource()==MPegar || ae.getSource()==PopPegar || ae.getSource()==BPegar) Texto.paste();
    
    if(ae.getSource()==MCortar || ae.getSource()==PopCortar || ae.getSource()==BCortar) Texto.cut();
    
    if(ae.getSource()==MSelec) 
    {
     Texto.requestFocus();
        Texto.selectAll();
    }
    if(ae.getSource()==BAbrir || ae.getSource()==MAbrir){
        VeriExten(1);
    }
    if(ae.getSource()==BGuardar || ae.getSource()==MGuardar)
    {
     VeriExten(2);
    }
    
    
    if(ae.getSource()==MBuscar)
    {
     Busca Bes=new Busca(this,"Buscar...",true);
    }
    
    if(ae.getSource()==MRemplazar)
    {
     BuscaRemplaza ByR=new BuscaRemplaza(this,"Buscar y Reemplazar",true);
    }
    
    
    if((ae.getSource()==BCompilar) || (ae.getSource()==MCompilar))
    {

               Compilar();
    }
    
    if((ae.getSource()==BAST) || (ae.getSource()==MAST))
    {
     AST();
    }
   }
  
  CaretListener Caret = new CaretListener() {
      @Override
      public void caretUpdate(javax.swing.event.CaretEvent caretEvent) {
          NumeroLinea();
      }
  };
  
  
  private void Nuevo(){
    if (!Texto.getText().equals("")){
      if (JOptionPane.showConfirmDialog(null, "¿Desea guardar el archivo existente?", "Información", JOptionPane.YES_NO_OPTION) == 0)
        VeriExten(2);

      nombreFile = "";
//      ast = null;
      Texto.setText(""); Errores.setText("");
    }
  }
  
  
  void VeriExten (int opt)
   {
     //String Text="";
    //try
    //{
      JFileChooser fc=new JFileChooser(System.getProperty("user.dir"));
      FileNameExtensionFilter filter;
      filter = new FileNameExtensionFilter(".txt", "txt");
      fc.addChoosableFileFilter(filter);
      filter = new FileNameExtensionFilter(".java", "java");
      fc.addChoosableFileFilter(filter);
      
      //fc.showOpenDialog(this);
      if(opt==1){                             //Verificando las extensiones para Abrirlo
        opt=fc.showOpenDialog(null);
        
        if(opt== JFileChooser.APPROVE_OPTION){
          nombreFile = fc.getSelectedFile().toString();
          Abrir(fc.getSelectedFile());
          }
      }else{                                  //Verificando las extensiones para Guardarlo
        opt = fc.showSaveDialog(null);
        if(opt== JFileChooser.APPROVE_OPTION){
          nombreFile = fc.getSelectedFile().toString();
          
          if(Extencion(nombreFile)==null){
            nombreFile=nombreFile+".java";
          }
          Guardar(nombreFile);
        }
      }
      //fc.showOpenDialog(null);
      }
      /*
      File Abrir=fc.getSelectedFile(); //Devuelve el File que vamos a leerName
      
      if(Abrir!=null)
      {
        nombre=fc.getSelectedFile().getName();
      }
    
      if(Abrir!=null)
      {
       Texto.setText(""); 
       FileReader Fichero=new FileReader(Abrir);
       BufferedReader leer=new BufferedReader(Fichero);
       while((Text=leer.readLine())!=null)
        {
         Texto.append(Text+ "\n"); //append Concatena la linea leida
        }
        
         leer.close();
      }
      
     }
     catch(IOException ioe)
     {
       System.out.println(ioe);
     }
   }*/
  
  private void Abrir(File open){
    try{
      if(open != null){
        String Buff = ""; 
        Texto.setText(""); 
        Errores.setText("");

        FileReader Fichero = new FileReader(open);
        BufferedReader leer = new BufferedReader(Fichero);

        while((Buff = leer.readLine()) != null)
          Texto.append(Buff + "\n");

        leer.close();
      }

//      ast = null;
      Texto.setCaretPosition(0);
    }
    catch(IOException e){System.out.println(e);}
  }
  
   
   void Guardar (String NewName)
   {
     
     try{
      File save = new File(NewName);

      if(save != null){
        FileWriter write = new FileWriter(save);
        write.write(Texto.getText());
        write.close();
      }
    }catch(IOException e){System.out.println(e);}
    
    /*
     String Text="";
     try
     {
      JFileChooser fc=new JFileChooser(System.getProperty("user.dir"));
      fc.showSaveDialog(this);
      File Guardar =fc.getSelectedFile();
      if(Guardar !=null)
      {
       nombre=fc.getSelectedFile().getName();
       FileWriter  Guardx=new FileWriter(Guardar);
       Guardx.write(Texto.getText());
       Guardx.close();
         }
           
      }
       catch(IOException ioe)
     {
       System.out.println(ioe);
     } */
   }
   
   private String Extencion(String file) {
    String Exten = null, Arch = file;
    int i = Arch.lastIndexOf('.');
    if (i > 0){
      Exten = Arch.substring(i + 1).toLowerCase();}
    return Exten;
  }
   
   void imprimir ()
       {
        try{
           String todo=Texto.getText();
         PrintJob pjob = getToolkit().getPrintJob(this,"Imprimir Hoja",null);
          Graphics pg=  pjob.getGraphics();
          pg.setFont(new Font("SansSerif",Font.PLAIN,10));
          pg.drawString("Imprimido:",100,100);
          int inicio=0;
          int numlineas=1;
          for (int i=0; i<todo.length();i++)
           {
              if((int) todo.charAt(i)==10)
               {
               pg.drawString(todo.substring(inicio,i-1),100,100 + (15 * numlineas));
               inicio=i+1;
               numlineas ++;
               }
           }
          pg.drawString (todo.substring(inicio,todo.length()),100,100 + (15 * numlineas));
          pg.dispose (); //Finalizar pagina
          pjob.end(); //Termina trabajo y escupe pagina
     }catch(NullPointerException e){}
       }
   
   private void NumeroLinea(){
      int pos = Texto.getCaretPosition();
      javax.swing.text.Element map = Texto.getDocument().getDefaultRootElement();
      int currLine = map.getElementIndex(pos);
      javax.swing.text.Element lineElement = map.getElement(currLine);
      int start = lineElement.getStartOffset();
      Contador.setText("Fila: " + String.valueOf(currLine) + "       Columna: " + String.valueOf(pos - start));
   }
   
   private void Compilar(){
     Errores.setText("");
     int cantErrores=0;
     String msjCompi="";
     String msjErrores="";
     
     
     if(!"".equals(Texto.getText())){
         
         if((nombreFile.equals("")) | (nombreFile.equals(" "))){
             VeriExten(2); //llame al abrir
         }else{
             Guardar(nombreFile);
             try{
                Scanner s=new Scanner(new java.io.FileReader(nombreFile));
                parser p = new parser(s);
                 try {
                     p.parse();
                 } catch (Exception ex) {
                     error=ex.getMessage();

                 }
                 
                 msjCompi+=s.datos;
                 if(s.errorScanner==true){
                     Errores.setForeground(Color.red);
                     
                     msjCompi+=error;
                 }
                 
                 if(p.errorState==true){
                    Errores.setForeground(Color.red);
                    msjCompi+=p.datos3;
                    msjCompi+="\n\n ERROR DE COMPILACIÓN (CUP).";
                }
                 if((p.errorState==false) && (s.errorScanner==false)){
                    Errores.setForeground(Color.green);
                    msjCompi+="\n\n COMPILACIÓN EXITOSA.";
                }
                if(s.errorScanner==true)
                    msjCompi+="\n\n ERROR DE COMPILACIÓN (SCANNER).";
                
                if(p.errorState==true)
                    msjCompi+="\n ERROR DE COMPILACIÓN (CUP).";
                
                Errores.setText(msjCompi);
             }
              catch(IOException e){
              }
         }
     }
   }
   
   private void AST(){
     System.out.println("Running...");
   }   
   
   public static void main(String[] args){
        new Editor();
    }
}