package crud.flyus.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
		//Usuário
		private static final String USERNAME = "root";
		//Senha
		private static final String PASSWORD = "355543482";
		//URL
		private static final String DATABASE_URL = "jdbc:mysql://localhost:3307/flyus";
		
		//Conexao
		public static Connection createConnectionToMySQL() throws Exception {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
			
			return connection;
		}
		
		public static void main(String[] args) throws Exception{
			
			Connection con = createConnectionToMySQL();
			
			if(con != null) {
				System.out.println("Conexão obtida com sucesso!");
				con.close();
			}
		}

}