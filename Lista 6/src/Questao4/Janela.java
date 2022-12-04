package Questao4;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import Questao3.Texto;

public class Janela extends JFrame{
	

	public Janela() {
		
		organizar();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(250,118); 
		setVisible(true);
	}
	
	public void organizar() {
		setLayout(new BorderLayout());
		
		Leitura leitura = new Leitura();
		add(leitura,BorderLayout.NORTH);
	}
}
