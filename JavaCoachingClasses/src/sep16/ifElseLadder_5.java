package sep16;

import java.util.Scanner;

//5. Use if-else statements to evaluate a given number and print whether it's a leap year or not.

public class ifElseLadder_5 {

	static void findLeapYear(int year) {

		if (year % 4 == 0) {
			System.out.println(year + " is Leap Year");
		} else {
			System.out.println(year + " is Not Leap Year");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (count < 5) {
			System.out.println("Enter Year :: ");

			int n = sc.nextInt();

			findLeapYear(n);
			count++;
		}
		sc.close();

	}

}
