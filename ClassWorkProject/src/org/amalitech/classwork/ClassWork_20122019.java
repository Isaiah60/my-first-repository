package org.amalitech.classwork;

import java.util.Scanner;

public class ClassWork_20122019 {
	
	public static void main(String[] args) {
		System.out.println("Please enter number");
		Scanner keybd=new Scanner(System.in);
		int number=keybd.nextInt();
	    keybd.close();
		
		TimesTable(number);
		
	}	
	public static void TimesTable(int number) {
	
		for (int i=1;i<=number;i++) {
			for (int j=1; j<=number;j++) {
				int s=i*j;
				if(s%2==0) {
					System.out.print("<"+s+">"+"\t");	
				}else {
					System.out.print("("+s+")"+"\t");
				}
				
			}
				
			System.out.println("");
			} 
		
	}
}
