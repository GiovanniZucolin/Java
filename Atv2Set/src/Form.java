import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Form extends JFrame {
	
	JLabel lbEmail, lbSenha, lbRegiao, lbData, lbInfo;
	JTextField txEmail, txSenha;
	JRadioButton rbOp1, rbOp2, rbOp3, rbOp4, rbOp5;
	ButtonGroup bgr1;
	JCheckBox cb1, cb2;
	JComboBox<Integer> cbDia, cbMes, cbAno;
	JButton btCadastrar;
	
	public Form() {
		setSize(700, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
		setTitle("Cadastrar Conta");
    
		Container janela = getContentPane();
		janela.setLayout(null);
		
		lbEmail = new JLabel();
		lbEmail.setText("Email: ");
		lbEmail.setBounds(30, 30, 100, 25);
		janela.add(lbEmail);
		
		lbSenha = new JLabel();
		lbSenha.setText("Senha: ");
		lbSenha.setBounds(30, 100, 100, 25);
		janela.add(lbSenha);
		
		lbRegiao = new JLabel();
		lbRegiao.setText("Região: ");
		lbRegiao.setBounds(30, 170, 100, 25);
		janela.add(lbRegiao);
		
		lbData = new JLabel();
		lbData.setText("Data de nascimento: ");
		lbData.setBounds(30, 240, 150, 25);
		janela.add(lbData);
		
		lbInfo = new JLabel();
		lbInfo.setBounds(30, 450, 300, 100);
		janela.add(lbInfo);
		
		txEmail = new JTextField();
		txEmail.setBounds(30, 60, 200, 25);
		janela.add(txEmail);
		
		txSenha = new JTextField();
		txSenha.setBounds(30, 130, 150, 25);
		janela.add(txSenha);
		
		bgr1 = new ButtonGroup();
		rbOp1 = new JRadioButton();
		rbOp1.setText("América");
		rbOp1.setBounds(30, 200, 75, 25);
		bgr1.add(rbOp1);
		janela.add(rbOp1);
		
		rbOp2 = new JRadioButton();
		rbOp2.setText("Europa");
		rbOp2.setBounds(120, 200, 75, 25);
		bgr1.add(rbOp2);
		janela.add(rbOp2);
		
		rbOp3 = new JRadioButton();
		rbOp3.setText("África");
		rbOp3.setBounds(210, 200, 75, 25);
		bgr1.add(rbOp3);
		janela.add(rbOp3);
		
		rbOp4 = new JRadioButton();
		rbOp4.setText("Ásia");
		rbOp4.setBounds(300, 200, 50, 25);
		bgr1.add(rbOp4);
		janela.add(rbOp4);
		
		rbOp5 = new JRadioButton();
		rbOp5.setText("Oceania");
		rbOp5.setBounds(390, 200, 100, 25);
		bgr1.add(rbOp5);
		janela.add(rbOp5);
		
		cbDia = new JComboBox<Integer>();
		for(int cont = 0; cont <= 31; cont++) {
			cbDia.addItem(cont);
		}
		cbDia.setBounds(30, 270, 50, 25);
		janela.add(cbDia);
		
		cbMes = new JComboBox<Integer>();
		for(int cont = 0; cont <= 12; cont++) {
			cbMes.addItem(cont);
		}
		cbMes.setBounds(90, 270, 50, 25);
		janela.add(cbMes);
		
		cbAno = new JComboBox<Integer>();
		cbAno.addItem(0);
		for(int cont = 1970; cont <= 2010; cont++) {
			cbAno.addItem(cont);
		}
		cbAno.setBounds(150, 270, 60, 25);
		janela.add(cbAno);
		
		cb1 = new JCheckBox();
		cb1.setText("Aceito Receber Notificaçãoes.");
		cb1.setBounds(30, 340, 200, 25);
		janela.add(cb1);
		
		cb2 = new JCheckBox();
		cb2.setText("Concordo com os termos de privacidade.");
		cb2.setBounds(250, 340, 350, 25);
		janela.add(cb2);
		
		btCadastrar = new JButton();
		btCadastrar.setText("Cadastrar");
		btCadastrar.setBounds(30, 400, 100, 25);
		janela.add(btCadastrar);
		btCadastrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rbOp1.isSelected()==false & rbOp2.isSelected()==false & rbOp3.isSelected()==false & rbOp4.isSelected()==false & rbOp5.isSelected()==false || txEmail.getText().isEmpty() || txSenha.getText().isEmpty() || cb2.isSelected()==false || cbDia.getSelectedIndex() == 0 || cbMes.getSelectedIndex() == 0 || cbAno.getSelectedIndex() == 0) {
 					JOptionPane.showMessageDialog(null, "Preencha todos os campos.\nConcorde com os termos de privacidade.","Erro",JOptionPane.ERROR_MESSAGE);
				}else{
					String rb = "";
					if(rbOp1.isSelected()) {
						rb+=rbOp1.getText();
					}
					else if(rbOp2.isSelected()) {
						rb+=rbOp2.getText();
					}
					else if(rbOp3.isSelected()){
						rb+=rbOp3.getText();
					}
					else if(rbOp4.isSelected()){
						rb+=rbOp4.getText();
					}
					else{
						rb+=rbOp5.getText();
					}
					lbInfo.setText("<html>Email: "+txEmail.getText()+"<br/>Senha: "+txSenha.getText()+"<br/>Região: "+rb+"<br/>Data de nascimento: "+String.valueOf(cbDia.getSelectedItem())+"/"+String.valueOf(cbMes.getSelectedItem())+"/"+String.valueOf(cbAno.getSelectedItem()));
				}
			}
		});
		setVisible(true);
	}
}
