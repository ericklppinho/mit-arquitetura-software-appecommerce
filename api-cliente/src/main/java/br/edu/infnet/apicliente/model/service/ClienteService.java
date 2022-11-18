package br.edu.infnet.apicliente.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apicliente.model.domain.Cliente;
import br.edu.infnet.apicliente.model.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository repository;

    public List<Cliente> obterLista() {

        return (List<Cliente>) repository.findAll();
    }

    public List<Cliente> obterLista(Integer idUsuario) {

        return repository.obterLista(idUsuario);
    }

    public void incluir(Cliente cliente) {

        repository.save(cliente);
    }

    public void excluir(Integer codigo) {

        repository.deleteById(codigo);
    }

}
