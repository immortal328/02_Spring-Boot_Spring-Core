package ap.immortal.comman;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ap.immortal.interfaces.Coach;

@Component
//@Qualifier("khokhoCoach")
public class KhoKhoCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Just Do warmup..I will teach you Kho kho ..no need to learn";
	}

}
