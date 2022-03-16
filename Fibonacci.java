package com.test.practice.recursion;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		int n = 21;

		list.add(0);
		list.add(1);
		
		fibonacci(0,1,n,list);
		System.out.println(list);
	}
	
	public static List<Integer> fibonacci(int sum, int b, int n, List<Integer> lst) {

		n--;
		if(n<=0) return lst;
		
		int temp = sum+b;
		b= sum;
		lst.add(temp);
		fibonacci(temp, b, n, lst);
		
		return lst;
	}

}
