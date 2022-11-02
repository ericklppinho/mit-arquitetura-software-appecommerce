package br.edu.infnet.appecommerce.model.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appecommerce.model.domain.Cliente;
import br.edu.infnet.appecommerce.model.domain.Eletronico;
import br.edu.infnet.appecommerce.model.domain.Movel;
import br.edu.infnet.appecommerce.model.domain.Pedido;
import br.edu.infnet.appecommerce.model.domain.Produto;
import br.edu.infnet.appecommerce.model.domain.Roupa;
import br.edu.infnet.appecommerce.model.service.PedidoService;

@Order(1)
@Component
public class PedidoTeste implements ApplicationRunner {

    @Autowired
    private PedidoService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## Cadastramento de Pedidos ##");

        Eletronico eletronico = new Eletronico();
        eletronico.setCodigo(1);
        eletronico.setMarca("LG");
        eletronico.setNome("TV Smart 55");
        eletronico.setValor(2990);
        eletronico.setPeso(30);

        eletronico.setVoltagem(110);
        eletronico.setBivolt(false);
        eletronico.setAltura(1.2f);
        eletronico.setComprimento(2.1f);
        eletronico.setProfundidade(0.05f);

        Movel movel = new Movel();
        movel.setCodigo(2);
        movel.setMarca("Só Madeira");
        movel.setNome("Quarda Roupa Premium");
        movel.setValor(8990);
        movel.setPeso(300);

        movel.setMaterial("Pinheiro");
        movel.setEspelho(true);
        movel.setAltura(2.20f);
        movel.setComprimento(3.5f);
        movel.setProfundidade(0.8f);

        Roupa roupa = new Roupa();
        roupa.setCodigo(3);
        roupa.setMarca("Biotipo");
        roupa.setNome("Calça");
        roupa.setValor(180);
        roupa.setPeso(0.58f);

        roupa.setTamanho("40");
        roupa.setCor("Preta");
        roupa.setGenero("Masculino");
        roupa.setEstampada(false);

        Cliente c1 = new Cliente();
        c1.setCodigo(1);
        c1.setCpf("31313321221");
        c1.setEmail("primeiro@cliente.com");
        c1.setNome("Primeiro Cliente");

        List<Produto> l1 = new ArrayList<Produto>();
        l1.add(eletronico);
        l1.add(movel);

        Pedido p1 = new Pedido();
        p1.setStatus("Em Separação");
        p1.setCliente(c1);
        p1.setProdutos(l1);
        service.incluir(p1);

        Cliente c2 = new Cliente();
        c2.setCodigo(2);
        c2.setCpf("151113215155");
        c2.setEmail("segundo@cliente.com");
        c2.setNome("Segundo Cliente");

        List<Produto> l2 = new ArrayList<Produto>();
        l2.add(roupa);
        l2.add(movel);

        Pedido p2 = new Pedido();
        p1.setCliente(c2);
        p2.setProdutos(l2);
        service.incluir(p2);

        Cliente c3 = new Cliente();
        c3.setCodigo(3);
        c3.setCpf("46565564654");
        c3.setEmail("terceiro@cliente.com");
        c3.setNome("Terceiro Cliente");

        List<Produto> l3 = new ArrayList<Produto>();
        l3.add(roupa);

        Pedido p3 = new Pedido();
        p3.setStatus("Pagamento de Boleto Pendente");
        p1.setCliente(c3);
        p3.setProdutos(l3);
        service.incluir(p3);
    }

}
