package com.selfstudy.interview;

public class FizzBuzz {

public static void main(String[] args) {
	// we'll start at 1 because 0 will say Fizz Buzz
	for(int i = 1; i <= 1000; i++) {
		if(i % 5 == 0 && i % 3 == 0) {
			System.out.println(i + " : Fizz Buzz");
			//using the modulus for both 5 and 3 is crucial because this is going from 
			//top down, if the number is divisible by both we have to check that first
			//or else it will print the individual one first
		} else if (i % 3 == 0) {
			System.out.println(i + " : Fizz");
		} else if (i % 5 == 0) {
			System.out.println(i + " : Buzz");
		} else {
			System.out.println(i);
		}
	}
	
}
}
