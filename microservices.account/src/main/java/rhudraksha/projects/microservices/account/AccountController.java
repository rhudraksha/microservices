package rhudraksha.projects.microservices.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

/**
 * @author Eazy Bytes
 *
 */

@RestController
public class AccountController {

	@Autowired
	private AccountRepository accountsRepository;

	@Autowired
	AccountServiceConfig accountsConfig;

	@PostMapping("/myAccount")
	public Account getAccountDetails(@RequestBody Customer customer) {

		Account accounts = accountsRepository.findByCustomerId(customer.getCustomerId());
		if (accounts != null) {
			return accounts;
		} else {
			return null;
		}

	}

	@GetMapping("/account/properties")
	public String getPropertyDetails() throws JsonProcessingException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		Properties properties = new Properties(accountsConfig.getName(), accountsConfig.getPort());
		String jsonStr = ow.writeValueAsString(properties);
		return jsonStr;
	}

}
