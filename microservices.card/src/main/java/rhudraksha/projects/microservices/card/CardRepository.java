package rhudraksha.projects.microservices.card;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CardRepository extends CrudRepository<Card, Long> {

	
	List<Card> findByCustomerId(int customerId);

}

