package section;

import java.util.Scanner;

public class ScannerDemo6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Database marks :: ");
		int n1 = sc.nextInt();
		System.out.println("Enter DSA marks :: ");
		int n2 = sc.nextInt();
		System.out.println("Enter Math marks :: ");
		int n3 = sc.nextInt();
		System.out.println("Enter IT marks :: ");
		int n4 = sc.nextInt();
		System.out.println("Enter Computer Science marks :: ");
		int n5 = sc.nextInt();

		totalMarks(n1, n2, n3, n4, n5);
		sc.close();

	}

	private static void totalMarks(int o, int p, int q, int r, int s) {
		// TODO Auto-generated method stub
		int total = o + p + q + r + s;

		System.out.println("Total Marks ::" + total);
		System.out.println();
		double per = total / 5;
		System.out.println("Percentage ::" + per);
		grade(per);

	}

	private static void grade(double per) {

		if (per > 80) {
			System.out.println("Grade :: A");
		} else if (per > 70) {
			System.out.println("Grade :: B");
		} else if (per > 60) {
			System.out.println("Grade :: C");
		} else if (per > 40 && per < 60) {
			System.out.println("Grade :: D");
		} else {
			System.out.println("Grade :: E & Failed");
		}
	}

}
