package com.selfstudy.interview;

public class IsANumberPrime {

	//prime = can only be divided to itself and 1 evenly
	
	public static void main(String[] args) {
		int n = 1000;
		
		for(int i = 2; i < n; i++) {
			
			if (isPrime(i)) {
				
				System.out.println(i);
			}
		}
		
		
	}
	
	static boolean isPrime(int n) {
		for(int i = 2; i < n; i++) {
			
			if(n % i == 0) {
				return false;
			}
			
		}
		
		return true;
		
	}
}
