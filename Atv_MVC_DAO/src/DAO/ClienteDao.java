package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Model.Cliente;

public class ClienteDao {

	private Connection connection;
	
	public ClienteDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adicionar(Cliente cliente) throws SQLException {
		
		try {
			String sql = "insert into cliente (nome, idade, cpf) values (?,?,?)";
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, cliente.getNome());
			stmt.setInt(2, cliente.getIdade());
			stmt.setString(3, cliente.getCpf());
			
			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null, "sucesso");
		}
		catch(SQLException e) {
			System.out.println("Erro: "+e);
		}
		finally {
			connection.close();
		}
	}
}
