package br.edu.infnet.appecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appecommerce.model.domain.Movel;
import br.edu.infnet.appecommerce.model.service.MovelService;

@Controller
public class MovelController {

    @Autowired
    private MovelService service;

    @GetMapping(value = "/movel/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", service.obterLista());

        return "movel/lista";
    }

    @GetMapping(value = "/movel")
    public String telaCadastro() {

        return "movel/cadastro";
    }

    @PostMapping(value = "/movel/incluir")
    public String incluir(Movel movel) {

        service.incluir(movel);

        return "redirect:/movel/lista";
    }

    @GetMapping(value = "/movel/{codigo}/excluir")
    public String excluir(@PathVariable Integer codigo) {

        service.excluir(codigo);

        return "redirect:/movel/lista";
    }

}
