package com.selfstudy.jthw;

public class Palindrome {
//Given a string str, the task is to find whether the string is a palindrome or not in Java without using library methods.
	
	//input: str = "abba"
	// Output: Yes
	
	
	//function that returns true if str is a palindrome
	static boolean isPalindrome(String str) {
		//Pointers tot he beginning and the end of th string
		int i = 0, j = str.length() - 1;
		
	//while there are characters	
		while (i < j) {
			
			if (str.charAt(i) != str.charAt(j)){
				return false;
			}
			
			i++;
			j--;
			
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		String str = "abba";
		
		if(isPalindrome(str)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	
}
