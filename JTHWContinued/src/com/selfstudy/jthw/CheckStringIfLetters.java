package com.selfstudy.jthw;

public class CheckStringIfLetters {

	public static void main(String[] args) {
		
		String str = "turtle1";
		
		System.out.println(isLetters(str));
		
	}
	
	private static boolean isLetters(String s) {
		
		for(int i = 0; i < s.length(); i++) {
			
			if(!(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') && !(s.charAt(i) >= 'a' && s.charAt(i)<= 'z')) {
				return false;
			}
		
		}
			
		return true;
		
	}
	
}
