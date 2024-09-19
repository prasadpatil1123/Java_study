package section2;

//import java.util.Scanner;

public class MyApp3 {

	public static void main(String[] args) {

		Meter m1 = new Meter();

		m1.calculateReading(100);

		System.out.println("Main Reading ::" + Meter.mainReading);
		System.out.println("Trip Reading ::" + m1.tripReading);
		
		Meter m2 = m1;
		m2.calculateReading(300);
		System.out.println("Main Reading ::" + Meter.mainReading);
		System.out.println("Trip Reading ::" + m2.tripReading);
	}

}
