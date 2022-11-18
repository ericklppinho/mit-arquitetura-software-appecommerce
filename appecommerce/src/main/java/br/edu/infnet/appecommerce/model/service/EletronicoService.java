package br.edu.infnet.appecommerce.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appecommerce.model.domain.Eletronico;
import br.edu.infnet.appecommerce.model.repository.EletronicoRepository;

@Service
public class EletronicoService {

    @Autowired
    EletronicoRepository repository;

    public void incluir(Eletronico eletronico) {
        repository.save(eletronico);
    }

    public void excluir(Integer codigo) {
        repository.deleteById(codigo);
    }

    public Collection<Eletronico> obterLista() {
        return (Collection<Eletronico>) repository.findAll();
    }

}
