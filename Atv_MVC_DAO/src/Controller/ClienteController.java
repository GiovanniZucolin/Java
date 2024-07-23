package Controller;

import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import DAO.ClienteDao;
import Model.Cliente;
import View.Form;

import java.awt.event.ActionEvent;

public class ClienteController implements ActionListener {
	
	Form frCliente;
	Cliente cm;
	ClienteDao daoCli = new ClienteDao();
	
	public ClienteController(Form frCliente) {
		this.frCliente = frCliente;
		this.frCliente.getBtCadastrar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.frCliente.getBtCadastrar()) {
			
			cm = new Cliente();
			
			cm.setNome(frCliente.getTxNome().getText());
			cm.setIdade(Integer.parseInt(frCliente.getTxIdade().getText()));
			cm.setCpf(frCliente.getTxCpf().getText());
			
			String resultado = String.format("%s %d %s", cm.getNome(), cm.getIdade(), cm.getCpf());
			
			JOptionPane.showMessageDialog(null, resultado);
			
			try {
				daoCli.adicionar(cm);
			}catch(SQLException e1){
				e1.printStackTrace();
			}
		}
	}
}
