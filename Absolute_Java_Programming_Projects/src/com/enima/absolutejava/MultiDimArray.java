package com.enima.absolutejava;

public class MultiDimArray {

	public static void main(String[] args) {
		System.out.println("This code shows how to write a 2 dimensional array\n prints out a number in the array");
		int num[][]= {{4,69,32,50},{23,89,21,56}};
		//System.out.println(num[1][1]);
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
			System.out.println(num[i][j]);
		}
	}
		System.out.println(num.length);
	}
}
