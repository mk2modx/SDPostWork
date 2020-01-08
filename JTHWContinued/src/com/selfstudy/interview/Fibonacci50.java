package com.selfstudy.interview;

public class Fibonacci50 {

	public static void main(String[] args) {
		
		int x = 0; //initialize first #
		int y = 1; //initialize second #
		int z = 0; //initialize next #
		
		System.out.println(x); //print first
		System.out.println(y); //print second
		
		//loop though remaining iterations
		for(int i = 0; i < 48; i++) {
			z = x + y; //calculate next number
			System.out.println(z); //print next number
			x = y; //remap new first and second
			y = z;
		}
		
	}
}
