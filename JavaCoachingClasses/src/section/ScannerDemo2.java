package section;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your number ::");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(" a :: " + x + " b :: " + y);
		cheak(x, y);

		sc.close();
	}

	static void cheak(int a, int b) {
		if (a > b) { 
			System.out.println(a + " is greater than " + b);
		} else if (a < b) {
			System.out.println(a + " is lesser than " + b);
//			System.out.println("Not Eligible for voting");
		} else if (a == b) {
			System.out.println(a + " is equal to " + b);

		}
	}

}
