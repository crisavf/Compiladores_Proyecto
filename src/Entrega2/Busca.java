/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrega2;

import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import javax.swing.*;

/**
 *
 * @author Wally
*/




public class Busca extends JDialog implements ActionListener
{
	JLabel LBus=new JLabel("Buscar:");
	JTextField TPalabra=new JTextField(10);
	JButton Buscar=new JButton("Buscar Siguiente");
	int Posicion;
	
	Editor ed;
	
	Busca(JFrame DBuscar,String s,boolean b)
	{
	super(DBuscar);
	ed=(Editor) DBuscar;//(Compilador)DBuscar;
	/*
        ed.ponerTexto("sirve ");
        ed.Errores.updateUI();
        System.out.println("casacasa");*/
        
        
	Buscar.addActionListener(this);
	setLayout(new GridLayout(1,3));
	setLayout(new FlowLayout());
	add(LBus);
	add(TPalabra);
	add(Buscar);
	
	setTitle("Buscar...");
	setSize(325,75);
	setResizable(false);
	setLocation(100,100);
    setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==Buscar)
		{
			ed.Texto.requestFocus();
			String Palabra="";
			String TextoBusc="";
		 	Palabra=TPalabra.getText();
		 	TextoBusc=ed.Texto.getText();
		 	Posicion=TextoBusc.indexOf(Palabra,Posicion);
		 	if(Posicion!=-1)
		 	ed.Texto.select(Posicion,Posicion + Palabra.length()); 
		 	else JOptionPane.showMessageDialog(this,"No se ha encontrado: " + Palabra);
		 	Posicion++;	 

		}
	}
}