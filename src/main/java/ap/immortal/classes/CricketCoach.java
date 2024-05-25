package ap.immortal.classes;

import org.springframework.stereotype.Component;

import ap.immortal.interfaces.Coach;

@Component
public class CricketCoach implements Coach  {

	@Override
	public String getDailyWorkout() {
		return "Watch YouTube video and do it yourself...";
	}
	
	

}
