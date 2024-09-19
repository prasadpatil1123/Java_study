package methodRecurssion;

public class CallMethod {
	public static void main(String[] args) {

		question();

	}

	private static void question() {

		System.out.println("I am Question");

		answer();

	}

	private static void answer() {

		System.out.println("I am an Answer");
		
		question();
	}
}
