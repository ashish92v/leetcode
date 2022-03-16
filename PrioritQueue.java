package com.test;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrioritQueue {
	
	public static void main(String args[]) {
	int[] num = {2,1,3,6,2,4};
	
	PriorityQueue<Integer> qu = new PriorityQueue<>();
	
	Queue<Integer> qua = new LinkedList<>();
	
	for(int nu:num ) {
		qu.add(nu);
	}
		
	while(!qu.isEmpty()) {
		System.out.println(qu);
	}
	}

}
