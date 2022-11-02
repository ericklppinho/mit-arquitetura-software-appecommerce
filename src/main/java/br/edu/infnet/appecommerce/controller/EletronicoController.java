package br.edu.infnet.appecommerce.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appecommerce.model.domain.Eletronico;

@Controller
public class EletronicoController {

    private static Map<Integer, Eletronico> mapa = new HashMap<Integer, Eletronico>();
    private static Integer codigo = 1;

    public static void incluir(Eletronico Eletronico) {
        Eletronico.setCodigo(codigo++);
        mapa.put(Eletronico.getCodigo(), Eletronico);

        System.out.println("> " + Eletronico);
    }

    public static void excluir(Integer codigo) {
        mapa.remove(codigo);
    }

    public static Collection<Eletronico> obterLista() {
        return mapa.values();
    }

    @GetMapping(value = "/eletronico/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", obterLista());

        return "eletronico/lista";
    }

    @GetMapping(value = "/eletronico/{codigo}/excluir")
    public String exclusao(@PathVariable Integer codigo) {

        excluir(codigo);

        return "redirect:/eletronico/lista";
    }

}
