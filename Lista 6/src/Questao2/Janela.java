package Questao2;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Janela extends JFrame{
	
	public Janela() {
		
		organizador();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,300);
		
		setVisible(true);
	}
	
	public void organizador() {
		
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(300,100));
		add(display,BorderLayout.NORTH);
		
		Tecla tecla = new Tecla(display);
		display.setPreferredSize(new Dimension(300,150));
		add(tecla,BorderLayout.CENTER);
	}
}
