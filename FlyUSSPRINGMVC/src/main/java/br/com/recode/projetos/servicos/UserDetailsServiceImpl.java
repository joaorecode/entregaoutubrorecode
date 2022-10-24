package br.com.recode.projetos.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.flyus.model.Cliente;
import br.com.flyus.repository.ClienteRepository;
import br.com.flyus.model.Cliente;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private ClienteRepository clienteRepositorio;

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        Cliente cliente = clienteRepositorio.findById(id)
            .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));

        return (UserDetails) new Cliente(cliente);
    }
    
}
