package br.edu.infnet.appecommerce.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appecommerce.model.domain.Usuario;
import br.edu.infnet.appecommerce.model.service.UsuarioService;

@Order(1)
@Component
public class UsuarioTeste implements ApplicationRunner {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## Cadastramento de Usuarios ##");

        Usuario u1 = new Usuario();
        u1.setEmail("admin@admin.com");
        u1.setNome("Administrador");
        u1.setSenha("123");
        usuarioService.incluir(u1);
    }

}
