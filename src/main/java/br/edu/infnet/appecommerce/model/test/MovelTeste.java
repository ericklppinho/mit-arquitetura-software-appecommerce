package br.edu.infnet.appecommerce.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appecommerce.model.domain.Movel;
import br.edu.infnet.appecommerce.model.service.MovelService;

@Order(6)
@Component
public class MovelTeste implements ApplicationRunner {

    @Autowired
    private MovelService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## Cadastramento de Moveis ##");

        Movel m1 = new Movel();
        m1.setMarca("Só Madeira");
        m1.setNome("Quarda Roupa Premium");
        m1.setValor(8990);
        m1.setPeso(300);

        m1.setMaterial("Pinheiro");
        m1.setEspelho(true);
        m1.setAltura(2.20f);
        m1.setComprimento(3.5f);
        m1.setProfundidade(0.8f);
        service.incluir(m1);

        Movel m2 = new Movel();
        m2.setMarca("Só Madeira");
        m2.setNome("Cômoda");
        m2.setValor(3599);
        m2.setPeso(80);

        m2.setMaterial("Pinheiro");
        m2.setEspelho(false);
        m2.setAltura(1.1f);
        m2.setComprimento(1.5f);
        m2.setProfundidade(1);
        service.incluir(m2);

        Movel m3 = new Movel();
        m3.setMarca("MDF & Cia");
        m3.setNome("Quarda Roupa Infantil");
        m3.setValor(559);
        m3.setPeso(80);

        m3.setMaterial("MDF");
        m3.setEspelho(false);
        m3.setAltura(1.8f);
        m3.setComprimento(1.5f);
        m3.setProfundidade(0.5f);
        service.incluir(m3);
    }

}
