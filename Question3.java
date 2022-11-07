package com.metehanolcer;

public class Question3 {

	public static void main(String[] args) {

		System.out.println(karakterSayici("Bugün güzel bir gün", 'g'));
		System.out.println(karakterSayici("Bugün güzel bir gün", 'x'));
	}

	public static int karakterSayici(String metin, char harf) {
		int num = 0;

		for (int i = 0; i < metin.length(); i++) {
			if (metin.charAt(i) == harf)
				num++;
		}

		return num;

	}

}
