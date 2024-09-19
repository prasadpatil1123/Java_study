package Medical;

public class Hospital {

	String hospitalName;
	String address;
	int doctor;
	boolean isOpen;
	int ambulance;

	public Hospital() {

	}

	public Hospital(String hospitalName, String address, int doctor, boolean isOpen, int ambulance) {
		super();
		this.hospitalName = hospitalName;
		this.address = address;
		this.doctor = doctor;
		this.isOpen = isOpen;
		this.ambulance = ambulance;
	}

	String type() {
//		 System.out.println("");
		return "Private Hospital";

	}

	public String hospitalType(String hospitalName) {

		String result = hospitalName + " is " + type();
//		String sen2 = ;

		return result;
	}

	public static void main(String[] args) {

		Hospital hp = new Hospital("Jupiter", "Baner", 5, true, 3);

		System.out.println("Hospita Name ::" + hp.hospitalName);
		System.out.println("Hospita Address ::" + hp.address);
		System.out.println("Available Doctor ::" + hp.doctor);
		System.out.println("Hospita Active ::" + hp.isOpen);
		System.out.println("Ambulance van ::" + hp.ambulance);

//		hp.type();
		String x = hp.hospitalType("Jupigter");
		System.out.println(x);
		
		Hospital xyz = new Hospital();
		System.out.println(xyz.hospitalName);

	}

}
