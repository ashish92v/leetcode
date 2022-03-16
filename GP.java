package com.test.practice.recursion;

public class GP {
	
	//GP formula   A*R^(N-1)
	
	public static void main(String args[]) {
		int A=3;
		int R=2;
		int N=4;
		int total = nthTermOfGP(9, 3, 2);
		System.out.println(total*A);
	}
	
	  public static int nthTermOfGP(int N, int A, int R) {
	        N--;
	        
	        if(N<=0) return 1;
	        
	        R=R*nthTermOfGP(N,A,R);
	        
	        return R;

	    }


}
