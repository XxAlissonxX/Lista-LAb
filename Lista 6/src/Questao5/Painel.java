package Questao5;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Questao4.Botao;

public class Painel extends JPanel implements ActionListener{
		
	private JTextField num1;
	private JTextField num2;
	private JComboBox box;
	private double n1,n2,soma,mult;
	
	public Painel(){
		setLayout(new GridLayout(4,1));
		
		num1 = new JTextField(20);
		num2 = new JTextField(20);
		
		Botao b = new Botao("Calcular");
		b.addActionListener(this);
		b.setBackground((Color.LIGHT_GRAY));
		
		String s1[]= {"Soma","Multiplicar"};
		
		box = new JComboBox(s1);
		
		add(num1);
		add(num2);
		add(b);
		add(box);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		
		try {
		n1 = Double.parseDouble(num1.getText());
		n2 = Double.parseDouble(num2.getText());
		
		 } catch (NumberFormatException numberFormatException) {
	            return;
	        }
		
		if(box.getSelectedItem() == "Soma") {
			soma = n1 + n2;
			JOptionPane.showMessageDialog(null,soma);
		}else if(box.getSelectedItem() == "Multiplicar") {
			mult = n1 * n2;
			JOptionPane.showMessageDialog(null,mult);
		}
		
		
	}
}
