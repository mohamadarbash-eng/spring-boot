package com.anotation.mo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	

	private FortuneService fortuneService;
	
    @Autowired
	public TennisCoach(@Qualifier("sadFortuneService") FortuneService theFortuneService) {
		fortuneService = theFortuneService;
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
