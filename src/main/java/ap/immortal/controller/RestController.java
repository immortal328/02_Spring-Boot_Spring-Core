package ap.immortal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import ap.immortal.interfaces.Coach;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	private Coach mycoach;
	
	@Autowired
	public RestController(Coach coach) {
		mycoach = coach;		
	}
	
	@GetMapping("/dailyWorkout")
	public String getWorkout(Coach coach) {
		return mycoach.getDailyWorkout();
	}

}
