package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class VersionSorting {
	
	public static void main(String args[]) {
		String[] search = {"442aB-asd12A","402aB-1asd12A"};

		Comparator<String> comp = new Comparator<String>() {
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		};
		
		Arrays.sort(search,comp);
		
		for (String string : search) {
			System.out.println(string);
		}
	}
}
