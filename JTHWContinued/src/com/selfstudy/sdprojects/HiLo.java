package com.selfstudy.sdprojects;

import java.util.Scanner;

public class HiLo {
	static int random;
	static int guess;

	public static void main(String[] args) {
		System.out.println("Try to find the random number from 1 - 20.");
		System.out.println();
		
		System.out.println();
		guess();
		
	}
	
	public static void guess() {
		random = (int) (Math.random() * 20) + 1;
		Scanner kb = new Scanner(System.in);
		int counter = 0;
		StringBuilder sb = new StringBuilder();
		boolean keepGoing = true;
		
		while(keepGoing) {
			
		sb.append("");
		System.out.println("Please select a number from 1 to 20 : ");
		guess = kb.nextInt();
		
		if(guess > random) {
			System.out.println("Your number is too high");
			sb.append(" " + guess);
			counter++;
		}else if(random > guess) {
			sb.append(" " + guess);
			System.out.println("Your number is too low");
			counter++;
		}else {
			System.out.println("You Guessed " + random + " Correctly");
			System.out.println("In " + counter + " tries.");
			System.out.println("Your guesses : " + sb.toString() + " and " + random);
			keepGoing = false;
		}
		}
		System.out.println("Would you like to play again? Y/N");
		String playAgain = kb.next();
		
		if((playAgain.equals("Y")) || (playAgain.equals("y"))) {
			guess();
		}else {
			System.out.println("Goodbye");
		}
		
		
		
	}

}
