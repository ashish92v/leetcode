package com.test;

public class StringToBinary {

	public static void main(String args[]) {
		
		Integer nu = 24;
		System.out.println(Integer.bitCount(nu));
		
		System.out.println(Integer.toBinaryString(nu));
		
		 for(char c = 'A'; c <= 'Z'; ++c)
		      System.out.print(c + " ");
		    
	}
	
}

