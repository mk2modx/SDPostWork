package com.selfstudy.interview;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = {-1,0,1,2,3};
		int[] arr2 = {2,2,3,3,5,7};
		int[] arr3 = {-100, 0, 100};
		
//		int[] result = merge(arr1, arr2);
		int [] result = merge3(arr1, arr2, arr3);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	public static int[] merge3(int[] a, int[] b, int [] c) {
		
		int [] m1 = merge(a, b);
		int [] m2 = merge(c, m1);
		
		
		return m2;
	}
	
	public static int[] merge(int[] a, int [] b) {
		int i = 0;
		int j = 0;
		int k = 0;
		
		int[] c = new int[b.length + a.length];
		
		while(i < a.length && j < b.length) {
			if(a[i]<b[j]) {
				c[k] = a[i];
				i++;
				k++;
			}else {
				c[k] = b[j]; 
				j++;
				k++;
			}
				
		}
		
		while(i < a.length) {
			c[k++] = a[i++];
		}
		while(j < b.length) {
			c[k++] = b[j++];
		}
		
		return c;
	}
	
}
