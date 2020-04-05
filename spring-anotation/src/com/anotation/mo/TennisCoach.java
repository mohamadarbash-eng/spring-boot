package com.anotation.mo;

import org.springframework.stereotype.Component;

@Component("yourMyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "pratice pratice";
	}

}
