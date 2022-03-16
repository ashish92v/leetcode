package com.test.sorting.algorithm;

public class BubbleSort {

	public static void main(String args[]) {
//O(n^2)
		//loop until length, check next index value with current index value
		Integer[] nums = new Integer[] { 2, 1, 0, 5, 6,8, 10, 1 }; 
		
		int j=nums.length-1;
		while(j>=0) {
			
			for(int i=0;i<j+1;i++) {
				if(nums[i]>nums[i+1]) {
					int temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
					i++;
				}
			}
			j--;
		}
		
		for(int no : nums) {
			System.out.print(no +", ");
		}
	}
}
