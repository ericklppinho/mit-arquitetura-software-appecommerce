package br.edu.infnet.appecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appecommerce.model.domain.Eletronico;
import br.edu.infnet.appecommerce.model.service.EletronicoService;

@Controller
public class EletronicoController {

    @Autowired
    private EletronicoService service;

    @GetMapping(value = "/eletronico/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", service.obterLista());

        return "eletronico/lista";
    }

    @GetMapping(value = "/eletronico")
    public String telaCadastro() {

        return "eletronico/cadastro";
    }

    @PostMapping(value = "/eletronico/incluir")
    public String incluir(Eletronico eletronico) {

        service.incluir(eletronico);

        return "redirect:/eletronico/lista";
    }

    @GetMapping(value = "/eletronico/{codigo}/excluir")
    public String excluir(@PathVariable Integer codigo) {

        service.excluir(codigo);

        return "redirect:/eletronico/lista";
    }

}
