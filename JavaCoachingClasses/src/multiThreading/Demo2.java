package multiThreading;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Demo2.main()");
		int n = 8;

		for (int i = 0; i < n; i++) {
			Thread td = new Thread(new MultiThredingDemo2());
			td.start();
		}

	}

}
