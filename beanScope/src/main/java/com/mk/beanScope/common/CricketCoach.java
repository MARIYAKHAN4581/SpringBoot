package com.mk.beanScope.common;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice daily ";
	}

}
