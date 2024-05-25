package ap.immortal.comman;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import ap.immortal.interfaces.Coach;

//@Lazy - Component Level Lazy Initialization Enable
@Component
public class BadmintonCoach implements Coach{
	
	BadmintonCoach(){
		System.out.println("in constructor : "+ getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "We need to Observe workout carefully..";
	}

}
