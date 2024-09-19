package sep16;

//1. Write a Java program to find the largest of three given numbers using if-else statements.

public class ifElseLadder_1 {

	static void checkLarger(int m, int n, int o) {
		if (m > n && m > o) {
			System.out.println(" Given number is Greater than other  :: " + m);
		} else if (m < n && n > o) {
			System.out.println(" Given number is Greater than other  :: " + n);
		} else if (m < o && n < o) {
			System.out.println(" Given number is Greater than other  :: " + o);
		} else {
			System.out.println("Invalid Number.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[] = {420,786,100};

		int p = 420;
		int q = 420;
		int r = 420;

		checkLarger(p, q, r);

		int x = 420;
		int y = 850;
		int z = 1008;

		checkLarger(x, y, z);

	}

}
