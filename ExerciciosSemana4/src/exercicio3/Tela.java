package exercicio3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela implements ActionListener {

	JTextField textField, tFmaior, tFmenor, tFmedia;
	JButton button1, button2;
	JLabel label, maior, menor, media, resposta;
	ArrayList<Integer> values = new ArrayList<>();
	
	public Tela () {
		
		JFrame frame = new JFrame("Números");
		frame.setVisible(true);
		frame.setSize(100, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		label = new JLabel("Digite os números:");
		frame.add(label);
		
		textField = new JTextField(10);
		textField.addActionListener(this);
		textField.setActionCommand("");
		frame.add(textField);
		
		button1 = new JButton("Adicionar");
		button1.addActionListener(this);
		frame.add(button1);
		
		maior = new JLabel("Maior: ");
		frame.add(maior);
		
		tFmaior = new JTextField(10);
		frame.add(tFmaior);
		tFmaior.setEditable(false);
		
		menor = new JLabel("Menor: ");
		frame.add(menor);
		
		tFmenor = new JTextField(10);
		frame.add(tFmenor);
		tFmenor.setEditable(false);
		
		media = new JLabel("Média: ");
		frame.add(media);
		
		tFmedia = new JTextField(10);
		frame.add(tFmedia);
		tFmedia.setEditable(false);
		
		button2 = new JButton("Calcular");
		button2.addActionListener(this);
		frame.add(button2);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int men=0, mai=0, med=0, total=0, qtd=0;
		
		if(e.getActionCommand().equalsIgnoreCase("Adicionar")) {
			values.add(Integer.parseInt(textField.getText()));
			
		} else if (e.getActionCommand().equalsIgnoreCase("Calcular")) {
			
			for (Integer valores : values) {
				if (valores > mai) {
					mai = valores;
				} else {
					men = valores;
				}
				qtd++;
				total = total + valores;
			}
				
			med = total / qtd;
			
			tFmaior.setText("" + mai + "");
			tFmenor.setText("" + men + "");
			tFmedia.setText("" + med + "");

		}
	
	}
}
