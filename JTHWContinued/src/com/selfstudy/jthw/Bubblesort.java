package com.selfstudy.jthw;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		
		bubbleSort(new int[] {92, 12, 45, 19, 91, 55});
		
	}

	private static void bubbleSort(int[] numbers) {
		
		System.out.printf("Unsorted arra in Java :%s %n", Arrays.toString(numbers));
		
		for(int i = 0; i < numbers.length; i++) {
			
			for(int j = numbers.length -1; j > i; j--) {
				if (numbers[j] < numbers[j - 1]) {
					swap(numbers, j, j-1);
				}
			}
		}
		
		System.out.println("Sorted : " + Arrays.toString(numbers));
	}

	private static void swap(int[] array, int from, int to) {
		int temp = array[from];
		array[from] = array[to];
		array[to] = temp;
		
	}
	
	
}
