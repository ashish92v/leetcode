package com.test.leetcode.tricky;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThreeSum {
	
	public static void main(String args[]) {
		int[] nums = {-1,0,1,2,-1,-4};
		threeSum(nums);
	}

	public static List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> map =  new HashMap<Integer, Integer>();
        List<List<Integer>> finalList = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        Set<Integer> dup = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
            
        	//set add and returns true if new element is inserted, else it returns false. false indicate element already exists and set has not done any change
            if(dup.add(nums[i])){
                for(int j=i+1;j<nums.length;j++){

                    Integer complement = -nums[i] - nums[j];
                    if(map.containsKey(complement) && map.get(complement)==i){
                        List<Integer> lst = Arrays.asList(nums[i],nums[j],complement);
                       // we are using collection sorting because in set can check if list already exists or not.
                        Collections.sort(lst);
                        set.add(lst);

                    }
// storing next value and first index
                    map.put(nums[j],i);
                }
        }
        
        
         return new ArrayList(set);
    }
	
}
