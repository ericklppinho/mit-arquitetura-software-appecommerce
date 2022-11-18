package br.edu.infnet.apipedido.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apipedido.model.domain.Pedido;
import br.edu.infnet.apipedido.model.repository.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public List<Pedido> obterLista() {

        return (List<Pedido>) repository.findAll();
    }

    public List<Pedido> obterLista(Integer idUsuario) {

        return repository.obterLista(idUsuario);
    }

    public void incluir(Pedido usuario) {

        repository.save(usuario);
    }

    public void excluir(Integer id) {

        repository.deleteById(id);
    }

}
