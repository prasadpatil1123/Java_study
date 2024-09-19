package Chroma;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ElectronicShop shop = new ElectronicShop();
		System.out.println("Enter qty :: ");
		int qty = sc.nextInt();

		System.out.println("Choose product :: ");
		System.out.println(" 1. Mobile 2. Laptop ");

		int type = sc.nextInt();

		if (type == 1) {
			shop.mobileBill(qty);
		} else if (type == 2) {
			shop.laptopBill(qty);
		}

		sc.close();

	}

}
