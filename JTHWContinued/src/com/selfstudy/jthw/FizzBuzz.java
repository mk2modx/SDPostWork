package com.selfstudy.jthw;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
	int j = 0;
	
	for(int i = 1; i < 100; i++) {
		
		if (i % 3 == 0 && i % 5 == 0) {
			System.out.println(i + " Fizz Buzz");
		} else if (i % 3 == 0) {
			System.out.println(i + " Fizz");
		} else if (i % 5 == 0){
			System.out.println(i + " Buzz");
		} else {
			System.out.println(i);
		}
		
	}
		
		
	}
	
	
}