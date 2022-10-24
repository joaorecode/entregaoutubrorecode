package crud.flyus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import crud.flyus.factory.ConnectionFactory;
import crud.flyus.jdbc.Internacional;

public class InternacionalDao {

	
	public void save(Internacional internacional){

		String sql = "INSERT INTO internacionais(data_ida, quantidade, data_volta) VALUES(?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
		
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			pstm.setDate(1, (java.sql.Date) new Date(internacional.getData_ida().getTime()));
			
			pstm.setInt(2, internacional.getQuantidade());
			
			pstm.setDate(3, (java.sql.Date) new Date(internacional.getData_volta().getTime()));
			
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

	
	
	public void update(Internacional internacional) {
		String sql = "UPDATE internacionais SET data_ida = ?, quantidade = ?, data_volta = ?" + "WHERE id = ?";
	
		Connection conn = null;
		PreparedStatement pstm =null;
		
		try {
		conn = ConnectionFactory.createConnectionToMySQL();

		pstm = conn.prepareStatement(sql);
	
		
		pstm.setDate(1, (java.sql.Date) new Date(internacional.getData_ida().getTime()));
		pstm.setInt(2, internacional.getQuantidade());
		pstm.setDate(3, (java.sql.Date) new Date(internacional.getData_volta().getTime()));
		
		pstm.setInt(4, internacional.getId());
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
		
		String sql = "DELETE from internacionais WHERE id = ?";
		
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


	public List<Internacional> getInternacionais(){
		
		String sql = "SELECT * FROM internacionais";
		
		List<Internacional> internacionais = new ArrayList<Internacional>();
		
		Connection conn = null;
		PreparedStatement pstm =null;
		
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();
			
			while (rset.next()) {
				Internacional internacional = new Internacional();
				
				internacional.setId(rset.getInt("id"));
				internacional.setData_ida(rset.getDate("data_ida"));
				internacional.setQuantidade(rset.getInt("quantidade"));
				internacional.setData_volta(rset.getDate("data_volta"));
				
				internacionais.add(internacional);
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
		return internacionais;
	}


	
}
