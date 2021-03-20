package exercicio1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela implements ActionListener {

	JTextField textField;
	JButton button;
	JLabel label, resposta;
	
	public Tela () {
		
		JFrame frame = new JFrame("Eh Primo?");
		frame.setVisible(true);
		frame.setSize(200, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		label = new JLabel("Digite um número:");
		frame.add(label);
		
		textField = new JTextField(10);
		textField.addActionListener(this);
		textField.setActionCommand("");
		frame.add(textField);
		
		button = new JButton("Verificar");
		button.addActionListener(this);
		frame.add(button);
		
		resposta = new JLabel("");
		frame.add(resposta);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int var = Integer.parseInt(textField.getText());
		
		if(ehPrimo(var)) {
			resposta.setText("O número " + var + " é primo!");
		} else {
			resposta.setText("O número " + var + " não é primo!");
		}

	}
	
	public static boolean ehPrimo(int numero) {
	    for (int j = 2; j < numero; j++) {
	        if (numero % j == 0)
	            return false;   
	    }
	    return true;
	}
	
}
