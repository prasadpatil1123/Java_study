package calculator;

public class MainCalculator {

	public static void main(String[] args) {
//		int a = 12;
//		int b = 2;
		double a = 12.2;
		double b = 2.4;

		Calculator cal = new Calculator();

		System.out.println("addition :: " + cal.addition(a, b));

		System.out.println("substraction :: " + cal.substraction(a, b));

		System.out.println("multiplication :: " + cal.multiplication(a, b));

		System.out.println("division :: " + cal.division(a, b));
	}

}
