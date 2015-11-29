package com.java2novice.algos;

public class FibonacciCrap {

	public static void main(String a[]) {

		int febCount = 100;
		int[] feb = new int[febCount];
		feb[0] = 0;
		feb[1] = 1;
		for (int i = 2; i < febCount; i++) {
			feb[i] = feb[i - 1] + feb[i - 2];
		}

		for (int i = 0; i < febCount; i++) {
			System.out.print(feb[i] + " ");
		}
	}
}