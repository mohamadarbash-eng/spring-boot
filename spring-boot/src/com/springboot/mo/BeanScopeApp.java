package com.springboot.mo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beansScope-applicationContext.xml");

		Coach alphaCoach = context.getBean("trackCoach", Coach.class);

		Coach betaCoach = context.getBean("trackCoach", Coach.class);
		
		boolean result = alphaCoach == betaCoach;
		System.out.println(result);
		
		System.out.println("alphaCoach" + alphaCoach);
		
		System.out.println("betaCoach" + betaCoach);
	}

}
