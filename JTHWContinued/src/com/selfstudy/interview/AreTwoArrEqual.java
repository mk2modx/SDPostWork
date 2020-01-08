package com.selfstudy.interview;

public class AreTwoArrEqual {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 1, 2, 3, 4 };
		int[] arr2 = new int[] { 1, 2, 3, 4 };
		int[] arr3 = new int[] { 1, 2, 4, 3 };
		
		System.out.println(equal(arr1,arr2));
		System.out.println(equal(arr2,arr3));

	}

	public static boolean equal(int [] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;

	}
}
