package com.selfstudy.interview;

public class ReplaceVowels {

 public static void main(String[] args) {
	String str = "What the fuck is going on";
	String output = removeVowels(str);
	System.out.println("Input : " + str);
	System.out.println("Output : " + output);
	
}

 static String removeVowels(String str) {
	 
	 String changed = str.replaceAll("[AaEeIiOoUu]", "");
	 
	 return changed;
	 
 }
 
}
