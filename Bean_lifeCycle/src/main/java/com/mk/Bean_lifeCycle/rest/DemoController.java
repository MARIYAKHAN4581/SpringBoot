package com.mk.Bean_lifeCycle.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mk.Bean_lifeCycle.common.Coach;

@RestController
public class DemoController {
	private Coach mycoach;
	 
	@Autowired
	public DemoController(@Qualifier("tennisCoach") Coach thecoach) {
		System.out.println("Constructor:"+getClass().getSimpleName());
		mycoach=thecoach;
	}
	
	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return mycoach.getDailyWorkout();
	}

}
