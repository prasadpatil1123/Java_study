package section2;

public class Meter {

	static int mainReading = 0;
	int tripReading = 0;

	int calculateReading(int reading) {

		mainReading = mainReading + reading;

		tripReading = reading;

		return mainReading;
	}

}
