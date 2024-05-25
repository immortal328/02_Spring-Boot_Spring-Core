package ap.immortal.comman;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import ap.immortal.interfaces.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Primary
@Component
public class TrackCoach implements Coach {
	
	TrackCoach(){
		System.out.println("in constructor : "+ getClass().getSimpleName());
	}
	
	@PostConstruct
	void init(){
		System.out.println("@PostConstruct : "+getClass().getSimpleName());

	}

	
	@Override
	public String getDailyWorkout() {
		return "Run at least 20 minute with 10.5 Km/h speed..";
	}
	
	@PreDestroy
	void destroy() {
		System.out.println("@PreDestroy : "+getClass().getSimpleName());
	}

}
