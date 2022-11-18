package br.edu.infnet.appecommerce.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appecommerce.model.domain.Roupa;
import br.edu.infnet.appecommerce.model.repository.RoupaRepository;

@Service
public class RoupaService {

    @Autowired
    RoupaRepository repository;

    public List<Roupa> obterLista() {

        return (List<Roupa>) repository.findAll();
    }

    public void incluir(Roupa roupa) {

        repository.save(roupa);
    }

    public void excluir(Integer codigo) {

        repository.deleteById(codigo);
    }

}
