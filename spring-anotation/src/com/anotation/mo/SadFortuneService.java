package com.anotation.mo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {
	private String[] data = {
	"sleep :D sport",
	"smart awwww",
	"every day ? seelp well :P"
	};
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
