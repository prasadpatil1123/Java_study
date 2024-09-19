package section;

import java.util.Scanner;

public class ScannerDemo5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number :: ");
//		sc.nextLine();
		int num = sc.nextInt();

//		check(num);

//		checkEvenOrOdd(num);

		checkBoth(num);
		sc.close();
	}

	static void check(int n) {
		if (n % 5 == 0) {
			System.out.println("Given Number is divisible by 5");
		} else {

			System.out.println("Given Number is not divisible by 5");
		}
	}

	static void checkEvenOrOdd(int n) {
		if (n % 2 == 0) {
			System.out.println(n + " :: Given Number is Even");
		} else {
			System.out.println(n + " :: Given Number is Odd");
		}
	}

	static void checkBoth(int n) {
		if (n % 5 == 0) {

			if (n % 2 == 0) {
				System.out.println(n + " :: Given Number is Even");
			} else {
				System.out.println(n + " :: Given Number is Odd");
			}

			System.out.println("Given Number is divisible by 5");
		} else {
			if (n % 2 == 0) {
				System.out.println(n + " :: Given Number is Even");
			} else {
				System.out.println(n + " :: Given Number is Odd");
			}
			System.out.println("Given Number is not divisible by 5");
		}
	}

}
