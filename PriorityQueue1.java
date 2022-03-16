package com.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class PriorityQueue1 {

	public static void main(String args[]) {
		System.out.println((int) '1'); //49
		System.out.println((int) 'A'); //65
		System.out.println((int) 'a'); // 97
		
		Deque<String> deq = new ArrayDeque<>();
		deq.add("1");
		deq.add("2");
		deq.add("5");
		String av = deq.pop();
		System.out.println(av);
		System.out.println(deq);
	}
	
}
