package ap.immortal.comman;

import ap.immortal.interfaces.Coach;

public class SwimCoach implements Coach {
	
	public SwimCoach(){
		System.out.println("in constructor : "+ getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "Just do 5 lap of whole swimming pool..";
	}

}
