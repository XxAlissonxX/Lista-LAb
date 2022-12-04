package Questao3;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Janela extends JFrame{
	
	public Janela() {
		
		organizar();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(400,120); 
		setVisible(true);
	}
	
	public void organizar() {
		
		setLayout(new BorderLayout());
		
		Texto texto = new Texto();
		add(texto,BorderLayout.CENTER);
	}
}
