package Questao2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Tecla extends JPanel implements ActionListener{
	private Display display;
	
	public Tecla(Display display) {
		this.display = display;
		setLayout(new FlowLayout());
		
		add(criarBotao("Java"));
		add(criarBotao("JavaScript"));
		add(criarBotao("Python"));
		add(criarBotao("C++"));
		add(criarBotao("C#"));
		add(criarBotao("C"));
		
		
	}
	
	public Botao criarBotao(String posicao) {
		
		Botao b = new Botao(posicao);
		b.addActionListener(this);
		return b;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		
		display.setLabel(b.getText());
		System.out.println(b.getText());
	}
}
