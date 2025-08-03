package song.sj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(/*exclude = SecurityAutoConfiguration.class*/)
public class SjGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SjGatewayApplication.class, args);
	}

}
