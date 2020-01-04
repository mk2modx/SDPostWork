package com.selfstudy.interview;

public class SwapTwoVariables {

	public static void main(String[] args) {
	
		int x = 53;
		int y = 27;
		
		 x = x + y; //x = 90
		 y = x - y; // take the total and remove the original number to get the opposite
		 //53 = 90 - 27
		 x = x - y; // reassign x back using total and new y
		 //27 = 90 - 53
	}
	
}
