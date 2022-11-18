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
import br.edu.infnet.appecommerce.model.domain.Usuario;
import br.edu.infnet.appecommerce.model.service.PedidoService;

@Order(4)
@Component
public class PedidoTeste implements ApplicationRunner {

    @Autowired
    private PedidoService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## Cadastramento de Pedidos ##");

        Usuario usuario = new Usuario();
        usuario.setId(1);

        Cliente c1 = new Cliente();
        c1.setCodigo(1);

        Cliente c2 = new Cliente();
        c2.setCodigo(2);

        Cliente c3 = new Cliente();
        c3.setCodigo(3);

        Eletronico eletronico = new Eletronico();
        eletronico.setCodigo(1);

        Movel movel = new Movel();
        movel.setCodigo(2);

        Roupa roupa = new Roupa();
        roupa.setCodigo(3);

        List<Produto> l1 = new ArrayList<Produto>();
        l1.add(eletronico);
        l1.add(movel);

        Pedido p1 = new Pedido();
        p1.setStatus("Em Separação");
        p1.setCliente(c1);
        p1.setProdutos(l1);
        service.incluir(p1);

        List<Produto> l2 = new ArrayList<Produto>();
        l2.add(roupa);
        l2.add(movel);

        Pedido p2 = new Pedido();
        p2.setCliente(c2);
        p2.setProdutos(l2);
        service.incluir(p2);

        List<Produto> l3 = new ArrayList<Produto>();
        l3.add(roupa);

        Pedido p3 = new Pedido();
        p3.setStatus("Pagamento de Boleto Pendente");
        p3.setCliente(c3);
        p3.setProdutos(l3);
        service.incluir(p3);
    }

}
