package com.selfstudy.interview;

public class LargestInArray {

	
	
static int arr[] = {66, 44, 99, 78, 12, 8};

public static void main(String[] args) {
	
	System.out.println(largest(arr));
}

 static int largest(int arr[]) { //needs to be static because main is static
	
	int largest = 0;
	
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] > largest) {
			largest = arr[i];
		}
	}
	
	return largest;
}

}

