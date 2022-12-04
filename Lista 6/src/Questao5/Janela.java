package Questao5;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Janela extends JFrame{
	
	public Janela() {
		
		organizar();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(200,130); 
		setVisible(true);
	}
	
	public void organizar() {
		setLayout(new BorderLayout());
		
		Painel painel = new Painel();
		
		add(painel,BorderLayout.CENTER);
	}
}
