package org.amalitech.classwork;

import java.util.Scanner;

public class ClassWork_12122019 {
	
	public static void main (String[] agrs) {
		
	 String instruction1_str="This is to find the sum betwwen two"
	 		+ "numbers\nplease enter the first number";
	 String instruction2_str="Please enter the second number";
	 
	System.out.println(instruction1_str);
	Scanner keybd=new Scanner(System.in);
	double num1=keybd.nextDouble();
	System.out.println(instruction2_str);
	double num2=keybd.nextDouble();
	
	double result=CalculateSum(num1,num2);
	
	String outputresult_str="The sum of all numbers between %.2f and %f = %f";
	outputresult_str=String.format(outputresult_str, num1,num2,result);
	System.out.println(outputresult_str);
	keybd.close();
		
	}
	public static double CalculateSum(double x, double y) {
		int z=2;
		double rslt=(x+y)*(y/z);
		return rslt;
		
	}

}
