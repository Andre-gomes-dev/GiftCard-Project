package br.com.giftproject.repository;

import br.com.giftproject.model.Bag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BagRepository extends CrudRepository<Bag, Long> {

}
