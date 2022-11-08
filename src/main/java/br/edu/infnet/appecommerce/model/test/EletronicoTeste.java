package br.edu.infnet.appecommerce.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appecommerce.model.domain.Eletronico;
import br.edu.infnet.appecommerce.model.service.EletronicoService;

@Order(5)
@Component
public class EletronicoTeste implements ApplicationRunner {

    @Autowired
    private EletronicoService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## Cadastramento de Eletronicos ##");

        Eletronico e1 = new Eletronico();
        e1.setMarca("LG");
        e1.setNome("TV Smart 55");
        e1.setValor(2990);
        e1.setPeso(30);

        e1.setVoltagem(110);
        e1.setBivolt(false);
        e1.setAltura(1.2f);
        e1.setComprimento(2.1f);
        e1.setProfundidade(0.05f);
        service.incluir(e1);

        Eletronico e2 = new Eletronico();
        e2.setMarca("Sony");
        e2.setNome("XBox");
        e2.setValor(5000);
        e2.setPeso(4.2f);

        e2.setVoltagem(110);
        e2.setBivolt(false);
        e2.setAltura(0.15f);
        e2.setComprimento(30);
        e2.setProfundidade(30);
        service.incluir(e2);

        Eletronico e3 = new Eletronico();
        e3.setMarca("Apple");
        e3.setNome("Iphone 14 Pro Max");
        e3.setValor(12990);
        e3.setPeso(0.1f);

        e3.setVoltagem(0);
        e3.setBivolt(true);
        e3.setAltura(8);
        e3.setComprimento(4);
        e3.setProfundidade(0.01f);
        service.incluir(e3);
    }

}
