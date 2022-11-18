package br.edu.infnet.appecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appecommerce.model.domain.Pedido;
import br.edu.infnet.appecommerce.model.domain.Usuario;
import br.edu.infnet.appecommerce.model.service.ClienteService;
import br.edu.infnet.appecommerce.model.service.PedidoService;
import br.edu.infnet.appecommerce.model.service.ProdutoService;

@Controller
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ProdutoService produtoService;

    @GetMapping(value = "/pedido/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("listagem", pedidoService.obterLista());

        return "pedido/lista";
    }

    @GetMapping(value = "/pedido")
    public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("clientes", clienteService.obterLista());

        model.addAttribute("produtos", produtoService.obterLista(usuario));

        return "pedido/cadastro";
    }

    @PostMapping(value = "/pedido/incluir")
    public String incluir(Pedido pedido, @SessionAttribute("user") Usuario usuario) {

        pedido.setUsuario(usuario);
        pedidoService.incluir(pedido);

        return "redirect:/pedido/lista";
    }

    @GetMapping(value = "/pedido/{codigo}/excluir")
    public String excluir(@PathVariable Integer codigo) {

        pedidoService.excluir(codigo);

        return "redirect:/pedido/lista";
    }

}
