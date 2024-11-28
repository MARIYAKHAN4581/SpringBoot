package com.mk.Bean_lifeCycle.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class CricketCoach implements Coach {

	public CricketCoach() {
		System.out.println("Constructor:" + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice daily ";
	}

	@PostConstruct
	public void doMyStartup() {
		// TODO Auto-generated method stub
		System.out.println("your startup:" + getClass().getSimpleName());
	}

	@PreDestroy
	public void docleanup() {
		// TODO Auto-generated method stub
		System.out.println("done with cleanup:" + getClass().getSimpleName());
	}
}
