package br.edu.infnet.apipedido.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apipedido.model.domain.Pedido;
import br.edu.infnet.apipedido.model.service.PedidoService;

@RestController
@RequestMapping(path = "/api/pedido")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping(path = "/listar")
    public List<Pedido> listar() {

        return service.obterLista();
    }

    @GetMapping(path = "/listar/usuario/{id}")
    public List<Pedido> listar(@PathVariable Integer id) {

        return service.obterLista(id);
    }

    @PostMapping(path = "/incluir")
    public void incluir(@RequestBody Pedido pedido) {

        service.incluir(pedido);
    }

    @DeleteMapping(path = "/{codigo}/excluir")
    public void excluir(@PathVariable Integer codigo) {

        service.excluir(codigo);
    }

}
