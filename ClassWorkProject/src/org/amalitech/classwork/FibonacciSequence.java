package org.amalitech.classwork;

import java.util.Scanner;

public class FibonacciSequence {
public static void main(String[] args) {
	String welcomemessage="This is a program to print out the fibonacci seequence"
			+ " from 0 to the number you enter";
	System.out.println(welcomemessage);
	System.out.println("Please enter a number");
	Scanner keybd=new Scanner(System.in);
	int num=keybd.nextInt();
	keybd.close();
	int firstterm=0;
    int	secondterm=1;
	int nextterm=0;
	int i;
	System.out.print(firstterm+"\t"+secondterm+"\t");
	
	for (i=0;nextterm<num;i++) {
		nextterm=firstterm+secondterm;
		if(nextterm>num) {
			break;
		}
		System.out.print(nextterm+"\t");
		firstterm=secondterm;
		secondterm=nextterm;
	} System.out.println("\n"+"The number of Fibonacci sequence is:"+(i+2));
}
}
