package com.selfstudy.jthw;

public class checkPermutations {

	public static void main(String [] args) {
	
		permute("ABCD");
		
	}
	public static void permute(String full) {
		if(full == null || full.length() == 0) {
			System.out.println("You must provide a string of length > 0.");
		}
		
		permute("", full);
	}
	
	public static void permute(String prefix, String remaining) {
		if(remaining.length() == 0) {
			System.out.println(prefix);
			return;
		}
		
		for (int i = 0; i < remaining.length(); i++) {
			permute(prefix + remaining.charAt(i), remaining.substring(0,i) + remaining.substring(i + 1, remaining.length()) );
		}
	}
	
	}	