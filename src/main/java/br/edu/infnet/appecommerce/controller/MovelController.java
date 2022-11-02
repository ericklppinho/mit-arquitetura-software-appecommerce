package br.edu.infnet.appecommerce.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appecommerce.model.domain.Movel;

@Controller
public class MovelController {

    private static Map<Integer, Movel> mapa = new HashMap<Integer, Movel>();
    private static Integer codigo = 1;

    public static void incluir(Movel Movel) {

        Movel.setCodigo(codigo++);
        mapa.put(Movel.getCodigo(), Movel);

        System.out.println("> " + Movel);
    }

    public static void excluir(Integer codigo) {

        mapa.remove(codigo);
    }

    public static Collection<Movel> obterLista() {

        return mapa.values();
    }

    @GetMapping(value = "/movel/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", obterLista());

        return "movel/lista";
    }

    @GetMapping(value = "/movel/{codigo}/excluir")
    public String exclusao(@PathVariable Integer codigo) {

        excluir(codigo);

        return "redirect:/movel/lista";
    }

}
