package Chroma;

public class ElectronicShop {

	static double mobilePrice = 500;
	static double laptopPrice = 1500;
	int qty;

	protected void mobileBill(int qty) {
		double r = mobilePrice * qty;
		System.out.println(" Mobile Bill is :: " + r);
	}

	protected void laptopBill(int qty) {
		double r = laptopPrice * qty;
		System.out.println(" Lapatop Bill is :: " + r);
	}

}
