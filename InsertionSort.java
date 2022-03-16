package com.test.sorting.algorithm;

public class InsertionSort {

	public static void main(String args[]) {
		// O(n^2)
		// check current index value with prev index, and swap the value, loop until previous index value is low
		Integer[] nums = new Integer[] { 2, 1, 0, 5, 6, 8, 10, 1 }; 
		
		for(int i=1;i<nums.length;i++) {
			
			if(nums[i]<nums[i-1]) {
				int j = i;
				while(j>0 && nums[j]<nums[j-1]) {
					int temp = nums[j];
					nums[j] = nums[j-1];
					nums[j-1]= temp;
					j--;
				}
			
			}
		}

		for(int no : nums) {
			System.out.print(no +", ");
		}
	}
	
}
