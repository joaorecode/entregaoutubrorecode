package crud.flyus.aplicacao;

import java.util.Random;

import crud.flyus.dao.ClienteDao;
import crud.flyus.jdbc.Cliente;

public class Main {
	public static void main(String[] args) {
		
		Random random = new Random();
		int identificador = random.nextInt(); 
		
		ClienteDao clienteDao = new ClienteDao(); 
		
		Cliente cliente = new Cliente();
		cliente.setId(identificador);
		cliente.setNome("João");
		cliente.setTelefone(984088845);
		cliente.setLogradouro("Rua dos Alfeneiros, número 4");
		
		clienteDao.save(cliente);
	}
}
