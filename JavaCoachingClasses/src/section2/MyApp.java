package section2;

import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Base Price ::");
		double basePrice = sc.nextDouble();

		System.out.println(basePrice);

		System.out.println("Select Vehicle :: ");
		System.out.println("1.Car     2. Bike");
		int vh = sc.nextInt();

		System.out.println("Select Fuel :: ");
		System.out.println("1.Petrol     2. Electric");
		int fl = sc.nextInt();

		Showroom sh = new Showroom();
		double onRoadPrice = sh.onRoadPrice(vh, fl, basePrice);
		System.out.println(onRoadPrice);
		sc.close();
	}

}
