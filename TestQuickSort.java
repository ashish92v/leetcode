package com.test.sorting.algorithm;

public class TestQuickSort {

	public static void main(String args[]) {
		int[] nums = {2,1,0,5,6,8,10,1};
		 QuickSort(nums, 0, nums.length-1) ;
		 for(int no: nums)
			 System.out.println(no);
	}
	
	public static void QuickSort(int[] nums, int i, int j) {
		int low = i;
		int high = j;
		
		if(low>high) {
			return;
		}
		int mid = i+(j-i)/2;
		
		while(low<high) {
			
			while(nums[low]<nums[mid]) {
				low++;
			}
			
			while(nums[high]>nums[mid]) {
				high--;
			}
			
			if(low<=high) {
			 swap(low,high,nums);
			 low++;
			 high--;
			}
			
			if(i<high) {
				 QuickSort( nums, i,high);
			}
			
			if(low<j) {
				 QuickSort( nums, low,j);
			}
		}
	}
	
	private static void swap(int i, int j, int[] nums) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
}
