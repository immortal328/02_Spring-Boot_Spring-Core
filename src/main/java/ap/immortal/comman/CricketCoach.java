package ap.immortal.comman;

import org.springframework.stereotype.Component;

import ap.immortal.interfaces.Coach;

@Component
public class CricketCoach implements Coach  {

	CricketCoach(){
		System.out.println("in constructor : "+ getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkout() {
		return "Bolwe fast as much as much you can...";
	}
}
