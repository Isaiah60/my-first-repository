package com.enima.absolutejava;

import java.util.Scanner;

public class PigLatinTest {
	public static void main(String[] args) {
		String first_name="";
		String last_name="";
		
		PigLatinName(first_name,last_name);
	}
	
 public static void PigLatinName(String first_name, String last_name) {
	 Scanner keybd = new Scanner (System.in);
     System.out.println("Please enter your your first name: ");
	     first_name = keybd.nextLine();
		System.out.println("Please enter your second name: ");
	     last_name = keybd.nextLine();
		keybd.close();
		System.out.printf("You entered %s %s as your first and last name respectively\n"
				,first_name,last_name);
		
		System.out.println("Your name in lowercase is "+first_name.toLowerCase() +" "+ last_name.toLowerCase());
	String ending_str = "ay";
		System.out.println("Your pig Latin name is " + first_name.toUpperCase().charAt(1)+first_name.substring(2)+first_name.charAt(0)+ending_str
				+" "+last_name.toUpperCase().charAt(1)+last_name.substring(2)+last_name.charAt(0)+ending_str);
 }
}
