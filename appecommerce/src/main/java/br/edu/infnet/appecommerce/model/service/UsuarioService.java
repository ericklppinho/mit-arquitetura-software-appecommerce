package br.edu.infnet.appecommerce.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appecommerce.clients.IEnderecoClient;
import br.edu.infnet.appecommerce.clients.IUsuarioClient;
import br.edu.infnet.appecommerce.model.domain.Endereco;
import br.edu.infnet.appecommerce.model.domain.Usuario;

@Service
public class UsuarioService {

    @Autowired
    private IUsuarioClient usuarioClient;

    @Autowired
    private IEnderecoClient enderecoClient;

    public void incluir(Usuario usuario) {

        usuarioClient.incluir(usuario);
    }

    public void excluir(Integer id) {

        usuarioClient.excluir(id);
    }

    public List<Usuario> obterLista() {

        return usuarioClient.obterLista();
    }

    public Usuario validar(String email, String senha) {

        return usuarioClient.validar(email, senha);
    }

    public Endereco obterCep(String cep) {

        return enderecoClient.obterCep(cep);
    }

}
