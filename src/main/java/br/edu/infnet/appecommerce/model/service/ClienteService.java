package br.edu.infnet.appecommerce.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appecommerce.model.domain.Cliente;
import br.edu.infnet.appecommerce.model.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository repository;

    public void incluir(Cliente cliente) {
        repository.save(cliente);
    }

    public void excluir(Integer codigo) {
        repository.deleteById(codigo);
    }

    public Collection<Cliente> obterLista() {
        return (Collection<Cliente>) repository.findAll();
    }

}
