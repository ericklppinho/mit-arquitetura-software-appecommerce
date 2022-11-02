package br.edu.infnet.appecommerce.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appecommerce.model.domain.Roupa;
import br.edu.infnet.appecommerce.model.repository.RoupaRepository;

@Service
public class RoupaService {

    @Autowired
    RoupaRepository repository;

    public void incluir(Roupa roupa) {
        repository.save(roupa);
    }

    public void excluir(Integer codigo) {
        repository.deleteById(codigo);
    }

    public Collection<Roupa> obterLista() {
        return (Collection<Roupa>) repository.findAll();
    }

}
