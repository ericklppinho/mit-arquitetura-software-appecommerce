package br.edu.infnet.appecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appecommerce.model.domain.Produto;
import br.edu.infnet.appecommerce.model.service.ProdutoService;

@Controller
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping(value = "/produto/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", service.obterLista());

        return "produto/lista";
    }

    @GetMapping(value = "/produto")
    public String telaCadastro() {

        return "produto/cadastro";
    }

    @PostMapping(value = "/produto/incluir")
    public String incluir(Produto produto) {

        service.incluir(produto);

        return "redirect:/produto/lista";
    }

    @GetMapping(value = "/produto/{codigo}/excluir")
    public String excluir(@PathVariable Integer codigo) {

        service.excluir(codigo);

        return "redirect:/produto/lista";
    }

}
