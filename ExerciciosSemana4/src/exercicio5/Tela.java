package exercicio5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela implements ActionListener {

	ImageIcon icon1, icon2, icon3, icon4, icon5;
	JTextField textFieldLado1, textFieldLado2, textFieldLado3;
	JButton button1, button2;
	JLabel label, label1, label2, label3, resposta;
	
	public Tela () {
		
		JFrame frame = new JFrame("Triângulos");
		frame.setVisible(true);
		frame.setSize(200, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		icon1 = new ImageIcon("imgEx5/erro.png");
		icon2 = new ImageIcon("imgEx5/tri.jpg");
		icon3 = new ImageIcon("imgEx5/tri-equilatero.jpg");
		icon4 = new ImageIcon("imgEx5/tri-escaleno.jpg");
		icon5 = new ImageIcon("imgEx5/tri-isoceles.jpg");
		
		label1 = new JLabel("Lado 1");
		frame.add(label1);
		
		textFieldLado1 = new JTextField(10);
		textFieldLado1.addActionListener(this);
		frame.add(textFieldLado1);
		
		label2 = new JLabel("Lado 2");
		frame.add(label2);
		
		textFieldLado2 = new JTextField(10);
		textFieldLado2.addActionListener(this);
		frame.add(textFieldLado2);
		
		label3 = new JLabel("Lado 3");
		frame.add(label3);
		
		textFieldLado3 = new JTextField(10);
		textFieldLado3.addActionListener(this);
		frame.add(textFieldLado3);
		
		button1 = new JButton("Verificar");
		button1.addActionListener(this);
		frame.add(button1);
		
		button2 = new JButton("Limpar");
		button2.addActionListener(this);
		frame.add(button2);
		
		resposta = new JLabel("");
		frame.add(resposta);
		
		label = new JLabel(icon2);
		frame.add(label);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Integer lado1 = Integer.parseInt(textFieldLado1.getText());
		Integer lado2 = Integer.parseInt(textFieldLado2.getText());
		Integer lado3 = Integer.parseInt(textFieldLado3.getText());
	
		if(e.getActionCommand().equalsIgnoreCase("Verificar")) {
			
			if (lado1 == null || lado2 == null || lado3 == null) {
				resposta.setText("Digite todos os valores!");
	        	label.setIcon(icon1);
			} else {
				
				if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
		            if (lado1 == lado2 && lado1 == lado3) {
		                //Triangulo Equilatero
		            	resposta.setText("Triângulo Equilátero!");
		            	label.setIcon(icon3);
		            } else if ((lado1 == lado2) || (lado1 == lado3)) {
		                //Triangulo Isosceles
		            	resposta.setText("Triângulo Isóceles!");
		            	label.setIcon(icon5);
		            } else {
		                //Triângulo Escaleno
		            	resposta.setText("Triângulo Escaleno!");
		            	label.setIcon(icon4);
		            }
		        } else {
		            //Não é um triangulo!
		        	resposta.setText("Triângulo inválido");
		        	label.setIcon(icon1);
		        } 
				
			}
			
		} else if (e.getActionCommand().equalsIgnoreCase("Limpar")) {
			lado1 = null;
			lado2 = null;
			lado3 = null;
			label.setIcon(icon2);
			
		}

	}

}
