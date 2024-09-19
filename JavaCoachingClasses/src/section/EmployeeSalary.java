package section;

public class EmployeeSalary {

	public static void main(String[] args) {

		double basic = 45000, incentive = 7500;

		double total = basic + incentive;

		System.out.println("total salary is " + total);

		double incrementByBasic = (basic * 0.3) + basic;

		System.out.println("increment on salary by 30% on basic salary, :: new Basic " + incrementByBasic);

		double incrementByIncentive = (incentive * 0.1) + incentive;
		System.out.println("increment on salary by 10% on incentive, :: new Basic " + incrementByIncentive);

		double newSal = incrementByBasic + incrementByIncentive;

		System.out.println("Update Salary :: " + newSal);

	}

}
