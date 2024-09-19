package sep16;

import java.util.Scanner;

//3. Create a program that takes a student's score and prints the corresponding grade (A-F) using if-else statements.

public class ifElseLadder_4 {

	static void studentScore(int sc) {

		if (sc > 90 && sc < 100) {
			System.out.println("Grade :: A");
		} else if (sc > 80 && sc < 90) {
			System.out.println("Grade :: B");
		} else if (sc > 70 && sc < 80) {
			System.out.println("Grade :: C");
		} else if (sc > 60 && sc < 70) {
			System.out.println("Grade :: D");
		} else if (sc > 40 && sc < 60) {
			System.out.println("Grade :: E");
		} else if (sc < 40) {
			System.out.println("Grade :: F ");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number :: ");

		int n = sc.nextInt();

		studentScore(n);
		sc.close();

	}

}
