package methodRecurssion;

public class DemoSelf {

	public static void main(String[] args) {

		calling();

	}

	private static void calling() {

		System.out.println("I am Java Developer");
		calling();
	}

}
