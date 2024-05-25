package ap.immortal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ap.immortal.comman.SwimCoach;
import ap.immortal.interfaces.Coach;

@Configuration
public class Config {
	
	
	@Bean
	Coach getSwimCoach(){
		return new SwimCoach();
		
	}

}
