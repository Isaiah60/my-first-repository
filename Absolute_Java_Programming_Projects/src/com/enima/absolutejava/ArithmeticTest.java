package com.enima.absolutejava;

import java.util.Scanner;

public class ArithmeticTest {
	public static void main(String[] args) {
		double first_num=0 , second_num=0;
		SumDifferenceProduct( first_num, second_num);
		
		
	}
	public static void SumDifferenceProduct(double first_num, double second_num) {
		Scanner keybd= new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		 first_num = keybd.nextInt();
		System.out.println("Please enter your second number:");
		 second_num = keybd.nextInt();
		keybd.close();
		
		double sum = first_num + second_num;
		double difference = first_num - second_num;
		double product = first_num * second_num;
		
		System.out.println("The sum of the two numbers are: "+sum);
		System.out.println("The difference between the two numbers are: "+difference);
		System.out.println("The product of the two numbers are: "+product);
		
	}

}
