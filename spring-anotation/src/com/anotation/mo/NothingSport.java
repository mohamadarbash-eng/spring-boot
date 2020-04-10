package com.anotation.mo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NothingSport implements Coach {
	
	@Autowired
	@Qualifier("sadFortuneService")
	private FortuneService fortuneService;
	
	public NothingSport() {
		
	}
	
	/*
	@Autowired
	public void setForuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "sleep well";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
