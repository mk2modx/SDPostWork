package com.selfstudy.jthw;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		double num1, num2; // declare 2 double variables
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first # : ");
		num1 = scanner.nextDouble();
		
		System.out.println("Enter second # : ");
		num2 = scanner.nextDouble();
	
		System.out.println("Enter an operator [ + , - , * , / ]");
		char operator = scanner.next().charAt(0);
		
		scanner.close(); // no more entries
		
		double output;
		
		switch(operator) // pass in operator char into switch
		{
		
		case '+':
			output = num1 + num2; // hard coding in actual operation
			break;
	
		case '-':
			output = num1 - num2;
			break;
		
		case '*':
			output = num1 * num2;
			break;
		
		case '/':
			output = num1 / num2;
			break;
			
		default:
			System.out.println("Wrong operator");
			return;
		
		}
		
		System.out.println(num1 + " " + operator + " " + num2 + " : " + output);
	}
	
}
