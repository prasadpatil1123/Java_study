package section;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name :: ");
		String result = sc.next();
		System.out.println("Welcome " + result);
		sc.close();
	}

}
