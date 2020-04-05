package com.anotation.mo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Anotation {

	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Coach theCoach = context.getBean("yourMyCoach", Coach.class);
	
	System.out.println(theCoach.getDailyWorkout());
	
	context.close();
	
	
	}

}
