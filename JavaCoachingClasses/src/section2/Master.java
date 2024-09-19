package section2;

public class Master {
	
	static int k = 20;
	int j = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Master m1 = new Master();
		Master m2 = new Master();
		System.out.println(Master.k);
		System.out.println(m1.j);
		
		Master.k =200;
		m1.j =100; 
		System.out.println(Master.k);
		System.out.println(m1.j);
		System.out.println(m2.j);
		
		
	}

}
