package com.selfstudy.jthw;

public class Print1000even {

	public static void main(String[] args) {

		int n = 1000;

		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}
}
