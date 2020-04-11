package com.anotation.mo;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	

	private FortuneService fortuneService;
	
    @Autowired
	public TennisCoach(@Qualifier("sadFortuneService") FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@PostConstruct()
	public void onInit() {
		System.out.println("I am Oninit");
	}
	@PreDestroy()
	public void onDestroy() {
		System.out.println("I am Destroy");
	}

	@Override
	public String getDailyWorkout() {
		return "pratice pratice";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
		
	}

}
