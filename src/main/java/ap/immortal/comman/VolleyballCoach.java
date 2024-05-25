package ap.immortal.comman;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ap.immortal.interfaces.Coach;

@Component
//@Qualifier("volleballCoach")
public class VolleyballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Watch Haikyu..and learn playing VolleyBall";
	}

}
