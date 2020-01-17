package org.amalitech.classwork;

import java.util.Scanner;

public class ClassWork_16122019 {
	static String nameofperson_str;
	static String menu1= "Fried rics and chicken";
	static String menu2="\nBanku and Okro";
	static String menu3="\nChips and Chicken" ;
	
	static String listofmenu=menu1+menu2+menu3;

	public static void main(String[] args) {
		/*System.out.println("Please select your meal by entering"
				+ "1, 2, or 3");
		System.out.println("the menu availble are: "+listofmenu);
		Scanner keybd=new Scanner(System.in);
		int mealnumber=keybd.nextInt();
		*/
		welcomeUser();
		Scanner keybd_str=new Scanner(System.in);
		String Usrname=keybd_str.nextLine();
		
		int numberofentrycounter=0;
		int allowederrors=3;
		//boolean moveoutofloop=false;
		while((Usrname.trim().length()<2) && (numberofentrycounter<allowederrors) ) {
			System.out.println("Please enter a proper name!!!");
			Usrname=keybd_str.nextLine();
			//numberofentrycounter++;
			
			}
		System.out.println("Name is ok");
		System.out.println("Welcome "+Usrname);
	}
	//WELCOME USER FUNCTION
	public static void welcomeUser() {
		String success_message_str="Hello, Please enter your username to proceed";  
					System.out.println(success_message_str);
	}
}
