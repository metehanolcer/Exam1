package com.metehanolcer;

public class Question2 {

	static int TekrarlıIndisMetodu(int arr[], int min, int max) {

		if (min > max)
			return -1;

		int mid = (min + max) / 2;

		if (arr[mid] != mid + 1) {
			if (mid > 0 && arr[mid] == arr[mid - 1])
				return mid;

			return TekrarlıIndisMetodu(arr, min, mid - 1);
		}

		return TekrarlıIndisMetodu(arr, mid + 1, max);
	}

	public static void main(String[] args) {
		int arr[] = { 9, 7, 5, 3, 7, 7, 3, 18, 2, 0, 7 };
		int index = TekrarlıIndisMetodu(arr, 0, arr.length - 1);
		if (index != -1) {
			System.out.println("İlk tekrar eden sayı : " + arr[index]);
		} else {
			System.out.println("Tekrar eden sayı bulunamamıştır");
		}
	}
}
