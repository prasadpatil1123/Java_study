package sep16;

//3. Print the numbers from 1 to 100 that are divisible by 3 or 5 using a for loop.

public class loop_3 {

	public static void check() {

		System.out.println("Number of List divided by 3 :: ");
		System.out.println(" [ ");
		for (int i = 3; i < 100; i++) {

			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println(" ]");
		System.out.println("======================================");
		System.out.println("Number of List divided by 5 :: ");
		System.out.println(" [ ");
		for (int i = 3; i < 100; i++) {

			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println(" ]");
	}

	public static void main(String[] args) {

		check();
	}

}
