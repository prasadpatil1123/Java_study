package multiThreading;

public class MultiThredingDemo2 implements Runnable {

	public void run() {
		try {

			System.out.println("Thread " + Thread.currentThread().getId() + " is Running");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
