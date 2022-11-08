package br.edu.infnet.appecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appecommerce.model.domain.Pedido;
import br.edu.infnet.appecommerce.model.service.PedidoService;

@Controller
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping(value = "/pedido/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", service.obterLista());

        return "pedido/lista";
    }

    @GetMapping(value = "/pedido")
    public String telaCadastro() {

        return "pedido/cadastro";
    }

    @PostMapping(value = "/pedido/incluir")
    public String incluir(Pedido pedido) {

        service.incluir(pedido);

        return "redirect:/pedido/lista";
    }

    @GetMapping(value = "/pedido/{codigo}/excluir")
    public String excluir(@PathVariable Integer codigo) {

        service.excluir(codigo);

        return "redirect:/pedido/lista";
    }

}
