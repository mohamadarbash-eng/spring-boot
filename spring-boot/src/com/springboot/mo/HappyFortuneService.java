package com.springboot.mo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You'r lucky person";
	}

}
