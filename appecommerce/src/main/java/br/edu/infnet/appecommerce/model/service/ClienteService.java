package br.edu.infnet.appecommerce.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appecommerce.clients.IClienteClient;
import br.edu.infnet.appecommerce.model.domain.Cliente;
import br.edu.infnet.appecommerce.model.domain.Usuario;

@Service
public class ClienteService {

    @Autowired
    IClienteClient clienteClient;

    public List<Cliente> obterLista() {

        return clienteClient.obterLista();
    }

    public List<Cliente> obterLista(Usuario usuario) {

        return clienteClient.obterLista(usuario.getId());
    }

    public void incluir(Cliente cliente) {

        clienteClient.incluir(cliente);
    }

    public void excluir(Integer codigo) {

        clienteClient.excluir(codigo);
    }

}
