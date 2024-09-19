package homework;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number :: ");

		int num = sc.nextInt();

		checkEvenOrOdd(num);
		System.out.println();
//		checkPrime(num);

		if (isPrime(num)) {
			System.out.println("It is Prime");
		} else {
			System.out.println("It is not Prime");
		}
		sc.close();

	}

	private static void checkEvenOrOdd(int n) {

		if (n % 2 == 0) {
			System.out.println(n + " is Even Number");
		} else {
			System.out.println(n + " is Odd Number");
		}
	}

//	private static void checkPrime(int n) {
//		int count = 0;
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				count++;
//			}
//		}
//
//		if (count == 2) {
//			System.out.println("Prime number");
//		} else
//			System.out.println("Not a Prime number");
//	}

	private static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

}
