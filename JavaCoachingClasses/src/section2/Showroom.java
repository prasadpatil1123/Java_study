package section2;

public class Showroom {

	double base;
	double gstCar = 0.18;
	double gstBike = 0.12;
	double discPetrol = 0.05;
	double discElectric = 0.08;


	public double onRoadPrice(int vehicle, int fuel, double base) {
//		double roadPrice = 0;

//		if (vh == 1 && fl == 1) {
//			roadPrice = base + base * discPetrol - base * gstCar;
//		} else if (vh == 1 && fl == 2) {
//			roadPrice = base + base * discElectric - base * gstCar;
//		} else if (vh == 2 && fl == 1) {
//			roadPrice = base + base * discPetrol - base * gstBike;
//		} else if (vh == 2 && fl == 2) {
//			roadPrice = base + base * discElectric - base * gstBike;
//		}
		
		double roadPrice = base;
		
		
		if(fuel == 1) {
			roadPrice = base - base*discPetrol;
		}else if(fuel == 2) {
			roadPrice = base - base*discElectric;
		}
		
		if(vehicle == 1) {
			roadPrice = base + base*gstCar;
		}else if(vehicle == 2) {
			roadPrice = base + base*gstBike;
		}
		
		
		

		return roadPrice;
	}

}
