package com.selfstudy.interview;

public class IntArrReturnEven {

public static void main(String[] args) {
	
int arr[] = {22, 23, 45, 87, 99, 88, 64, 2};

int arr2[] = evensOnly(arr);

for (int Sys = 0; Sys < arr2.length; Sys++) {
	System.out.println(arr2[Sys]);
}
	
}

static int[] evensOnly(int[] arr) {
	int count = 0;
	int[] evens = new int [arr.length];
	for (int i = 0; i < arr.length; i++) {
		if(arr[i] % 2 == 0) {
			evens[count] = arr[i];
			count++;
		}
	}
	
	return evens;
	
}
	
}
