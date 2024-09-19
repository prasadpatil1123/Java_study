package section;

import java.util.Scanner;

public class ScannerDemo4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Qty :: ");
		int qt = sc.nextInt();
		System.out.println("Enter Price :: ");
		int prc = sc.nextInt();
		totalBill(qt, prc);
		sc.close();

	}

	static void totalBill(int qty, int price) {
		double totalPrice = qty * price;
		System.out.println("Total Price :: " + totalPrice);
		check(totalPrice);
	}

	static void check(double total) {
		if (total < 1000) {
			double discount = total * 5 / 100;
			System.out.println("discount price after 5 % ::" + discount);
			double newTotal = total - discount;
			System.out.println("Final amount :: " + newTotal);
		} else if (total > 1000) {
			double discount = total * 10 / 100;
			System.out.println("discount price after 10 % ::" + discount);
			double newTotal = total - discount;
			System.out.println("Final amount :: " + newTotal);
		}
	}
}
