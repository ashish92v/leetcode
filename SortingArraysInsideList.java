package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SortingArraysInsideList {

	public static void main(String args[]) {
		List<Integer[]> lst = new ArrayList<Integer[]>();
		

	//	Integer[][] numList = new Integer[][] {{-6,4,3},{-7,-4,-2},{5,-4,-8}};
	//	Integer[][] numList = new Integer[][] {{-8,-2,5},{-8,-4,-2},{-8,-2,3}};
		Integer[][] numList = new Integer[][] {{-8,2,6},{-6,1,5},{-8,3,5}};
		
		for(Integer[] arr: numList) {
			Arrays.sort(arr);
			lst.add(arr);
		}
		
		Comparator<Integer[]> comp = new Comparator<Integer[]>() {
			
			@Override
			public int compare(Integer[] a, Integer[] b) {
				int i =0,j=0;
				while(i<a.length && j<b.length) {
					// for 1, we will swap the value
					if(a[i]>b[j]){
						return 1;
					}else if(a[i]==b[j]){
						i++;
						j++;
					}else {
						// for 1, we will keep it as it, will not swap
						return -1;
					}
				}
				return 0;
			}
		};
		
		Collections.sort(lst, comp);
		System.out.println(lst);
		
		
		// printing o/p
		for(Integer[] op : lst) {
			for(Integer no: op)
			System.out.print(no+","  );
		}
		
	}
	
}
