package section1;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ticket tt = new Ticket();
		while (true) {
			System.out.println();
			System.out.println("Select Option ::  ");

			System.out.println("1. Ticket Booking");
			System.out.println("2. Ticket Canceling");
			System.out.println("3. Ticket Checking");
			System.out.println("4. Exit");

			int num = sc.nextInt();

			if (num == 1) {
				System.out.println("Enter number of tickets you want to book :: ");
				int count = sc.nextInt();
				tt.ticketBooking(count);
			} else if (num == 2) {
				System.out.println("Enter number of tickets you want to cancel:: ");
				int count1 = sc.nextInt();
				tt.ticketCanceling(count1);
			} else if (num == 3) {
				tt.ticketChecking();
			} else {
				System.out.println("Invalid Number");
				break;
			}
//		break;
		}
		sc.close();

	}

}
