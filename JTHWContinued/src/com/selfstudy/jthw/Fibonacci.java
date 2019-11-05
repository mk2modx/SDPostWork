package com.selfstudy.jthw;

public class Fibonacci {
 
public static void main(String[] args) {
	
	int x = 0;
	int y = 1;
	int z = 0;
	
	System.out.println(x);
	System.out.println(y);
	
	for(int i = 2; i < 100; i++) {
		z = x+ y;
		
		
	System.out.println(z);
	x = y;	
	y = z;
		
	}
	
}
	
}
