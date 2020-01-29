package com.selfstudy.ocabook;

public class StringBuilder189 {

	public static void main(String[] args) {
		
		StringBuilder name = new StringBuilder();
		speak(name);
		System.out.println(name);
		
	}

	private static void speak(StringBuilder s) {
		s.append("Webby");
	}
	
	
}
