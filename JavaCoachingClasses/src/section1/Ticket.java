package section1;

public class Ticket {

	int ticketCost = 120;
	double gst = 0.18;
	int availableTicket = 20;

	void ticketBooking(int ticketCount) {

		if (ticketCount <= 0) {
			System.out.println("Invalid Input");
			return;
		}

		if (ticketCount <= availableTicket) {

			int ticketAmt = ticketCount * ticketCost;
			double finalAmt = ticketAmt + ticketAmt * gst;

			System.out.println("Tickets Booked Succesfully.");
			System.out.println("Your Final Amount is " + finalAmt);

			availableTicket -= ticketCount;
//			return availableTicket;
			ticketChecking();

		} else {
			System.out.println("Tickets are not available.");
		}
	}

	void ticketCanceling(int count) {
		if (count <= 0) {
			System.out.println("Invalid Input");
			return;
		}
		availableTicket += count;
		System.out.println(count + " Ticket Canceled succesfully");

	}

	void ticketChecking() {
		System.out.println("Available Tickets numbers are :: " + availableTicket);
	}

}
