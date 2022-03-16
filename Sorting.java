package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sorting {

	public static void main(String args[]) {
		Sorting ss = new Sorting();
		String search = "442aB-as.d12A";
		
		char[] ch = search.toCharArray();

		Arrays.sort(ch);
		
		System.out.println(String.valueOf(ch));
	}
	
}
