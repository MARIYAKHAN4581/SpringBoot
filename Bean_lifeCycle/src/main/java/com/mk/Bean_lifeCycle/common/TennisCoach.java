package com.mk.Bean_lifeCycle.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	public TennisCoach() {
		System.out.println("Constructor:"+getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice tennis";
	}

}
