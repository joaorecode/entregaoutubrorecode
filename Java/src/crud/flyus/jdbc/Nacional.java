package crud.flyus.jdbc;

import java.util.Date;

public class Nacional {
	public int id;
	public Date data_ida;
	public int quantidade;
	public Date data_volta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData_ida() {
		return data_ida;
	}
	public void setData_ida(Date data_ida) {
		this.data_ida = data_ida;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Date getData_volta() {
		return data_volta;
	}
	public void setData_volta(Date data_volta) {
		this.data_volta = data_volta;
	}
	
	
}
