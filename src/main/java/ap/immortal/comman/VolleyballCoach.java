package ap.immortal.comman;

import org.springframework.stereotype.Component;

import ap.immortal.interfaces.Coach;

@Component
public class VolleyballCoach implements Coach{
	
	VolleyballCoach(){
		System.out.println("in constructor : "+ getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "Watch Haikyu..and learn playing VolleyBall";
	}

}
