package Questao4;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Leitura extends JPanel implements ActionListener{
	
	private JTextField num1;
	private JTextField num2;
	private JTextField maior;
	private JTextField menor;
	private JTextField media;
	private double n1,n2,mai,men,med;
	
	public Leitura() {
		
		setLayout(new GridLayout(7,1));
		
		num1 = new JTextField (20);
		num2 = new JTextField (20);
		
		
		Botao b = new Botao("Enviar");
		b.addActionListener(this);
		b.setBackground((Color.LIGHT_GRAY));
		
		add(num1);
		add(num2);
		
		add(b);
		
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
		med = (n1+n2)/2;
		
		if(n1>n2) {
			mai = n1;
			men = n2;
		}else if(n2>n1) {
			mai = n2;
			men = n1;
		}
		
		maior = new JTextField (20);
		menor = new JTextField (20);
		media = new JTextField (20);
		
		maior.setText("Maior: "+String.valueOf(mai));
		menor.setText("Menor: "+String.valueOf(men));
		media.setText("Media: "+String.valueOf(med));
		JOptionPane.showMessageDialog(null,maior.getText()+"\n"+menor.getText()+
				"\n"+media.getText());
		
		setVisible(true);
		add(maior);
		add(menor);
		add(media);
	}

}
