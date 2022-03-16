package com.test;

import java.util.PriorityQueue;

public class KthLargest {
	   static PriorityQueue<Integer> q;
       static int k;
	
       
	public static void main(String args[]) {
		KthLargest kthLargest =  new KthLargest();
		int[] num = {4, 5, 8, 2};
		KthLargests(3, num);
		kthLargest.add(3);   // return 4
		kthLargest.add(5);   // return 5
		kthLargest.add(10);  // return 5
		kthLargest.add(9);   // return 8
		kthLargest.add(4);
 	}
	
	  public static void KthLargests(int ka, int[] a) {
           k=ka ;
          q = new PriorityQueue<>(k);
          for (int n : a)
              add(n);
      }
	  
      public static int add(int n) {
          if (q.size() < k)
              q.offer(n);
          else if (q.peek() < n) {
              q.poll();
              q.offer(n);
          }
          return q.peek();
      }
      
}
