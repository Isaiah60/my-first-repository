package com.enima.absolutejava;

public class DifferentEqualsArray {
	
	public static void main(String[] args) {
	/* This program is to see how == and equalArray method
	 are different */
	
		/*int[] c = new int[10];
	int[] d = new int[10];
	
	int i;
	for(i=0;i<c.length;i++) {
		c[i]=i;
		
		
	}
	for(i=0;i<d.length;i++) {
		d[i]=i;
		
		}*/
		int[]c= {3, 5, 9, 4};
		int[]d= {3, 8, 9, 4};
	if(c==d) {
		System.out.println("c and d are equal by ==");
	}else {
		System.out.println("c and d are not equal by ==");
		System.out.println("== only test if they are in the same memory addrss");
	}
	if(equalsArray(c,d)) {
		System.out.println("c and d are equal by the equalArray method");
	}else {
		System.out.println("c and d are not equal by the equalArray method");
		
	}
	
	

	}
public static boolean equalsArray(int[] a, int[] b) {
	if(a.length!=b.length) {
		return false;
		
	}else {
		int i=0;
		while(i<a.length) {
			if(a[i]!=b[i]) {
				return false;
			}
			i++;
		}
		return true;
	}
		
	}


	
}
