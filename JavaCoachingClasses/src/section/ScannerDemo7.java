package section;

import java.util.Scanner;

public class ScannerDemo7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :: ");
		int n1 = sc.nextInt();

		check(n1);
		sc.close();

	}

	private static void check(int m) {

		if (m % 5 == 0) {
			System.out.println("divisible by 5");
		}
		if (m % 3 == 0) {
			System.out.println("divisible by 3");
		}
		if (m % 5 == 0 && m % 3 == 0) {
			System.out.println("divisible by 3 and 5");
		} else {
			System.out.println("Invalid Number...........");
		}
	}

}
