package org.amalitech.countingduplicates;

public class CountingDuplicates {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//1. ARRAY OF WORDS TO CHECK
		
		 String [] word_array = {"abcde","aabbcde","aabBcde","indivisibility","Indivisibilities","aA11","ABBA"};
		 int i;
		 
			for (i = 0; i < word_array.length; i++ ) {
				if (CheckDuplicates(word_array[i])) {
					//System.out.print(word_array[i]+ " -> #");
				}
				else {
					System.out.println(word_array[i]+" -> 0 # no characters repeats more than once.");
				
				
			}
			}
			
			}
	 static boolean CheckDuplicates(String str) {
		int cnt = 0;
		  char[] inp = str.toCharArray();
		//  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		     System.out.print( str+"-> 2 #  " +cnt+"#" + inp[j]);
		     //System.out.print(cnt);
		     
		     cnt++;
		    return true;
		    }
		    
		   } 
		  }if(cnt>0) {
			  System.out.print(cnt);
		  }
		  return false;
	}


	}


