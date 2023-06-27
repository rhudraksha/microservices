package rhudraksha.projects.microservices.loan;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LoanRepository extends CrudRepository<Loan, Long> {

	List<Loan> findByCustomerIdOrderByStartDtDesc(int customerId);
}

