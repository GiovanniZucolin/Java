package View;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Form extends JFrame {
	JLabel lbNome, lbIdade, lbCpf;
	JTextField txNome, txIdade, txCpf;
	JButton btCadastrar;
	
	public JTextField getTxNome() {
		return txNome;
	}

	public JTextField getTxIdade() {
		return txIdade;
	}

	public JTextField getTxCpf() {
		return txCpf;
	}

	public JButton getBtCadastrar() {
		return btCadastrar;
	}

	
	
	public Form(){
		
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Cadastro de clientes");
		
		Container janela = getContentPane();
		janela.setLayout(null);
		
		lbNome = new JLabel();
		lbNome.setText("Nome:");
		lbNome.setBounds(30, 30, 100, 25);
		janela.add(lbNome);
		
		lbIdade = new JLabel();
		lbIdade.setText("Idade:");
		lbIdade.setBounds(30, 100, 100, 25);
		janela.add(lbIdade);
		
		lbCpf = new JLabel();
		lbCpf.setText("Cpf:");
		lbCpf.setBounds(30, 170, 100, 25);
		janela.add(lbCpf);
		
		txNome = new JTextField();
		txNome.setBounds(30, 60, 100, 25);
		janela.add(txNome);
		
		txIdade = new JTextField();
		txIdade.setBounds(30, 130, 100, 25);
		janela.add(txIdade);
		
		txCpf = new JTextField();
		txCpf.setBounds(30, 200, 100, 25);
		janela.add(txCpf);
		
		btCadastrar = new JButton();
		btCadastrar.setText("Cadastrar");
		btCadastrar.setBounds(30, 250, 100, 25);
		janela.add(btCadastrar);
		
		setVisible(true);
	}
}
