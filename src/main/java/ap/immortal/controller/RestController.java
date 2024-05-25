package ap.immortal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import ap.immortal.interfaces.Coach;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	private Coach coach;
	
	@Autowired
	public RestController(Coach coach) {
		this.coach = coach;		
	}
	
	@GetMapping("/dailyWorkout")
	public String getWorkout(Coach coach) {
		return coach.getDailyWorkout();
	}

}
