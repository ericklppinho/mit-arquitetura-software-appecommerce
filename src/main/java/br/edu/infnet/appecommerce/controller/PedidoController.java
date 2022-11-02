package br.edu.infnet.appecommerce.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appecommerce.model.domain.Pedido;

@Controller
public class PedidoController {

    private static Map<Integer, Pedido> mapa = new HashMap<Integer, Pedido>();
    private static Integer codigo = 1;

    public static void incluir(Pedido pedido) {

        pedido.setCodigo(codigo++);
        mapa.put(pedido.getCodigo(), pedido);

        System.out.println("> " + pedido);
    }

    public static void excluir(Integer codigo) {

        mapa.remove(codigo);
    }

    public static Collection<Pedido> obterLista() {

        return mapa.values();
    }

    @GetMapping(value = "/pedido/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", obterLista());

        return "pedido/lista";
    }

    @GetMapping(value = "/pedido/{codigo}/excluir")
    public String exclusao(@PathVariable Integer codigo) {

        excluir(codigo);

        return "redirect:/pedido/lista";
    }

}
