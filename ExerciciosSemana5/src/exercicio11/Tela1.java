package exercicio11;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela1 implements ActionListener, ItemListener {
	
	JTextField textField;
	JLabel label;
	JButton button1, button2;
	JCheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5;
	int total, count, subtotal;
	
	public Tela1 () {
		
		JFrame frame = new JFrame("Lanche");
		frame.setVisible(true);
		frame.setSize(160, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		label = new JLabel("Itens Selecionados:");
		frame.add(label);
		
		checkBox1 = new JCheckBox("Opção 1");
		checkBox1.addItemListener(this);
		frame.add(checkBox1);
		
		checkBox2 = new JCheckBox("Opção 2");
		checkBox2.addItemListener(this);
		frame.add(checkBox2);
		
		checkBox3 = new JCheckBox("Opção 3");
		checkBox3.addItemListener(this);
		frame.add(checkBox3);
		
		checkBox4 = new JCheckBox("Opção 4");
		checkBox4.addItemListener(this);
		frame.add(checkBox4);
		
		checkBox5 = new JCheckBox("Opção 5");
		checkBox5.addItemListener(this);
		frame.add(checkBox5);
		
		button1 = new JButton("Adicionar");
		button1.addActionListener(this);
		frame.add(button1);
		
		label = new JLabel("Valor Total:");
		frame.add(label);
		
		textField = new JTextField(10);
		frame.add(textField);
		textField.setEditable(false);
		
		button2 = new JButton("Limpar");
		button2.addActionListener(this);
		frame.add(button2);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equalsIgnoreCase("Adicionar")) {
			
			total = count;
			
			checkBox1.setSelected(false);
			checkBox2.setSelected(false);
			checkBox3.setSelected(false);
			checkBox4.setSelected(false);
			checkBox5.setSelected(false);
			
		} else if (e.getActionCommand().equalsIgnoreCase("Limpar")){
			
			checkBox1.setSelected(false);
			checkBox2.setSelected(false);
			checkBox3.setSelected(false);
			checkBox4.setSelected(false);
			checkBox5.setSelected(false);
			
			total=0;
			textField.setText("R$ " + total + ",00");	
			
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		count=total;
		
		if(checkBox1.isSelected())
			count+=10;
		
		if(checkBox2.isSelected())
			count+=20;
		
		if(checkBox3.isSelected())
			count+=30;
		
		if(checkBox4.isSelected())
			count+=40;
		
		if(checkBox5.isSelected())
			count+=50;
		
		textField.setText("R$ " + count + ",00");	
		
	}

}
