package br.com.flyus.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.flyus.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	Optional<Cliente> findById(String id);
	
}

