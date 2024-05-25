package ap.immortal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;

import ap.immortal.interfaces.Coach;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	private Coach cricketCoach;
	private Coach khokhoCoach;
	private Coach volleyballCoach;
	private Coach myTrackCoach;

	// Constructor Injection
	@Autowired
	public RestController(@Qualifier("cricketCoach") Coach cricket, @Qualifier("khoKhoCoach") Coach khokho,
			@Qualifier("volleyballCoach") Coach volleyball,Coach trackCoach) {
		cricketCoach = cricket;
		khokhoCoach = khokho;
		volleyballCoach = volleyball;
		myTrackCoach = trackCoach;
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
