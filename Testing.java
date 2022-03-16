package com.test;

public class Testing {

	public static void main(String args[]) {
	 
		String word = "432";
		long n = word.charAt(1)-'0'; 
		
		System.out.println(n);//2147483647
		
		System.out.println(Integer.MAX_VALUE);
		long as= 221214214721474214748214748321474836l;
		
		
		System.out.println((int) as);
		if((int) as <Integer.MIN_VALUE) {
			System.out.println(Integer.MIN_VALUE);
		}
		
	}
}
