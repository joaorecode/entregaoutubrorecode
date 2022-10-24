package br.com.flyus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (nullable = false)
	private String email;
	
	@Column (nullable = false)
	private String nome;
	
	@Column (nullable = false)
	private String telefone;
	
	@Column (nullable = false)
	private String endereco;
	
	@Column (nullable = false)
	private String senha;
	
	public Cliente(Cliente cliente) {		
	}
	
	public Cliente(Long id, String email, String nome, String telefone, String endereco, String senha) {
		this.id = id;
		this.email = email;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.senha = senha;
		
}		
		
		public Long getId() {
			return id;
		}
		
		public void setId(Long id) {
			this.id = id;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getTelefone() {
			return telefone;
		}
		
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
		public String getEndereco() {
			return endereco;
		}
		
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		
		public String getSenha() {
			return senha;
		}
		
		public void setSenha(String senha) {
			this.senha = senha;
		}
		
		@Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((id == null) ? 0 : id.hashCode());
	        result = prime * result + ((email == null) ? 0 : email.hashCode());
	        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
	        result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
	        result = prime * result + ((senha == null) ? 0 : senha.hashCode());
	        return result;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Cliente other = (Cliente) obj;
	        if (id == null) {
	            if (other.id != null)
	                return false;
	        } else if (!id.equals(other.id))
	            return false;
	        if (email == null) {
	            if (other.email != null)
	                return false;
	        } else if (!email.equals(other.email))
	            return false;
	        if (nome == null) {
	            if (other.nome != null)
	                return false;
	        } else if (!nome.equals(other.nome))
	            return false;
	        if (telefone == null) {
	            if (other.telefone != null)
	                return false;
	        } else if (!telefone.equals(other.telefone))
	            return false;
	        if (endereco == null) {
	            if (other.endereco != null)
	                return false;
	        } else if (!endereco.equals(other.endereco))
	            return false;
	        if (senha == null) {
	            if (other.senha != null)
	                return false;
	        } else if (!senha.equals(other.senha))
	            return false;
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "Cliente [id=" + id + ", email=" + email + ", nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + ", senha="
	                + senha + "]";
	    }
	}
