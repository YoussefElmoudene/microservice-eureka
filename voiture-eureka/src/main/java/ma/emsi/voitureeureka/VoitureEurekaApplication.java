package ma.emsi.voitureeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableFeignClients
@Component("org.emsi.voiture")
public class VoitureEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoitureEurekaApplication.class, args);
	}

}
