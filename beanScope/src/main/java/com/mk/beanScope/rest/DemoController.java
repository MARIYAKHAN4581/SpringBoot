package com.mk.beanScope.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mk.beanScope.common.Coach;

@RestController
public class DemoController {
	private Coach mycoach;
	private Coach anothercoach;
	 
	@Autowired
	public DemoController(@Qualifier("cricketCoach") Coach thecoach,@Qualifier("cricketCoach") Coach theanothercoach) {
		mycoach=thecoach;
		anothercoach=theanothercoach;
	}
	
	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return mycoach.getDailyWorkout();
	}
	
	
	@GetMapping("/check")
	public String check() {
		return "mycoach==theanothercoach is"+ (mycoach==anothercoach) ;
	}
  
}
