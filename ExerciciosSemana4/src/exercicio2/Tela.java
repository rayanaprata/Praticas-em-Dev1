package exercicio2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela implements ActionListener {

	JTextField textField1, textField2;
	JButton button1, button2, button3, button4;
	JLabel label, resposta;
	
	public Tela () {
		
		JFrame frame = new JFrame("Operações Matemáticas");
		frame.setVisible(true);
		frame.setSize(400, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		label = new JLabel("Digite um número:");
		frame.add(label);
		
		textField1 = new JTextField(10);
		textField1.addActionListener(this);
		textField1.setActionCommand("");
		frame.add(textField1);
		
		textField2 = new JTextField(10);
		textField2.addActionListener(this);
		textField2.setActionCommand("");
		frame.add(textField2);
		
		button1 = new JButton("Somar");
		button1.addActionListener(this);
		frame.add(button1);
		
		button1 = new JButton("Multiplicar");
		button1.addActionListener(this);
		frame.add(button1);
		
		button1 = new JButton("Subtrair");
		button1.addActionListener(this);
		frame.add(button1);
		
		button1 = new JButton("Dividir");
		button1.addActionListener(this);
		frame.add(button1);
		
		resposta = new JLabel("");
		frame.add(resposta);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Calculos calculo = new CalculosImpl(); 
		
		int n1 = Integer.parseInt(textField1.getText());
		int n2 = Integer.parseInt(textField2.getText());
		int result;
		
		if (textField1 == null || textField2 == null ) {
			resposta.setText("Falta um número!");
		} else {
			
			if(e.getActionCommand().equalsIgnoreCase("Somar")) {
				result = calculo.Somar(n1, n2);	
				resposta.setText("Resultado: " + n1 + " + " + n2 + " = " + result);
				
			} else if (e.getActionCommand().equalsIgnoreCase("Multiplicar")) {
				result = calculo.Multiplicar(n1, n2);
				resposta.setText("Resultado: " + n1 + " * " + n2 + " = " + result);
				
			} else if (e.getActionCommand().equalsIgnoreCase("Subtrair")) {
				result = calculo.Subtrair(n1, n2);
				resposta.setText("Resultado: " + n1 + " - " + n2 + " = " + result);
				
			} else if (e.getActionCommand().equalsIgnoreCase("Dividir")) {
				result = calculo.Dividir(n1, n2);
				resposta.setText("Resultado: " + n1 + " / " + n2 + " = " + result);
			}
			
		}
		

	}
	
}
