package com.selfstudy.ocabook;

public class Swan {
	int numberEggs; //instance variable
	byte x = 3;
	
	public static void main(String[] args) {
		Swan mother = new Swan();
		Swan baby = new Swan();
		baby.numberEggs = 5;
		mother.numberEggs = 1; //setting var
		System.out.println(mother.numberEggs);
		System.out.println(baby.numberEggs);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
	}
	
}
