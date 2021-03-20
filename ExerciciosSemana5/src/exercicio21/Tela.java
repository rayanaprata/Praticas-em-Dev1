package exercicio21;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela implements ActionListener {

	JComboBox<Integer> comboBox;
	JButton mais, menos;
	ImageIcon add, minus;
	JLabel label;
	JTextField result;
	int total=0;
	
	public Tela() {
		
		JFrame frame = new JFrame("Contador");
		frame.setVisible(true);
		frame.setSize(240, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		label = new JLabel("Contador");
		frame.add(label);
		
		result = new JTextField(5);
		frame.add(result);
		result.setEditable(false);
		
		Integer[] valores = {1, 2, 3, 4, 5};
		
		comboBox = new JComboBox<Integer>(valores);
		comboBox.addActionListener(this);
		frame.add(comboBox);
		
		add = new ImageIcon("img/add.png");
		minus = new ImageIcon("img/minus.png");
		
		mais = new JButton(add);
		mais.addActionListener(this);
		frame.add(mais);
		
		menos = new JButton(minus);
		menos.addActionListener(this);
		frame.add(menos);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (mais.getIcon().toString().equalsIgnoreCase("img/add.png")) {
			
			String str = comboBox.getSelectedItem().toString();
			total += Integer.parseInt(str);
			result.setText("" + total);
			
		} else if (menos.getIcon().toString().equalsIgnoreCase("img/minus.png")) {
			
			String str = comboBox.getSelectedItem().toString();
			total -= Integer.parseInt(str);
			result.setText("" + total);
			
		}
		
	}

}
