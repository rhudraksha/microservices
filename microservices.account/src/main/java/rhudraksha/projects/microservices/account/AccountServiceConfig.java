package rhudraksha.projects.microservices.account;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Eazy Bytes
 *
 */
@Configuration
@ConfigurationProperties(prefix = "account")
@Getter @Setter @ToString
public class AccountServiceConfig {

	 private String name;
	 private String port;

}



