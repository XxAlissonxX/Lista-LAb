package Questao1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Questao1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao1 window = new Questao1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Questao1() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JPanel panel = new JPanel();
		panel.setBounds(12,49,426,202);
		frame.getContentPane().add(panel);
		
		
		JButton btnNewButton = new JButton("Amarelo"); 
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.YELLOW);
			}			
		});
		btnNewButton.setBounds(12,12,117,25);
		frame.getContentPane().add(btnNewButton);
		
		
		JButton btnNewButton1 = new JButton("Verde"); 
		btnNewButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.GREEN);
			}			
		});
		
		btnNewButton1.setBounds(150, 12, 117, 25);;
		frame.getContentPane().add(btnNewButton1);
		
		
		JButton btnNewButton2 = new JButton("Azul"); 
		btnNewButton2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.BLUE);
			}			
		});
		
		btnNewButton2.setBounds(288, 12, 117, 25);;
		frame.getContentPane().add(btnNewButton2);
	}

}
