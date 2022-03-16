package com.test;

public class ThreadTesting {
	
	public static void main(String args[]) {
		Demo de = new Demo();
		de.start();
	}
}

 class Demo extends Thread{

	@Override
	public void run() {
		System.out.println("Hello");
		
	}
	 
 }