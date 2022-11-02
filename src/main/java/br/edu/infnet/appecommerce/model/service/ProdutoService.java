package br.edu.infnet.appecommerce.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appecommerce.model.domain.Produto;
import br.edu.infnet.appecommerce.model.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository repository;

    public void incluir(Produto produto) {
        repository.save(produto);
    }

    public void excluir(Integer codigo) {
        repository.deleteById(codigo);
    }

    public Collection<Produto> obterLista() {
        return (Collection<Produto>) repository.findAll();
    }

}
