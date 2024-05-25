package ap.immortal.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;

import ap.immortal.interfaces.Coach;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	private Coach cricketCoach;
	private Coach khokhoCoach;
	private Coach volleyballCoach;
	private Coach myTrackCoach;

	// Two obkect to check scope as ProType
	private Coach oneCoach;
	private Coach anotherCoach;

	// To create java Config Bean
	private Coach swimCoach;

	// Constructor Injection
	// @Autowired
	public RestController(
			//With Qualifier and Component
			@Qualifier("cricketCoach") Coach cricket, @Qualifier("khoKhoCoach") Coach khokho,
			@Qualifier("volleyballCoach") Coach volleyball, Coach trackCoach,
			
			//With Qualifier and Component but Scope as PROTOTYPE
			@Qualifier("badmintonCoach") Coach theCoach, @Qualifier("badmintonCoach") Coach theAnothercoach,
			
			//With Java Config Bean and method name as Qualifier
			@Qualifier("getSwimCoach") Coach coach
			) {
		
		cricketCoach = cricket;
		khokhoCoach = khokho;
		volleyballCoach = volleyball;
		myTrackCoach = trackCoach;
		oneCoach = theCoach;
		anotherCoach = theAnothercoach;
		swimCoach = coach;
	}

	// Setter Injection
	/*
	 * @Autowired void setCoach(Coach coach) { cricketCoach = coach; }
	 */

	// Field Injection
	/*
	 * @Autowired private Coach mycoach;
	 */

	@GetMapping("/")
	String get() {
		return "Hello Spring Core..";
	}

	@GetMapping("/workoutSwim")
	String getWorkoutSwim() {
		return swimCoach.getDailyWorkout();
	}

	@GetMapping("/checks")
	String check() {
		return "Comparing beans: oneCoach == anotherCoach : " + (oneCoach == anotherCoach);
	}

	@GetMapping("/workoutCricket")
	public String getWorkoutCricket() {
		return cricketCoach.getDailyWorkout();
	}

	@GetMapping("/workoutKhoKho")
	public String getWorkoutKhoKho() {
		return khokhoCoach.getDailyWorkout();
	}

	@GetMapping("/workoutVolleyBall")
	public String getWorkoutvolleyBall() {
		return volleyballCoach.getDailyWorkout();
	}

	@GetMapping("/workoutTrack")
	public String getWorkoutTrack() {
		return myTrackCoach.getDailyWorkout();
	}

}
