package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;


public class TopThree {

	public static void main(String args[]) {
		System.out.println(System.nanoTime());
		List<Integer> nums = Arrays.asList(10,1,2,10,12,12);
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		Stack<Integer> stc = new Stack<>();
		
		for(Integer nu : nums) {
			queue.add(nu);
		}
		
		int len = queue.size();
		int[] op = new int[3];
		int i=0;
		
		int i =0;
		while(i<op.length) {
			op[i++] = stc.pop();
		}
		System.out.println(System.nanoTime());
	}
}
