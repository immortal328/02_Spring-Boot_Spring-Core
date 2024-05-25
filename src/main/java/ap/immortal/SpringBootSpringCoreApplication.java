package ap.immortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Explecit ComponentScan call
/*@SpringBootApplication(
		scanBasePackages = {""})*/

@SpringBootApplication
public class SpringBootSpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSpringCoreApplication.class, args);
	}

}
