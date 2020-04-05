package com.springboot.mo;

public class TrackCoach implements Coach {
	public FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		System.out.println("I am constructor TrackCoach");
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Run a hard 6k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
