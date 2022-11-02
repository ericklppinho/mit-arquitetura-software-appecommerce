package br.edu.infnet.appecommerce.model.test;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appecommerce.model.domain.Pedido;

@Order(1)
@Component
public class PedidoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## Cadastramento de Pedidos ##");

        Pedido p1 = new Pedido();
        p1.setCodigo(1);
        p1.setData(LocalDateTime.now());
        p1.setStatus("Em Separação");
        System.out.println("> " + p1);

        Pedido p2 = new Pedido();
        p2.setCodigo(2);
        p2.setData(LocalDateTime.now());
        p1.setStatus("Aberto");
        System.out.println("> " + p2);

        Pedido p3 = new Pedido();
        p2.setCodigo(3);
        p2.setData(LocalDateTime.now());
        p3.setStatus("Pagamento de Boleto Pendente");
        System.out.println("> " + p3);
    }

}
