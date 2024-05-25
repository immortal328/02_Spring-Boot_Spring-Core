package ap.immortal.comman;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import ap.immortal.interfaces.Coach;

@Primary
@Component
public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run at least 20 minute with 10.5 Km/h speed..";
	}

}
