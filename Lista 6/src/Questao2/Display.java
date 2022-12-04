package Questao2;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display extends JPanel{
	
	private JLabel label;
	
	public Display(){
		
		label = new JLabel();
		setBackground(Color.LIGHT_GRAY);
		
		add(label);
	}
	
	public void setLabel(String texto) {
		
		label.setText(texto);
	}
}
