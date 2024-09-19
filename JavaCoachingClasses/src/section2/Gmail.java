package section2;

public class Gmail {

	String device;

	void display(String device) {
		System.out.println("Gmail is using with " + device);
	}

	public static void main(String[] args) {

		Gmail g1 = new Gmail();
		g1.display("Mobile");

		Gmail g2 = g1;
		g2.display("Laptop");

		System.out.println(g1 + "\t" + g2);
	}

}
