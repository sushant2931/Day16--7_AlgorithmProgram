package com.algorithm;

import java.util.Scanner;

public class FindYourNumber {
	static Scanner sc = new Scanner(System.in);

	public static void main(String ar[]) {

		System.out.println("Enter how many numbers you want to store ");
		int len = sc.nextInt();
		System.out.println("Please put on one in your mind ");
		int num[] = new int[len];

		for (int i = 0; i < len; i++) {
			int j = i + 1;
			num[i] = j;
		}
		int n = num.length - 1;
		FindYourNumber.repeat(num, 0, n);

	}

	public static int repeat(int arr[], int start, int end) {

		for (int i = 0; i < end; i++) {
			System.out.print(arr[i] + " ");
		}
		int mid = start + (end - start) / 2;
		System.out.println();
		System.out.println("midel " + arr[mid]);
		System.out.println(arr[mid] + "  is this your number ?");
		System.out.println("yes 1 or No 0");
		int choice2 = sc.nextInt();

		switch (choice2) {
		case 1:
			System.out.println(arr[mid]);

			break;

		case 0:
			System.out.println("Is your number is greater then" + arr[mid]);
			System.out.println("yes 1 or No 0");
			int choice3 = sc.nextInt();

			switch (choice3) {
			case 1:

				return FindYourNumber.repeat(arr, mid + 1, end);

			case 0:
				return FindYourNumber.repeat(arr, start, mid - 1);
			}

			break;

		}

		return -1;
	}

}
