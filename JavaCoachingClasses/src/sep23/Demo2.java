package sep23;

public class Demo2 {

	public static boolean checkSub(String l1, String l2) {

		for (int i = 0; i < l1.length(); i++) {
//			System.out.print(line1.charAt(i) + "\t");
			for (int j = i + 1; j < l2.length(); j++) {
				if (l1.charAt(i) == l2.charAt(i)) {
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {

//		 string1 = "abcde", string2 = "ace"
//		Write a Java program to check if a given string is a subsequence of another string.

		String line1 = "abcde";
		String line2 = "ace";

//		for (int i = 0; i < line1.length(); i++) {
//			System.out.print(line1.charAt(i) + "\t");
//		}

		checkSub(line1, line2);

	}
}
