package exercicio31;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela implements ActionListener {

	ImageIcon icon1, icon2, icon3, icon4, icon5;
	JTextField textFieldLado1, textFieldLado2, textFieldLado3;
	JButton button1, button2;
	JLabel label, label1, label2, label3;
	JPanel ladoEsquerdo, bordaDireita;
	
	public Tela () {
		
		JFrame frame = new JFrame("Triângulos");
		frame.setVisible(true);
		frame.setSize(450, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		icon1 = new ImageIcon("img/erro.png");
		icon2 = new ImageIcon("img/tri.jpg");
		icon3 = new ImageIcon("img/tri-equilatero.jpg");
		icon4 = new ImageIcon("img/tri-escaleno.jpg");
		icon5 = new ImageIcon("img/tri-isoceles.jpg");
		
		ladoEsquerdo = new JPanel(new GridLayout(6,2));
		
		label1 = new JLabel("Lado 1");
		ladoEsquerdo.add(label1);
		
		textFieldLado1 = new JTextField(10);
		textFieldLado1.addActionListener(this);
		ladoEsquerdo.add(textFieldLado1);
		
		label2 = new JLabel("Lado 2");
		ladoEsquerdo.add(label2);
		
		textFieldLado2 = new JTextField(10);
		textFieldLado2.addActionListener(this);
		ladoEsquerdo.add(textFieldLado2);
		
		label3 = new JLabel("Lado 3");
		ladoEsquerdo.add(label3);
		
		textFieldLado3 = new JTextField(10);
		textFieldLado3.addActionListener(this);
		ladoEsquerdo.add(textFieldLado3);
		
		button1 = new JButton("Verificar Tipo");
		button1.addActionListener(this);
		ladoEsquerdo.add(button1);
		
		frame.add(ladoEsquerdo, BorderLayout.WEST);
		
		label = new JLabel(icon2);
		frame.add(label, BorderLayout.CENTER);
		
		bordaDireita = new JPanel(new GridLayout(1,2));
		frame.add(bordaDireita, BorderLayout.EAST);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Integer lado1 = Integer.parseInt(textFieldLado1.getText());
		Integer lado2 = Integer.parseInt(textFieldLado2.getText());
		Integer lado3 = Integer.parseInt(textFieldLado3.getText());
	
		if(e.getActionCommand().equalsIgnoreCase("Verificar Tipo")) {
			
			if (lado1 == null || lado2 == null || lado3 == null) {
				 label.setIcon(icon1);
			} else {
				
				if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
		            if (lado1 == lado2 && lado1 == lado3) {
		                //Triangulo Equilatero
		            	label.setIcon(icon3);
		            } else if ((lado1 == lado2) || (lado1 == lado3)) {
		                //Triangulo Isosceles
		            	label.setIcon(icon5);
		            } else {
		                //Triângulo Escaleno
		            	label.setIcon(icon4);
		            }
		        } else {
		            //Não é um triangulo!
		        	label.setIcon(icon1);
		        } 
				
			}
			
		}

	}

}
