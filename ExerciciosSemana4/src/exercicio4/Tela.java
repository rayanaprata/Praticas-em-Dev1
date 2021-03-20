package exercicio4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela implements ActionListener {

	JTextField textField, result;
	JButton button;
	JLabel label;
	
	public Tela () {
		
		JFrame frame = new JFrame("Inverter");
		frame.setVisible(true);
		frame.setSize(200, 160);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		label = new JLabel("Digite um texto:");
		frame.add(label);
		
		textField = new JTextField(10);
		textField.addActionListener(this);
		textField.setActionCommand("");
		frame.add(textField);
		
		result = new JTextField(10);
		frame.add(result);
		result.setEditable(false);
		
		button = new JButton("Inverter");
		button.addActionListener(this);
		frame.add(button);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String aux = textField.getText();
		String res = "";
		
		for(int i=0; i<aux.length(); i++){
			res = res + aux.charAt(aux.length()-i-1);
		}
		
		result.setText(res);

	}
	
}
