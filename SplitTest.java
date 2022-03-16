package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SplitTest {

	public static void main(String args[]) {
		
		int ab = 2;
		int mask =1073741824;
		int tm = 
//		Integer.MIN_VALUE;
		
		  mask <<= 1;
		  System.out.println(mask);
		  mask <<= 1;
		  System.out.println(mask);
		  mask <<= 1;
		  System.out.println(mask);
	//	int res = hammingWeight(ab);
	//	System.out.println("ress "+res);
	}
	
	public static int hammingWeight(int n) {
	    int bits = 0;
	    int mask = 1;
	    for (int i = 0; i < 32; i++) {
	        if ((n & mask) != 0) {
	            bits++;
	        }
	        mask <<= 1;
	        System.out.println(mask);
	    }
	    return bits;
	}
}
