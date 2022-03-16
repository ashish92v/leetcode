package com.test.sorting.algorithm;

public class QuickSort {

	public static void main(String args[]) {
		//O(n log(n))
		Integer[] array = new Integer[] {2,1,0,5,6,8,10,1};
		int left = 0;
		int right = array.length-1;
		
		quickSort(array, left, right);
		System.out.println(array);
		 for(Integer no: array)
			 System.out.println(no);
	}
	
	public static void quickSort(Integer[] arr, int low, int high) 
    {
         
        if (low >= high){
            return;
        }
 
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
 
        int i = low, j = high;
        while (i <= j) 
        {
            while (arr[i] < pivot) 
            {
                i++;
            }

            while (arr[j] > pivot) 
            {
                j--;
            }

            if (i <= j) 
            {
                swap (arr, i, j);
                i++;
                j--;
            }
        }

        if (low < j){
            quickSort(arr, low, j);
        }
        if (high > i){
            quickSort(arr, i, high);
        }
    }
     
    public static void swap (Integer array[], int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
