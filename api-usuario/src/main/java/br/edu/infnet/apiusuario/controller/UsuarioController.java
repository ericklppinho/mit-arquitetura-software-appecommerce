package br.edu.infnet.apiusuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiusuario.model.domain.Usuario;
import br.edu.infnet.apiusuario.model.service.UsuarioService;

@RestController
@RequestMapping(path = "/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping(path = "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Usuario> listar() {

        return service.obterLista();
    }

    @PostMapping(path = "/incluir", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void incluir(@RequestBody Usuario usuario) {

        service.incluir(usuario);
    }

    @DeleteMapping(path = "/{id}/excluir")
    public void excluir(@PathVariable Integer id) {

        service.excluir(id);
    }

    @PostMapping(path = "/validar")
    public Usuario validar(@RequestParam String email, @RequestParam String senha) {

        return service.validar(email, senha);
    }

}
