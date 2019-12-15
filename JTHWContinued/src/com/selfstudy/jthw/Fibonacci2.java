package com.selfstudy.jthw;

public class Fibonacci2 {

	public static void main(String[] args) {
		
		int firstNum = 0; //first num to add
 		int secondNum = 1; //second num to add
		int nextNum = 0; //rusult from adding
		
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		for(int i = 2; i < 100; i++) {
			
			nextNum = firstNum + secondNum;
			
			System.out.println(nextNum);
			
			firstNum = secondNum;
			secondNum = nextNum;
			
		}
		
	}
	
	
}
