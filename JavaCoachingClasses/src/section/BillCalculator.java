package section;

import java.util.Scanner;

public class BillCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Bill Amount :: ");

		double totalAmt = sc.nextDouble();

		double discount = totalAmt * 15 / 100;

		double discountedAmt = totalAmt - discount;

		System.out.println("discounted amount ::" + discountedAmt);

		double gstAmt = discountedAmt * 5 / 100;

		double finalAmt = discountedAmt + gstAmt;

		System.out.println("Final amount ::" + finalAmt);
		
		sc.close();

	}

}
