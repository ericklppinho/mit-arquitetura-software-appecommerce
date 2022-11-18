package br.edu.infnet.appecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appecommerce.model.domain.Usuario;
import br.edu.infnet.appecommerce.model.service.UsuarioService;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping(value = "/usuario/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", service.obterLista());

        return "usuario/lista";
    }

    @GetMapping(value = "/usuario")
    public String telaCadastro() {

        return "usuario/cadastro";
    }

    @PostMapping(value = "/usuario/incluir")
    public String incluir(Usuario usuario) {

        service.incluir(usuario);

        return "redirect:/usuario/lista";
    }

    @GetMapping(value = "/usuario/{id}/excluir")
    public String excluir(@PathVariable Integer id) {

        service.excluir(id);

        return "redirect:/usuario/lista";
    }

    @PostMapping(value = "/cep")
    public String obterCep(Model model, @RequestParam String cep) {

        model.addAttribute("endereco", service.obterCep(cep));

        return "usuario/cadastro";
    }

}
