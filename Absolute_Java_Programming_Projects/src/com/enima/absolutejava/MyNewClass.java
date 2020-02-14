package com.enima.absolutejava;

public class MyNewClass {
	private String nameOfCity;
	public  void DisplayMessage(String username) {
		System.out.println("Hello "+username+", welcome to my page");
	}
	
	public void setName( String cityname) {
		nameOfCity=cityname;
		
	}
	public String getName() {
		return nameOfCity;
	}
	
	public void DisplayCityName() {
		System.out.printf("I like %s too ",getName());
	}

}
