package rhudraksha.projects.microservices.account;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

	Account findByCustomerId(int customerId);

}

