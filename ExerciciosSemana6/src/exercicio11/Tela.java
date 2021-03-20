package exercicio11;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Tela implements ActionListener {

	JRadioButton ped, pap, tes;
	JButton jog, zer;
	JLabel usuario, pc, potuacaoUsuario, pontuacaoPc, situacao;
	JPanel ladoEsquerdo, topo, meio, ladoDireito, infos, imagemUsuario, imagemComputador;
	int pUser=0, pComp=0;
	String opcUSUARIO, o;
	
	public Tela () {
		
		JFrame frame = new JFrame("Radio Button");
		frame.setVisible(true);
		frame.setSize(720, 310);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//TOPO
		
		topo = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		ped = new JRadioButton("Pedra");
		ped.setActionCommand("Pedra");
		ped.addActionListener(this);
		topo.add(ped);
		
		pap = new JRadioButton("Papel");
		pap.setActionCommand("Papel");
		pap.addActionListener(this);
		topo.add(pap);
		
		tes = new JRadioButton("Tesoura");
		tes.setActionCommand("Tesoura");
		tes.addActionListener(this);
		topo.add(tes);
		
		ButtonGroup group = new ButtonGroup();
		group.add(ped);
		group.add(pap);
		group.add(tes);
		
		frame.add(topo, BorderLayout.NORTH);
		
		//ESQUERDO
		
		ladoEsquerdo = new JPanel(new GridLayout(1,1));
		imagemUsuario = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		usuario = new JLabel(new ImageIcon("img/pedra.jpg"));
		imagemUsuario.add(usuario);
		
		ladoEsquerdo.add(imagemUsuario);
		frame.add(ladoEsquerdo, BorderLayout.WEST);
		
		
		//CENTRO
		
		meio = new JPanel();
		infos = new JPanel(new GridLayout(5,1));
		
		jog = new JButton("Jogar");
		jog.addActionListener(this);
		infos.add(jog);
		
		situacao = new JLabel("");
		infos.add(situacao);
		
		potuacaoUsuario = new JLabel("Você: " + pUser);
		infos.add(potuacaoUsuario);
		
		pontuacaoPc = new JLabel("Computador: " + pComp);
		infos.add(pontuacaoPc);
		
		zer = new JButton("Zerar");
		zer.addActionListener(this);
		infos.add(zer);
		
		meio.add(infos);
		frame.add(meio, BorderLayout.CENTER);
		
		
		//DIREITO
		
		ladoDireito = new JPanel(new GridLayout(1,1));
		imagemComputador = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		pc = new JLabel(new ImageIcon("img/computador.jpg"));
		imagemComputador.add(pc);
		
		ladoDireito.add(imagemComputador);
		frame.add(ladoDireito, BorderLayout.EAST);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		
		String Opcao[] = {"pedra2", "papel2", "tesoura2"};
		Random random = new Random();

		String str = e.getActionCommand().toString();
		
		if (str.equalsIgnoreCase("Pedra") || str.equalsIgnoreCase("Papel") || str.equalsIgnoreCase("Tesoura") ) {
			opcUSUARIO = str;
		} else {
			opcUSUARIO = "pedra";
		}
		
		usuario.setIcon(new ImageIcon("img/" + opcUSUARIO.toLowerCase() + ".jpg"));
		
		if(e.getActionCommand().equalsIgnoreCase("Jogar")) {
			
			o = Opcao[random.nextInt(Opcao.length)];
			pc.setIcon(new ImageIcon("img/" + o + ".jpg"));
			
			System.out.println("\nUsuário: " + opcUSUARIO);
			System.out.println("Computador " + o);
			
			if (o.equals(opcUSUARIO.toLowerCase() + "2")) {
				situacao.setText("Empate");
			} else if (opcUSUARIO.equals("Pedra")) {
				if(o.equals("tesoura2")) {
					situacao.setText("Você ganhou! =)");
					pUser+=1;
				}else if(o.equals("papel2")) {
					situacao.setText("Você perdeu! =(");
					pComp+=1;
				}
			} else if (opcUSUARIO.equals("Papel")) {
				if(o.equals("tesoura2")) {
					situacao.setText("Você perdeu! =(");
					pComp+=1;
				} else if(o.equals("pedra2")) {
					situacao.setText("Você ganhou! =)");
					pUser+=1;
				}
			} else if (opcUSUARIO.equals("Tesoura")) {
				if(o.equals("papel2")) {
					situacao.setText("Você ganhou! =)");
					pUser+=1;
				}else if(o.equals("pedra2")) {
					situacao.setText("Você perdeu! =(");
					pComp+=1;
				}
			} else {
				situacao.setText("Escolha uma opção!");
			}
			
		} else if (e.getActionCommand().equalsIgnoreCase("Zerar")){
			situacao.setText("");
			pc.setIcon(new ImageIcon("img/computador.jpg"));
			usuario.setIcon(new ImageIcon("img/pedra.jpg"));
			pComp = 0;
			pUser = 0;
		}

		potuacaoUsuario.setText("Você: " + pUser);
		pontuacaoPc.setText("Computador: " + pComp);
		
	}
	
}
