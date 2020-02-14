package com.enima.absolutejava;

import java.util.Scanner;

public class AbsoluteJavaProjects {

	public static void main(String[] args) {
		Scanner keybd= new Scanner(System.in);
		Display();
		double number_to_get_sqrt=keybd.nextDouble();
		
		SquareRoot(number_to_get_sqrt);
		keybd.close();
		
		
		
	}
	 public static void SquareRoot(double number_to_get_sqrt) {
		 double guess=number_to_get_sqrt/2;
		double sqrt=0;
		for (int i=0; i<5;i++) {
			
			//int count=0;
	//while (count<10) {
		
		
		 sqrt=number_to_get_sqrt/guess;
		  guess = (guess+sqrt)/2;
		// count++;
			
		 
		}
			System.out.printf("The square root of %.2f is %.2f ",number_to_get_sqrt,sqrt);
			
	 }
	 
	public static void Display() {
		String prompt_user = "Please enter a number that you want to compute its square root: ";
		System.out.println(prompt_user);
	}
	
}
