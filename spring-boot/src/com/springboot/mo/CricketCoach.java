package com.springboot.mo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("I am constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "CricketCoach";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
