package exercicio12;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaResultado extends JFrame {
	
	JLabel label;
	JTextField result, votos;
	ImageIcon icon1, icon2, icon3;
	
	public TelaResultado() {
		
		setTitle("Resultado");
		setSize(250, 200);
		setLayout(new FlowLayout());
		
		icon1 = new ImageIcon("img/futebol.jpg");
		icon2 = new ImageIcon("img/volei.jpg");
		icon3 = new ImageIcon("img/basquete.jpg");
		
		label = new JLabel("Mais votados: ");
		add(label);
		
		result = new JTextField(10);
		add(result);
		result.setEditable(false);
		
		label = new JLabel("Qtd de Votos: ");
		add(label);
		
		votos = new JTextField(10);
		add(votos);
		votos.setEditable(false);
		
		label = new JLabel(icon1);
		add(label);
		
	}
	
	public void setComponentes(String res, int vt) {
		result.setText(res);
		votos.setText(vt + "");
		
		if(res != null && res == "Futebol") {
			label.setIcon(icon1);
		} else if (res != null && res == "Vôlei") {
			label.setIcon(icon2);
		} else if (res != null && res == "Basquete") {
			label.setIcon(icon3);
		}
		
	}
	
}
