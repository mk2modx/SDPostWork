package com.selfstudy.jthw;

public class Recursion {
	public static void main(String[] args) {
		recurse(10);
	}
	
	public static int recurse(int x) {
		if(x == 0) {
			System.out.println("done");
			return x;
		}
		return recurse(x-1);
	}
}
