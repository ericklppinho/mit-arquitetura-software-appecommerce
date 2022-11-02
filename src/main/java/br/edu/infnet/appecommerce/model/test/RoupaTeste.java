package br.edu.infnet.appecommerce.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appecommerce.model.domain.Roupa;
import br.edu.infnet.appecommerce.model.service.RoupaService;

@Order(6)
@Component
public class RoupaTeste implements ApplicationRunner {

    @Autowired
    private RoupaService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## Cadastramento de Roupas ##");

        Roupa r1 = new Roupa();
        r1.setMarca("Biotipo");
        r1.setNome("Calça");
        r1.setValor(180);
        r1.setPeso(0.58f);

        r1.setTamanho("40");
        r1.setCor("Preta");
        r1.setGenero("Masculino");
        r1.setEstampada(false);
        service.incluir(r1);

        Roupa r2 = new Roupa();
        r2.setMarca("Polo");
        r2.setNome("Blusa Polo");
        r2.setValor(150);
        r2.setPeso(0.3f);

        r2.setTamanho("M");
        r2.setCor("Preta");
        r2.setGenero("Masculino");
        r2.setEstampada(false);
        service.incluir(r2);

        Roupa r3 = new Roupa();
        r3.setMarca("Biotipo");
        r3.setNome("Camisa Primavera");
        r3.setValor(150);
        r3.setPeso(0.58f);

        r3.setTamanho("P");
        r3.setCor("Branca");
        r3.setGenero("Feminino");
        r3.setEstampada(true);
        service.incluir(r3);
    }

}
