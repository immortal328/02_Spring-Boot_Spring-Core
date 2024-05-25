package ap.immortal.comman;

import org.springframework.stereotype.Component;

import ap.immortal.interfaces.Coach;

@Component
public class KhoKhoCoach implements Coach {
	
	KhoKhoCoach(){
		System.out.println("in constructor : "+ getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "Just Do warmup..I will teach you Kho kho ..no need to learn";
	}

}
