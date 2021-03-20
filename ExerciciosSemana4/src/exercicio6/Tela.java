package exercicio6;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela implements ActionListener {

	JLabel label, alt, pes;
	ImageIcon icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8;
	JButton buttonVer, buttonLimp;
	JTextField altura, peso;
	
	public Tela() {
		
		JFrame frame = new JFrame("Triângulos");
		frame.setVisible(true);
		frame.setSize(500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		icon1 = new ImageIcon("imgEx6/imc.jpg");
		icon2 = new ImageIcon("imgEx6/imc01.jpg");
		icon3 = new ImageIcon("imgEx6/imc02.jpg");
		icon4 = new ImageIcon("imgEx6/imc03.jpg");
		icon5 = new ImageIcon("imgEx6/imc04.jpg");
		icon6 = new ImageIcon("imgEx6/imc05.jpg");
		icon7 = new ImageIcon("imgEx6/imc06.jpg");
		icon8 = new ImageIcon("imgEx6/imc07.jpg");
		
		alt = new JLabel("Altura (cm): ");
		frame.add(alt);
		
		altura = new JTextField(10);
		altura.addActionListener(this);
		frame.add(altura);
		
		pes = new JLabel("Peso (kg): ");
		frame.add(pes);
	
		peso = new JTextField(10);
		peso.addActionListener(this);
		frame.add(peso);
		
		buttonVer = new JButton("Calcular");
		buttonVer.addActionListener(this);
		frame.add(buttonVer);
		
		label = new JLabel(icon1);
		frame.add(label);
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Double alt = Double.parseDouble(altura.getText()) / 100;
		Double pes = Double.parseDouble(peso.getText());
		Double imc;
		
		if (alt==null || pes==null) {
			label.setIcon(icon2);
		} else {
			
			imc = (pes/(alt*alt));
			
			
			if(imc<17) {
				label.setIcon(icon2);
			} else if (imc >= 17 && imc < 18.5) {
				label.setIcon(icon3);
			} else if (imc >= 18.5 && imc < 25) {
				label.setIcon(icon4);
			} else if (imc >= 25 && imc < 30) {
				label.setIcon(icon5);
			} else if (imc >= 30 && imc < 35) {
				label.setIcon(icon6);
			} else if (imc >= 35 && imc < 40) {
				label.setIcon(icon7);
			} else {
				label.setIcon(icon8);
			}
			
		}
		
		
	}
}

