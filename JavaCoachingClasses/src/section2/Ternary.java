package section2;

import java.util.Scanner;

public class Ternary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter No ::");
//
//		double no = sc.nextInt();
//
//		String result = (no % 2 == 0) ? "even" : "Odd";
//		System.out.println(result);

		System.out.println("Select Color :: ");
		System.out.println("1.Blue \t 2.Orange 3.Red");
		int select = sc.nextInt();
		String result = (select == 1) ? "Blue" : (select == 2) ? "Orange" : (select == 3) ? "Red" : "Invalid";
		System.out.println(result);
		sc.close();
	}
}
 