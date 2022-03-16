package com.test;

public class PassByValue {

	public static void main(String args[]) {
		
		Emp e = new Emp(5);
		insert(e);
		System.out.println(e.x); 
		
	}
	
	public static void insert(Emp e) {
		e.x = 10;
	}
	
}


class Emp{
	
	int x;
	Emp(int x){
		this.x = x;
	}
	
}
