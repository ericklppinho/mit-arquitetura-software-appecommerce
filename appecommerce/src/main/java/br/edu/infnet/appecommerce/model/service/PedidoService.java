package br.edu.infnet.appecommerce.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appecommerce.clients.IPedidoClient;
import br.edu.infnet.appecommerce.model.domain.Pedido;
import br.edu.infnet.appecommerce.model.domain.Usuario;

@Service
public class PedidoService {

    @Autowired
    IPedidoClient pedidoClient;

    public List<Pedido> obterLista() {

        return pedidoClient.listar();
    }

    public List<Pedido> obterLista(Usuario usuario) {

        return pedidoClient.listarPorUsuario(usuario.getId());
    }

    public void incluir(Pedido pedido) {

        pedidoClient.incluir(pedido);
    }

    public void excluir(Integer codigo) {

        pedidoClient.excluir(codigo);
    }

}
