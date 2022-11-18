package br.edu.infnet.appecommerce.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appecommerce.model.domain.Movel;
import br.edu.infnet.appecommerce.model.repository.MovelRepository;

@Service
public class MovelService {

    @Autowired
    MovelRepository repository;

    public void incluir(Movel movel) {
        repository.save(movel);
    }

    public void excluir(Integer codigo) {
        repository.deleteById(codigo);
    }

    public Collection<Movel> obterLista() {
        return (Collection<Movel>) repository.findAll();
    }

}
