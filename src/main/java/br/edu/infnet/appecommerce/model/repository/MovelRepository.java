package br.edu.infnet.appecommerce.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appecommerce.model.domain.Movel;

@Repository
public interface MovelRepository extends CrudRepository<Movel, Integer> {

}
