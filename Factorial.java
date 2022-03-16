package com.test.practice.recursion;

public class Factorial {

	public static void main(String args[]) {
		int n=5;
		System.out.println(n*factorial(n));
	}
	
	public static int factorial(int n) {
		n--;
		
		if(n<=0) {
			return 1;
		}
		
		if(n>0) {
			n= n*factorial(n);
		}
		
		return n;
	}
	
}
