package exercicio7;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela implements ActionListener {

	ImageIcon inicial, carta1, carta2, carta3, carta4;
	JButton button1, button2, button3, button4, button5, button6, button7, button8;
	
	public Tela () {
		
		JFrame frame = new JFrame("Triângulos");
		frame.setVisible(true);
		frame.setSize(500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		inicial = new ImageIcon("imgEx7/carta1.png");
		carta1 = new ImageIcon("imgEx7/carta2.png");
		carta2 = new ImageIcon("imgEx7/carta3.png");
		carta3 = new ImageIcon("imgEx7/carta4.png");
		carta4 = new ImageIcon("imgEx7/carta5.png");
		
		button1 = new JButton(inicial);
		button1.addActionListener(this);
		frame.add(button1);
		
		button2 = new JButton(inicial);
		button2.addActionListener(this);
		frame.add(button2);
		
		button3 = new JButton(inicial);
		button3.addActionListener(this);
		frame.add(button3);
		
		button4 = new JButton(inicial);
		button4.addActionListener(this);
		frame.add(button4);
		
		button5 = new JButton(inicial);
		button5.addActionListener(this);
		frame.add(button5);
		
		button6 = new JButton(inicial);
		button6.addActionListener(this);
		frame.add(button6);
		
		button7 = new JButton(inicial);
		button7.addActionListener(this);
		frame.add(button7);
		
		button8 = new JButton(inicial);
		button8.addActionListener(this);
		frame.add(button8);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		button1.setIcon(carta4);
		button2.setIcon(carta1);
		button3.setIcon(carta2);
		button4.setIcon(carta4);
		button5.setIcon(carta1);
		button6.setIcon(carta2);
		button7.setIcon(carta3);
		button8.setIcon(carta3);

	}

}

