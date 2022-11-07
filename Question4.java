package com.metehanolcer;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		System.out.println("Geometrik Hesaplayıcıya Hoş geldiniz!");
		System.out.println(" ");
		System.out.println("*****************************");
		System.out.println("**  Geometrik Hesaplayıcı  **");
		System.out.println("*****************************");

		int kareAlan = 1;
		int kareCevre = 2;
		int dikdortgenAlan = 3;
		int dikdortgenCevre = 4;
		int daireAlan = 5;
		int daireCevre = 6;
		int cikis = 7;
		int secim;

		boolean x = true;
		while (x) {

			System.out.println("Aşağıdaki hesaplamalardan hangisini yapmak istersiniz?");
			System.out.println("Yapmak istediğiniz hesaplamanın başındaki sayıyı giriniz : ");
			System.out.println(" ");
			System.out.println("1. Kare alan hesaplama");
			System.out.println(" ");
			System.out.println("2. Kare çevre hesaplama");
			System.out.println(" ");
			System.out.println("3. Dikdörtgen alan hesaplama");
			System.out.println(" ");
			System.out.println("4. Dikdörtgen çevre hesaplama");
			System.out.println(" ");
			System.out.println("5. Daire alan hesaplama");
			System.out.println(" ");
			System.out.println("6. Daire Çevre hesaplama");
			System.out.println(" ");
			System.out.println("7. Çıkış");

			Scanner input = new Scanner(System.in);
			secim = input.nextInt();

			if (secim == kareAlan) {

				System.out.println(" Cm olarak, karenin kenar uzunluğunu giriniz: ");
				int kareKenar = input.nextInt();

				int kareAlan1 = kareKenar * kareKenar;

				System.out.println("Karenin alanı :" + kareAlan1 + " cm2");
				System.out.println("");
				System.out.println("Şimdi sıra yeni işlemde! ");

			}

			else if (secim == kareCevre) {
				System.out.println("Cm olarak, karenin kenar uzunluğunu giriniz: ");
				int kareKenar = input.nextInt();

				int kareCevre1 = kareKenar * 4;

				System.out.println("Karenin çevresi : " + kareCevre1 + " cm");
				System.out.println("");
				System.out.println("Şimdi sıra yeni işlemde! ");
			} else if (secim == dikdortgenAlan) {
				System.out.println("Cm olarak, dikdörtgenin uzun kenar uzunluğunu giriniz: ");
				int uzunKenar = input.nextInt();

				System.out.println("Cm olarak, dikdörtgenin kısa kenar uzunluğunu giriniz: ");

				int kisaKenar = input.nextInt();
				int dikdortgenAlan1 = kisaKenar * uzunKenar;

				System.out.println("Cm olarak, dikdörtgenin alanı : " + dikdortgenAlan1 + " cm2");
				System.out.println("");
				System.out.println("Şimdi sıra yeni işlemde! ");
			}

			else if (secim == dikdortgenCevre) {

				System.out.println("Cm olarak, dikdörtgenin uzun kenar uzunluğunu giriniz: ");
				int uzunKenar = input.nextInt();

				System.out.println("Cm olarak, dikdörtgenin kısa kenar uzunluğunu giriniz: ");

				int kisaKenar = input.nextInt();
				int dikdortgenCevre1 = kisaKenar * 2 + uzunKenar * 2;

				System.out.println("Cm olarak, dikdörtgenin çevresi : " + dikdortgenCevre1 + " cm");
				System.out.println("");
				System.out.println("Şimdi sıra yeni işlemde! ");
			}

			else if (secim == daireAlan) {

				System.out.println("Cm olarak, dairenin yarıçap uzunluğunu giriniz ");
				int yaricap = input.nextInt();

				double pi = 3.16;

				double daireAlan1 = pi * yaricap * yaricap;

				System.out.println("Cm olarak, dairenin alanı : " + daireAlan1 + " cm2");
				System.out.println("");
				System.out.println("Şimdi sıra yeni işlemde! ");

			}

			else if (secim == daireCevre) {
				System.out.println("Cm olarak, dairenin yarıçap uzunluğunu giriniz ");
				int yaricap = input.nextInt();

				double pi = 3.16;

				double daireCevre1 = pi * yaricap * 2;

				System.out.println("Cm olarak, dairenin çevresi : " + daireCevre1 + " cm");
				System.out.println("");
				System.out.println("Şimdi sıra yeni işlemde! ");
			}

			else if (secim == cikis) {
				x = false;
				System.out.println("Programdan çıkış yapıldı, teşekkür ederiz!");
			}

			else {

				System.out.println("Yanlış bir sayı girdiniz, lütfen geçerli bir sayı girin!");
			}
		}

	}
}
