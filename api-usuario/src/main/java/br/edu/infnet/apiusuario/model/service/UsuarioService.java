package br.edu.infnet.apiusuario.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiusuario.model.domain.Usuario;
import br.edu.infnet.apiusuario.model.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public void incluir(Usuario usuario) {

        repository.save(usuario);
    }

    public void excluir(Integer id) {

        repository.deleteById(id);
    }

    public List<Usuario> obterLista() {

        return (List<Usuario>) repository.findAll();
    }

    public Usuario validar(String email, String senha) {

        Usuario usuario = repository.findByEmail(email);

        if (usuario != null && senha.equals(usuario.getSenha())) {
            return usuario;
        }

        return null;
    }

}
