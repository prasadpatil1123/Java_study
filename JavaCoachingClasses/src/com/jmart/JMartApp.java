package com.jmart;

import java.util.Scanner;

public class JMartApp {

	
	public static void main(String[] args) {

		System.out.println("Welcome to the JMart Appliccation \n");

		try (Scanner sc = new Scanner(System.in)) {
			Product pd = new Product();

			while (true) {
				System.out.println("Choose given option :: ");

				System.out.println("1.Shopping   2.Exit");
				int option = sc.nextInt();
				int subTotal[] = { 0, 0 };
				int cnt[] = { 0, 0 };
				String gc[] = { "Bakery    10Rs ", "Milk      20Rs" };
//			int count = 0;
				int qty = 0;
				switch (option) {
				case 1:
					System.out.println("Choose given grocery :: ");
					System.out.println("1.Bakery    2.Milk");
					int item = sc.nextInt();

					switch (item) {
					case 1:
//					String gc1 ="Bakery    10Rs ";
//					System.out.println(gc1);
						System.out.println(gc[0]);

						System.out.println("If you want add more ");

						System.out.println("1.Yes  2.No ");
						qty = sc.nextInt();

//					int cnt[0] = 0;
						if (qty == 1) {
							System.out.println("Enter number of product you want :: ");
							cnt[0] = sc.nextInt();
							subTotal[0] = cnt[0] * 10;
//						pd.productBill(count);

						} else {
//						count1 = 1;
//						pd.productBill(s);
							subTotal[0] = cnt[0] * 10;
						}

						break;

					case 2:
//					String gc2 = "Milk    20Rs";
//					System.out.println(gc2);
						System.out.println(gc[1]);

						System.out.println("If you want add more ");

						System.out.println("1.Yes  2.No ");
						qty = sc.nextInt();

//					int cnt[1] = 0;
						if (qty == 1) {
							System.out.println("Enter number of product you want :: ");
							cnt[1] = sc.nextInt();
							subTotal[1] = cnt[1] * 20;
//						pd.productBill(count);

						} else {
//						count2 = 1;
//						pd.productBill(s);
							subTotal[1] = cnt[1] * 20;
						}
//					break;
					}
					int end = 0;
					for (int i = 0; i < 2; i++) {
						end = end + subTotal[i];
					}

					int x = pd.basket(end);
					System.out.println("Products :: \n" + gc[0] + " conunt is :: " + cnt[0] + "\n" + gc[1]
							+ " conunt is :: " + cnt[1] + "\n" + "\nTotal Bill :: " + x + "\n");
					System.out.println("Thank You for Shopping \n");

					break;
				case 2:
					System.out.println("Visit again !!!");
					break;
				}
			}
		}

	}

}
