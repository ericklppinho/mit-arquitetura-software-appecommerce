package br.edu.infnet.appecommerce.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appecommerce.model.domain.Cliente;
import br.edu.infnet.appecommerce.model.service.ClienteService;

@Order(2)
@Component
public class ClienteTeste implements ApplicationRunner {

    @Autowired
    private ClienteService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## Cadastramento de Clientes ##");

        Cliente c1 = new Cliente();
        c1.setCpf("31313321221");
        c1.setEmail("primeiro@cliente.com");
        c1.setNome("Primeiro Cliente");
        service.incluir(c1);

        Cliente c2 = new Cliente();
        c2.setCpf("151113215155");
        c2.setEmail("segundo@cliente.com");
        c2.setNome("Segundo Cliente");
        service.incluir(c2);

        Cliente c3 = new Cliente();
        c3.setCpf("46565564654");
        c3.setEmail("terceiro@cliente.com");
        c3.setNome("Terceiro Cliente");
        service.incluir(c3);
    }

}
