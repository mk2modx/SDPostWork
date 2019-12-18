package com.selfstudy.jthw;

public class SwapXY {

	public static void main(String [] args) {
		
		int x = 27;
		int y = 53;
		
		swap(x,y);
	}

	private static void swap(int x, int y) {
		System.out.println("y = " + y);
		System.out.println("x = " + x);
		x = x + y;
		
		y = x - y;
		
		x = x - y;
		
		System.out.println("after swap : ");
		System.out.println("y = " + y);
		System.out.println("x = " + x);
	}
	
	
}
