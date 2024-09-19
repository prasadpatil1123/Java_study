package sep16;

import java.util.Scanner;

// 2. Use a while loop to calculate the factorial of a given number.

public class loop_2 {
	
	public static int fact_while(int n) {

		int i = 1;
		int fact = 1;


		while (i <= n) {
			fact = fact * i;
			i++;
		}
		return fact;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number :: ");
		int num = sc.nextInt();

		System.out.println("\nFactorial of " + num + " is :: " + fact_while(num));
		sc.close();

	}

}
