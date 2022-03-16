package com.test.sorting.algorithm;

public class SelectionSort {
  // O(n^2)
	public static void main(String args[]) {
		Integer[] nums = new Integer[] { 2, 1, 0, 5, 6, 8, 10, 1 };
		
		int tempIndex = 0;
		
		for(int i=0;i<nums.length-1;i++) {
			int min = nums[i];
			for(int j=i+1;j<nums.length;j++) {
				if(min>nums[j]) {  
					min = nums[j];
					tempIndex = j;
				}
			}
			
			if(min<nums[i]) {
				int temp = nums[i] ;
				nums[i] = nums[tempIndex];
				nums[tempIndex] = temp;

			}
		}
	
		for(int no : nums) {
			System.out.print(no +", ");
		}
	} 
	
}
