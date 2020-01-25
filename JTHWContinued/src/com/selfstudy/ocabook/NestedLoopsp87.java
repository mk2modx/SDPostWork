package com.selfstudy.ocabook;

public class NestedLoopsp87 {

	public static void main(String[] args) {
		//using a two-dimensional array
		int[][] myComplexArray = {{5,2,1,4},{3,9,8,9},{5,7,12,7}};
		//for each array in the array 
		for(int[] mySimpleArray : myComplexArray) {
			//print each item in this array
			for(int i=0; i<mySimpleArray.length; i++) {
				System.out.print(mySimpleArray[i]+"\t");
			}
			System.out.println();
		}
	}
}