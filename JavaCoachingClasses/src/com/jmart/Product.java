package com.jmart;

public class Product {

	int productCost = 10;
	int availableProduct = 20;
	int totalAmt = 0;

	void productBill(int cnt) {
		if (cnt <= 0) {
			System.out.println("Product not selected");
			return;
		}
		if (cnt <= availableProduct) {
			int prodAmt = cnt * productCost;
//			System.out.println("Product succefully added");
			System.out.println("Product Bill :: " + prodAmt);
		} else {
			System.out.println("Product Not Selected.");
		}
	}

	int basket(int prd) {
		totalAmt = totalAmt + prd;
//		System.out.println("Total Bill :: " + totalAmt);
		return totalAmt;
	}

}
