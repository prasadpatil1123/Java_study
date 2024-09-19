package sep16;

//4. Write a Java program to find the sum of the first n natural numbers using a do-while loop.

public class loop_4 {

	public static int naturalNumber(int n) {
		return n * (n + 1) / 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1000;

		System.out.println("Sum of " + n + " Natural Number is :: " + naturalNumber(n));

	}

}
