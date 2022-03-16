package com.test;

public class SubarraySum {
	
	public static void main(String args[]) {
		//int[] nums = {-1,-1,1};
		int[] nums = {1,2,3};
		
		int total  = subarraySum(nums, 3);
		System.out.println(total);
	}
	
    public static int subarraySum(int[] nums, int k) {

        int count = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            
            if(nums[i]==k) return count+1;
            
            for(int j=i+1;j<nums.length;j++){
                if((j!=i) && j>i && (j-i)==1  && sum<=k){
                    sum = sum + nums[i]+nums[j];
                    if(sum==k){
                      count++;                        
                    }

                }
            }
        }
        
        return count;
        
    }

}
