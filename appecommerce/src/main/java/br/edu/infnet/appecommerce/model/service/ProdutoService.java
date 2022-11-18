package br.edu.infnet.appecommerce.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appecommerce.model.domain.Produto;
import br.edu.infnet.appecommerce.model.domain.Usuario;
import br.edu.infnet.appecommerce.model.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository repository;

    public List<Produto> obterLista() {

        return (List<Produto>) repository.findAll();
    }

    public List<Produto> obterLista(Usuario usuario) {

        return (List<Produto>) repository.obterLista(usuario.getId());
    }

    public void incluir(Produto produto) {

        repository.save(produto);
    }

    public void excluir(Integer codigo) {

        repository.deleteById(codigo);
    }

}
