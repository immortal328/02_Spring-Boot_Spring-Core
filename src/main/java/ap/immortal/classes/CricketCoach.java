package ap.immortal.classes;

import org.springframework.stereotype.Component;

import ap.immortal.interfaces.Coach;

@Component
public class CricketCoach implements Coach  {

	@Override
	public String getDailyWorkout() {
		return "Bolw at least 50 ball with perfect posture";
	}
	
	

}
