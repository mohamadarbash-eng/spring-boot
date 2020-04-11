package com.anotation.mo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;
	
	@Value("${mo.email}")
	private String email;

	@Value("${mo.team}")
	private String team;	
	
	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "swim with your " + team + email;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
