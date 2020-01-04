package com.selfstudy.interview;

public class AreTheyLetters {

	
	public static void main(String[] args) {
		String str = "Letters3";
		System.out.println(areLetters(str));
		
	}
	
	public static boolean areLetters(String str) {
		
			
		for(int i = 0; i < str.length(); i++) {
			//we're iterating through the length of the string and placing a 
			//string's charAt value into a char
			char c = str.charAt(i);
			//we then check using ASCII values ton determine if it is within range of the letters
			if((!(c >= 'A' && c <= 'Z') ) && 
					(!(c >= 'a' && c <= 'z'))) {
				return false;
			}
		}
		return true;
	}
}
