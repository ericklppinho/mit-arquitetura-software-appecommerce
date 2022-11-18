package br.edu.infnet.apicliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apicliente.model.domain.Cliente;
import br.edu.infnet.apicliente.model.service.ClienteService;

@RestController
@RequestMapping(path = "/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping(path = "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Cliente> listar() {

        return service.obterLista();
    }

    @GetMapping(path = "/listar/usuario/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Cliente> listar(@PathVariable Integer id) {

        return service.obterLista(id);
    }

    @PostMapping(path = "/incluir", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void incluir(@RequestBody Cliente cliente) {

        service.incluir(cliente);
    }

    @GetMapping(path = "/{codigo}/excluir")
    public void excluir(@PathVariable Integer codigo) {

        service.excluir(codigo);
    }

}
