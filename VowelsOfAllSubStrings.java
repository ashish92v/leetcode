package com.test;

import java.util.LinkedList;

public class VowelsOfAllSubStrings {

	public static void main(String args[]) {
		String st = "abiea";
		System.out.println(checkVowel("aba"));
		LinkedList<String> as = new LinkedList<>();
	}
	
	public static int checkVowel(String at) {
		
		int totalCount =0;
		for(int i=0;i<at.length();i++) {
			
			if("aeiou".indexOf(at.charAt(i))>-1)
			totalCount += (1+i)+(at.length()-i);
		}
		
		
		return totalCount;
	}
	
	
	 public static long countVowels(String word) {
	        
	        long res = 0, n = word.length();
	        for (int i = 0; i < n; ++i) {
	       //     System.out.println("aeiou".indexOf(word.charAt(i)));
	            if ("aeiou".indexOf(word.charAt(i)) >= 0) { 
	            	long temp = (i + 1) * (n - i);
	            	System.out.println(temp);
	                res += (i + 1) * (n - i); // 0+1 * 3-0// 3      // 2+1 * 3-2 //3
	            }
	        }
	        return res;
	    
	    }
	 
}
