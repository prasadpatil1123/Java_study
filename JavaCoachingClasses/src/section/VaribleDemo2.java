package section;

public class VaribleDemo2 {

	public static void main(String[] args) {

		double basic = 4500, hra = 8000, incentive = 9500;

		double propTax = 1200, pf = 3000;

		double gross = basic + hra + incentive;

		double net = gross - pf - propTax;

		System.out.println("Gross Salary :: " + gross);
		System.out.println("Net Salary :: " + net);

	}

}
