package com.metehanolcer;

public class Question1 {

	public static void main(String[] args) {

		Question1.karetersucgenmetot();
	}

	public static void karetersucgenmetot() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print("* ");
			}
			System.out.println("*");
		}

		int i, k;
		int yildiz = 6;
		for (k = 0; k < 9; k++) {
			for (i = 0; i < yildiz; i++) {
				System.out.print("* ");
			}
			System.out.println("");
			yildiz--;
		}

	}
}
