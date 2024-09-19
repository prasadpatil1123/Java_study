package methodChaining;

public class Chain {

	public static void main(String[] args) {

		first();

	}

	public static String first() {
		System.out.println("I am first method");
		second();
		return "Hello There !!!";
	}

	public static String second() {
		System.out.println("I am second method");
		third();
		return "Next !!!";
	}

	public static String third() {
		System.out.println("I am Third method");
		fourth();
		return "Next Next !!!";
	}

	public static String fourth() {
		System.out.println("I am Fourth method");
		end();
		return " After Next !!!";
	}

	public static String end() {
		System.out.println("I am Last method");
		return "End !!!";
	}

}
