package br.edu.infnet.appecommerce.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appecommerce.model.domain.Roupa;

@Controller
public class RoupaController {

    private static Map<Integer, Roupa> mapa = new HashMap<Integer, Roupa>();
    private static Integer codigo = 1;

    public static void incluir(Roupa Roupa) {

        Roupa.setCodigo(codigo++);
        mapa.put(Roupa.getCodigo(), Roupa);

        System.out.println("> " + Roupa);
    }

    public static void excluir(Integer codigo) {

        mapa.remove(codigo);
    }

    public static Collection<Roupa> obterLista() {

        return mapa.values();
    }

    @GetMapping(value = "/roupa/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", obterLista());

        return "roupa/lista";
    }

    @GetMapping(value = "/roupa/{codigo}/excluir")
    public String exclusao(@PathVariable Integer codigo) {

        excluir(codigo);

        return "redirect:/roupa/lista";
    }

}