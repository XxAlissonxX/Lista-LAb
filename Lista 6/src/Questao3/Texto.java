package Questao3;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Texto extends JPanel implements ActionListener{
	
	private  JTextField texto;
	
	public Texto() {
		
		setLayout(new FlowLayout());
		
		texto = new JTextField (20);
		Botao b = new Botao("Enviar");
		b.addActionListener(this);
		
		add(texto);
		add(b);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		
		JOptionPane.showMessageDialog(null,"Digitação: "+texto.getText());
		
		System.out.println(texto.getText());
	}
}
