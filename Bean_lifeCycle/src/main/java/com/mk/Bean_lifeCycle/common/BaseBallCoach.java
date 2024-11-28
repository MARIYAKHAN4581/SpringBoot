package com.mk.Bean_lifeCycle.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class BaseBallCoach implements Coach {

	public BaseBallCoach() {
		System.out.println("Constructor:"+getClass().getSimpleName());
	}
	
	   
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice 30 min";
	}

}
