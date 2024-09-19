package section1;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		ElectronicShop shop = new ElectronicShop();
		System.out.println("Enter Salary ");
		int current = sc.nextInt();
		System.out.println("1.HR ----------------- 2.ADMIN");
		int type = sc.nextInt();

		Employee emp = new Employee();
		emp.salaryGrow(type, current);
		sc.close();
	}

}
