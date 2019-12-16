package com.selfstudy.jthw;

import java.util.EmptyStackException;

public class Stack1 {

	private int arr[];
	private int size;
	private int index = 0;

	public Stack1(int size) {
		// initialize stack size
		this.size = size;
		arr = new int[size];

	}

	public void push(int element) {

		if (isFull()) {
			throw new StackOverflowError("Stack is full");
		}

		arr[index] = element;
		index++;
	}

	public int pop() {

		if (isEmpty()) {

			throw new EmptyStackException();
		}

		return arr[--index];
	}

	public boolean isEmpty() {

		if (index == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		
		if (index == size) {
			return true;
		}
		return false;
	
	}
	
	public int size() {
		return index;
	}
}
