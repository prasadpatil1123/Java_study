package section2;

public class Product {

	int productId;
	String ProductName;
	double productPrice;

	void acceptDetails(int pid, String pname, double pprice) {
		productId = pid;
		ProductName = pname;
		productPrice = pprice;
	}

	void productDisplay() {
		System.out.println("Product Id :: " + productId);
		System.out.println("Product Name :: " + ProductName);
		System.out.println("Product Price :: " + productPrice);
	}

}
