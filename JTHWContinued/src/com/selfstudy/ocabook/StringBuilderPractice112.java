package com.selfstudy.ocabook;

public class StringBuilderPractice112 {

	
	public static void main(String[] args) {
		StringBuilder alpha = new StringBuilder();
//		
//		for(char current = 'a'; current <= 'z'; current++)
//			alpha.append(current);
//		
//		System.out.println(alpha);
		
		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle");
		StringBuilder same = sb.append("+end");
		
		System.out.println(same == sb); //TRUE
		System.out.println(sb);
		
		sb.delete(1, 3);
		System.out.println(sb);
		sb.deleteCharAt(5);
		System.out.println(sb.reverse());
	}
	
}
