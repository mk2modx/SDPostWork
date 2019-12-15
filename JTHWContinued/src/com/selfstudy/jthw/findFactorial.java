package com.selfstudy.jthw;

public class findFactorial {

	public static void main(String args[]) {
		
		//factorial means number * ( number - 1) until number = 0
		
		System.out.println("factorial of 5 using recursion in Java is: " + factorial(5));
	
		System.out.println("factorial of 6 using iteration in Java is: " + fact(6));
	}

	private static int fact(int number) {
		int result = 1;
		while(number != 0) {
			result = result*number;
			number--;
		}
		return result;
	}

	private static int factorial(int number) {
	if(number == 0) {
		return 1; // initiallizes 1 as the factorial
	}
		
		return number*factorial(number - 1);
	}
	// it starts as 5 * 1 , then 4 * 5 = 20
	// 3 * 20 = 60
	// 2 * 60
	
}
