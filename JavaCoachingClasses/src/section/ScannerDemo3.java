package section;

import java.util.Scanner;

public class ScannerDemo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age :: ");
		int age = sc.nextInt();
//		System.out.println("Welcome " + result);
		cheak(age);

		sc.close();
	}

	static void cheak(int result) {
		if (result > 18) {
			System.out.println("Eligible for voting");
		} else {
			System.out.println("Not Eligible for voting");
		}
	}

}
