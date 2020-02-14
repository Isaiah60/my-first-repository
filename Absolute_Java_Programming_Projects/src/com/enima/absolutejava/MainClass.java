package com.enima.absolutejava;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Please enter your name");
		Scanner keybd=new Scanner(System.in);
		String name=keybd.nextLine();
		
		MyNewClass MyNewClassObject=new MyNewClass();
		MyNewClassObject.DisplayMessage(name);
		
		System.out.println("Please enter the name of your best City");
		String cityname=keybd.nextLine();
		
		MyNewClassObject.setName(cityname);
		MyNewClassObject.DisplayCityName();
		
		keybd.close();
		
		
		

	}

}
