package br.edu.infnet.appecommerce.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appecommerce.model.domain.Cliente;

@Controller
public class ClienteController {

    private static Map<Integer, Cliente> mapa = new HashMap<Integer, Cliente>();
    private static Integer codigo = 1;

    public static void incluir(Cliente Cliente) {

        Cliente.setCodigo(codigo++);
        mapa.put(Cliente.getCodigo(), Cliente);

        System.out.println("> " + Cliente);
    }

    public static void excluir(Integer codigo) {

        mapa.remove(codigo);
    }

    public static Collection<Cliente> obterLista() {

        return mapa.values();
    }

    @GetMapping(value = "/cliente/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", obterLista());

        return "cliente/lista";
    }

    @GetMapping(value = "/cliente/{codigo}/excluir")
    public String exclusao(@PathVariable Integer codigo) {

        excluir(codigo);

        return "redirect:/cliente/lista";
    }

}
