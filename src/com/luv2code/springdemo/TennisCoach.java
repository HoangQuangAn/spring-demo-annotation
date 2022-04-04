package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	private FortuneService fortuneService;
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService=fortuneService;
//	}
	
	// define default contructor
	public TennisCoach() {
		System.out.println("defaault contructor");
	}
	
	//create setter method 
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
