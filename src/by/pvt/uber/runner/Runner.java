package by.pvt.uber.runner;

import by.pvt.uber.model.AverageCar;
import by.pvt.uber.model.TaxiPark;
import by.pvt.uber.model.Truck;

public class Runner {

	public static void main(String[] args) {
		TaxiPark tPark = new TaxiPark();

		AverageCar volvo = new AverageCar("Volvo");
		AverageCar toyta = new AverageCar("Toyta");
		Truck dodge = new Truck("Dodge");

		tPark.addCar(volvo);
		tPark.addCar(toyta);
		tPark.addCar(dodge);

		tPark.taxiParkInfo();
	}

}
