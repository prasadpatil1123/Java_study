package sep23;

public class Demo1 {
	public static void main(String[] args) {

		int[] input = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };

		System.out.print("Input : [ ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + "\t");
		}
		System.out.print("]");

		System.out.print("\n");

		System.out.print("Output : [ ");
		for (int i = 0; i < input.length; i++) {

			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					System.out.print(input[j] + "\t");
				}
			}
		}
		System.out.print("]");

	}
}
