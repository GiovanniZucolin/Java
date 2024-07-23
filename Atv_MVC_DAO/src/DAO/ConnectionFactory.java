package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:8080/bdcliente","root","");
		}
		catch(SQLException e){
			throw new RuntimeException();
		}
	}
}
