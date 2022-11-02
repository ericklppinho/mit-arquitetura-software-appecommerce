package br.edu.infnet.appecommerce.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appecommerce.model.domain.Eletronico;
import br.edu.infnet.appecommerce.model.domain.Movel;
import br.edu.infnet.appecommerce.model.domain.Roupa;
import br.edu.infnet.appecommerce.model.service.ProdutoService;

@Order(3)
@Component
public class ProdutoTeste implements ApplicationRunner {

    @Autowired
    private ProdutoService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## Cadastramento de Produtos ##");

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
    }

}
