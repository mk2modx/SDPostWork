package com.selfstudy.jthw;

public class Stack1Client {

	public static void main(String[] args) {
		
		Stack1 stack = new Stack1(6);
		
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		stack.push(0);
		
		
		System.out.println("1. Size of stach after push operations : " + stack.size() );
		
		System.out.println("2. Pop elements from the stack : ");
		
		while (!stack.isEmpty()) {
			System.out.printf(" %d", stack.pop());
		}
		
		System.out.println("\n3. Size of stack after pop operations : " + stack.size());
	}
	
	
}
