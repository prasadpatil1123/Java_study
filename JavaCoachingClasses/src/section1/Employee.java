package section1;

public class Employee {

	static double hrPercentage = 0.35;
	static double adminPercentage = 0.15;

	void salaryGrow(int ch, double currentSal) {
		double updatedSal = 0;
		if (ch == 1) {
			updatedSal = currentSal + currentSal * hrPercentage;
		} else if (ch == 2) {
			updatedSal = currentSal + currentSal * adminPercentage;
		}
		System.out.println("Current Salary is :: " + currentSal);
		System.out.println("Updated Salary is :: " + updatedSal);
	}

}
