package sep16;

public class loop_1 {

	public static boolean primeNum(int num) {

		if (num < 2)
			return false;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int cnt = 0;
		int num = 2;

		while (cnt < 10) {
			if (primeNum(num)) {
				System.out.print(num + " ");
				cnt++;
			}
			num++;
		}

	}

}
