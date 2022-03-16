package com.test;

public class MergeSortedArray {

	public static void main(String args[]) {
		int[] a = {1,2,3,7};
		int[] b = {2,3,5,6};
		int[] c = new int[8];
		
		
		int i = a.length-1;
		int j = 0;
		
		for(int p= 7;p>=0;p--) {
			
			if(j<0 || i<0
					) {
				break;
			}
			
			if(a[i]>b[j]) {
				c[p]=a[i--];
			}else {
				c[p]=b[j--];
			}
			
			
		}
		
		System.out.println(c.toString());
		System.out.println(c.toString());
	}
	
	
	
}
