package crud.flyus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import crud.flyus.factory.ConnectionFactory;
import crud.flyus.jdbc.Item;

public class ItemDao {

	
	public void save(Item item){

		String sql = "INSERT INTO item(Nome, Valor, Data_Compra) VALUES(?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
		
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			pstm.setString(1, item.getNome());
			
			pstm.setFloat(2, item.getValor());
			
			pstm.setDate(3, (java.sql.Date) new Date(item.getDatacompra().getTime()));
			
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

	
	
	public void update(Item item) {
		String sql = "UPDATE item SET Nome = ?, Valor = ?, Data_Compra = ?" + "WHERE id = ?";
	
		Connection conn = null;
		PreparedStatement pstm =null;
		
		try {
		conn = ConnectionFactory.createConnectionToMySQL();

		pstm = conn.prepareStatement(sql);
	
		
		pstm.setString(1, item.getNome());
		pstm.setFloat(2, item.getValor());
		pstm.setDate(3, (java.sql.Date) new Date(item.getDatacompra().getTime()));
		
		pstm.setInt(4, item.getId());
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
		
		String sql = "DELETE from item WHERE id = ?";
		
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


	public List<Item> getItens(){
		
		String sql = "SELECT * FROM cliente";
		
		List<Item> item = new ArrayList<Item>();
		
		Connection conn = null;
		PreparedStatement pstm =null;
		
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();
			
			while (rset.next()) {
				Item itens = new Item();
				
				itens.setId(rset.getInt("id"));
				itens.setNome(rset.getString("Nome"));
				itens.setValor(rset.getFloat("Valor"));
				itens.setDatacompra(rset.getDate("Data_Compra"));
				
				item.add(itens);
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
		return item;
	}


	
}
