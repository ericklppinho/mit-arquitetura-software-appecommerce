package br.edu.infnet.appecommerce.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appecommerce.model.domain.Pedido;
import br.edu.infnet.appecommerce.model.repository.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository repository;

    public void incluir(Pedido pedido) {
        repository.save(pedido);
    }

    public void excluir(Integer codigo) {
        repository.deleteById(codigo);
    }

    public Collection<Pedido> obterLista() {
        return (Collection<Pedido>) repository.findAll();
    }

}
