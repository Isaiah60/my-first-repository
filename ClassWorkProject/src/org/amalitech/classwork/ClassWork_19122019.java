package org.amalitech.classwork;

public class ClassWork_19122019 {
	static String [] usrNm_arr= {"Adwoa","Afia","Joe","Smith","Andy","Kim","Kofi","Ama",};

	public static void main(String[] agrs) {

		int [] account_enable_i= {
				1, // adow's account is enabled
				0, // afia is disabled
				1, // enabled
				1,// enabled
				0, //disabled
				1, //enabled
				1, //enabled
				1
		};
		
	
		System.out.println("The users are: \n"); 
		String enterd_username= "Kofi";
		
		if(validateUsername(enterd_username)) {
			System.out.println(enterd_username + " is in the array");
			
		}else {
			System.out.println(enterd_username + " is not the array");
		}
		
		
		
	
		
			
		}
	public static boolean validateUsername(String entered_username) {
		boolean isThisInTheArray_bool=false;
		for(int i=0; i<usrNm_arr.length;i++) {
			isThisInTheArray_bool=usrNm_arr[i].equals(entered_username);
			
			if(isThisInTheArray_bool==true) {
				break;
			}
			
			
		}
		return isThisInTheArray_bool;
	}
	}



