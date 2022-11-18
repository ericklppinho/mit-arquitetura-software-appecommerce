package br.edu.infnet.appecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appecommerce.model.domain.Roupa;
import br.edu.infnet.appecommerce.model.service.RoupaService;

@Controller
public class RoupaController {

    @Autowired
    private RoupaService service;

    @GetMapping(value = "/roupa/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", service.obterLista());

        return "roupa/lista";
    }

    @GetMapping(value = "/roupa")
    public String telaCadastro() {

        return "roupa/cadastro";
    }

    @PostMapping(value = "/roupa/incluir")
    public String incluir(Roupa roupa) {

        service.incluir(roupa);

        return "redirect:/roupa/lista";
    }

    @GetMapping(value = "/roupa/{codigo}/excluir")
    public String excluir(@PathVariable Integer codigo) {

        service.excluir(codigo);

        return "redirect:/roupa/lista";
    }

}