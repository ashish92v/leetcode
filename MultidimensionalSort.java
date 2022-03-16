package com.test;

import java.util.Arrays;
import java.util.Comparator;

public class MultidimensionalSort {

	public static void main(String args[]) {
		double[][] num  = {{1,5},{13,1.55},{12, 100.6},{12.1,0.85}};
		
		Arrays.sort(num, Comparator.comparingDouble(o->o[0]));
		
		for(double[] du:num)
			for(double du1:du)
				System.out.println(du1);
		
		
		
		java.util.Arrays.sort(num, new java.util.Comparator<double[]>() {
		    public int compare(double[] a, double[] b) {
		        return Double.compare(a[0], b[0]);
		    }
		});
	}
	
	
}
