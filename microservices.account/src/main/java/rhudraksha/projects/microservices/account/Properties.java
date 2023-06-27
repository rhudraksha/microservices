package rhudraksha.projects.microservices.account;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Properties {

	private String name;
	private String port;


	public Properties(String name, String port) {
		this.name = name;
		this.port = port;
	}

}

