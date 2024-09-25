package multiThreading;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 8;

		for (int i = 0; i < n; i++) {
			MultiThredingDemo md = new MultiThredingDemo();
			md.start();
		}

	}

}
