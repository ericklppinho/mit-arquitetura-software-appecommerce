package br.edu.infnet.appecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appecommerce.model.domain.Cliente;
import br.edu.infnet.appecommerce.model.domain.Usuario;
import br.edu.infnet.appecommerce.model.service.ClienteService;

@Controller
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping(value = "/cliente/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", service.obterLista());

        return "cliente/lista";
    }

    @GetMapping(value = "/cliente")
    public String telaCadastro() {

        return "cliente/cadastro";
    }

    @PostMapping(value = "/cliente/incluir")
    public String incluir(Cliente cliente, @SessionAttribute("user") Usuario usuario) {

        cliente.setUsuario(usuario);

        service.incluir(cliente);

        return "redirect:/cliente/lista";
    }

    @GetMapping(value = "/cliente/{codigo}/excluir")
    public String excluir(@PathVariable Integer codigo) {

        service.excluir(codigo);

        return "redirect:/cliente/lista";
    }

}
