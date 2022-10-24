package crud.flyus.jdbc;

import java.util.Date;

public class Item {
	public int id;
	public String nome;
	public float valor;
	public Date datacompra;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Date getDatacompra() {
		return datacompra;
	}
	public void setDatacompra(Date datacompra) {
		this.datacompra = datacompra;
	}
	
	
}
