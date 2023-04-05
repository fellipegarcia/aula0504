package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	public static Connection getConexao() {
		Connection cnx = null;
		String driverName ="com.myswl.cj.jdbc.Driver!";
		
		//METODO P/ ABRIR UMA CONEXAO
	
		try  {
			Class.forName(driverName);
			
			String serverName = "localhost:3306";
			String dataBase = "finalDB";
			String url = "jdbc:mysql://" + serverName + "/" + dataBase;
			String user ="root";
			String password = "";
			
			
			try {
				cnx = DriverManager.getConnection(url, user, password);
				return cnx;
				
			} catch (SQLException e) {
				System.out.println("Não foi possível conectar ao banco de dados.");
				return null;
			}
		} catch (ClassNotFoundException e) {
			System.out.println("O driver especificado não foi encontrado");
			return null;
			
		}
				
				
	}
	
	//METODO P/ FECHAR CONEXAO
	
		public static boolean fecharConexao() {
			try {
				Dao.getConexao().close();
				return true;
			} catch (SQLException e) {
				return false;
			}
			
		}
}
