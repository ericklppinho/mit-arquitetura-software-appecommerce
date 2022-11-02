package br.edu.infnet.appecommerce.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appecommerce.model.domain.Produto;

@Controller
public class ProdutoController {

    private static Map<Integer, Produto> mapa = new HashMap<Integer, Produto>();
    private static Integer codigo = 1;

    public static void incluir(Produto produto) {

        produto.setCodigo(codigo++);
        mapa.put(produto.getCodigo(), produto);

        System.out.println("> " + produto);
    }

    public static void excluir(Integer codigo) {

        mapa.remove(codigo);
    }

    public static Collection<Produto> obterLista() {

        return mapa.values();
    }

    @GetMapping(value = "/produto/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", obterLista());

        return "produto/lista";
    }

    @GetMapping(value = "/produto/{codigo}/excluir")
    public String exclusao(@PathVariable Integer codigo) {

        excluir(codigo);

        return "redirect:/produto/lista";
    }

}
