package com.selfstudy.interview;

public class OneToOneThousandEvens {

	public static void main(String[] args) {

		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {  // setup a condition that check if the number has a remainder from dividing by 2
				System.out.println(i);
			}

		}
	}
}