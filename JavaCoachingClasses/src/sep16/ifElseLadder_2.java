package sep16;

import java.util.Scanner;

//1. Write a Java program to find the largest of three given numbers using if-else statements.

public class ifElseLadder_2 {

	private static void check(int n) {

		if (n % 2 == 0) {
			System.out.println(n + " is Even Number");
		} else {
			System.out.println(n + " is Odd Number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number :: ");

		int n = sc.nextInt();

		check(n);
		System.out.println();

	}

}
