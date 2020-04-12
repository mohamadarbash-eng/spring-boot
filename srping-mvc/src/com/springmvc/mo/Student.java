package com.springmvc.mo;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private LinkedHashMap<String, String> countryOptions;
	
	private String country;
	
	
	// populate country options: used ISO country code



	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student() {
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
