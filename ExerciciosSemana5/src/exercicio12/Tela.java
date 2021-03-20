package exercicio12;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela implements ActionListener, ItemListener {
	
	JLabel label;
	JButton button1, button2;
	JCheckBox checkBox1, checkBox2, checkBox3;
	TelaResultado telaResult;
	int futebol=0, volei=0, basquete=0;
	
	public Tela () {
		
		JFrame frame = new JFrame("Esportes");
		frame.setVisible(true);
		frame.setSize(250, 140);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		label = new JLabel("Quais esportes você pratica?");
		frame.add(label);
		
		checkBox1 = new JCheckBox("Futebol");
		checkBox1.addItemListener(this);
		frame.add(checkBox1);
		
		checkBox2 = new JCheckBox("Vôlei");
		checkBox2.addItemListener(this);
		frame.add(checkBox2);
		
		checkBox3 = new JCheckBox("Basquete");
		checkBox3.addItemListener(this);
		frame.add(checkBox3);
		
		button1 = new JButton("Votar");
		button1.addActionListener(this);
		frame.add(button1);
		
		button2 = new JButton("Terminar");
		button2.addActionListener(this);
		frame.add(button2);
		
		telaResult = new TelaResultado();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equalsIgnoreCase("Votar")) {
				
			checkBox1.setSelected(false);
			checkBox2.setSelected(false);
			checkBox3.setSelected(false);
			
		} else if (e.getActionCommand().equalsIgnoreCase("Terminar")) {
			
			String str;
			int votos=0;
			
			if (futebol > volei && futebol > basquete) {
				str = "Futebol";
				votos=futebol;
			} else if (volei > futebol && volei > basquete) {
				str = "Vôlei";
				votos=volei;
			} else {
				str = "Basquete";
				votos=basquete;
			}
			
			telaResult.setVisible(true);
			telaResult.setComponentes(str, votos);
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(checkBox1.isSelected())
			futebol+=1;
		
		if(checkBox2.isSelected())
			volei+=1;
		
		if(checkBox3.isSelected())
			basquete+=1;
		
	}

}

