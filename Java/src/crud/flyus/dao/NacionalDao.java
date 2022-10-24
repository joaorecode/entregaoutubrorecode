package crud.flyus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import crud.flyus.factory.ConnectionFactory;
import crud.flyus.jdbc.Nacional;

public class NacionalDao {

	
	public void save(Nacional nacional){

		String sql = "INSERT INTO nacionais(data_ida, quantidade, data_volta) VALUES(?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
		
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			pstm.setDate(1, (java.sql.Date) new Date(nacional.getData_ida().getTime()));
			
			pstm.setInt(2, nacional.getQuantidade());
			
			pstm.setDate(3, (java.sql.Date) new Date(nacional.getData_volta().getTime()));
			
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

	
	
	public void update(Nacional nacional) {
		String sql = "UPDATE nacionais SET data_ida = ?, quantidade = ?, data_volta = ?" + "WHERE id = ?";
	
		Connection conn = null;
		PreparedStatement pstm =null;
		
		try {
		conn = ConnectionFactory.createConnectionToMySQL();

		pstm = conn.prepareStatement(sql);
	
		
		pstm.setDate(1, (java.sql.Date) new Date(nacional.getData_ida().getTime()));
		pstm.setInt(2, nacional.getQuantidade());
		pstm.setDate(3, (java.sql.Date) new Date(nacional.getData_volta().getTime()));
		
		pstm.setInt(4, nacional.getId());
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
		
		String sql = "DELETE from nacionais WHERE id = ?";
		
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


	public List<Nacional> getNacionais(){
		
		String sql = "SELECT * FROM nacionais";
		
		List<Nacional> nacionais = new ArrayList<Nacional>();
		
		Connection conn = null;
		PreparedStatement pstm =null;
		
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();
			
			while (rset.next()) {
				Nacional nacional = new Nacional();
				
				nacional.setId(rset.getInt("id"));
				nacional.setData_ida(rset.getDate("data_ida"));
				nacional.setQuantidade(rset.getInt("quantidade"));
				nacional.setData_volta(rset.getDate("data_volta"));
				
				nacionais.add(nacional);
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
		return nacionais;
	}


	
}
