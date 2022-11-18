package br.edu.infnet.appecommerce.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.appecommerce.model.domain.Pedido;

@FeignClient(url = "localhost:8083/api/pedido", name = "pedidoClient")
public interface IPedidoClient {

    @GetMapping(value = "/listar")
    public List<Pedido> listar();

    @GetMapping(value = "/listar/usuario/{id}")
    public List<Pedido> listarPorUsuario(@PathVariable Integer id);

    @PostMapping(value = "/incluir")
    public void incluir(@RequestBody Pedido pedido);

    @DeleteMapping(value = "/{codigo}/excluir")
    public void excluir(@PathVariable Integer codigo);

}
