package com.test.sorting.algorithm;

import java.util.Random;

public class MergeSort {
	
	//nlog(n)
	public static void main(String args[]) {
		Random rnd = new Random();
		Integer[] nums = new Integer[10];
		
		for(int i=0;i<nums.length;i++) {
			nums[i]= rnd.nextInt();
		}
		
		mergeSort(nums);
		System.out.println("hello");
		
	}
	
	
	public static void mergeSort(Integer[] nums) {
		
		int len = nums.length;
		
		if(len<2) {
			return;
		}
		
		int mid = len/2;
		
		Integer[] num1 = new Integer[mid];
		Integer[] num2 = new Integer[nums.length-mid];
		
		for(int i=0;i<mid;i++) {
			num1[i] = nums[i];
		}
		int l= 0;
		for(int i=mid;i<nums.length;i++) {
			num2[l++] = nums[i];
		}
		l=0;
		
		mergeSort(num1);
		mergeSort(num2);
		
		merge(nums, num1, num2);
		
	}
	
	public static void merge(Integer[] nums, Integer[] num1, Integer[] num2) {
		
		int i=0,j=0,k=0;
		
		while(i<num1.length && j<num2.length) {
			if(num1[i]<num2[j]) {
				nums[k] = num1[i];
				i++;
			}else {
				nums[k] = num2[j];
				j++;
			}
			k++;
		}
		
		while(i<num1.length) {
			nums[k] = num1[i];
			i++;
			k++;
		}
		
		while(j<num2.length) {
			nums[k] = num2[j];
			j++;
			k++;
		}

	}
}
