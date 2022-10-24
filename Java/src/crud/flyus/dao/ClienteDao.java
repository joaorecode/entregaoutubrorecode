package crud.flyus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import crud.flyus.factory.ConnectionFactory;
import crud.flyus.jdbc.Cliente;

public class ClienteDao {

	
	public void save(Cliente cliente){

		String sql = "INSERT INTO cliente(nome, telefone, logradouro) VALUES(?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
		
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			pstm.setString(1, cliente.getNome());
			
			pstm.setInt(2, cliente.getTelefone());
			
			pstm.setString(3, cliente.getLogradouro());
			
			pstm.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(pstm != null) {
					pstm.close();
				}
				
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	
	
	public void update(Cliente cliente) {
		String sql = "UPDATE cliente SET nome = ?, telefone = ?, logradouro = ?" + "WHERE id = ?";
	
		Connection conn = null;
		PreparedStatement pstm =null;
		
		try {
		conn = ConnectionFactory.createConnectionToMySQL();

		pstm = conn.prepareStatement(sql);
	
		
		pstm.setString(1, cliente.getNome());
		pstm.setInt(2, cliente.getTelefone());
		pstm.setString(3, cliente.getLogradouro());
		
		pstm.setInt(4, cliente.getId());
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		
		try {
			if(pstm != null) {
				pstm.close();
			}
			
			if(conn != null) {
				conn.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	}


	public void deleteByID(int id) {
		
		String sql = "DELETE from contatos WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm =null;
		
		try {
			
			conn = ConnectionFactory.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, id);
			
			pstm.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(pstm != null) {
					pstm.close();
				}
				
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


	public List<Cliente> getClientes(){
		
		String sql = "SELECT * FROM cliente";
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Connection conn = null;
		PreparedStatement pstm =null;
		
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();
			
			while (rset.next()) {
				Cliente cliente = new Cliente();
				
				cliente.setId(rset.getInt("id"));
				cliente.setNome(rset.getString("nome"));
				cliente.setLogradouro(rset.getString("logradouro"));
				cliente.setTelefone(rset.getInt("telefone"));
				
				clientes.add(cliente);
			}
			
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				
				try {
					if(pstm != null) {
						pstm.close();
					}
					
					if(conn != null) {
						conn.close();
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
		}
		return clientes;
	}


	
}
