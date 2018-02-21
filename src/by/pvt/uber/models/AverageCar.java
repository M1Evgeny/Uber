package by.pvt.uber.models;

import java.util.Random;

public class AverageCar extends TaxiCar {
	public AverageCar(String carModel) {
		Random rd = new Random();
		setCarModel(carModel);
		setSpeed(rd.nextInt(70));
		setCarCost(9_000);
		setFuelConsumption(10);
		setTax(0.4);
	}

	@Override
	public double costOfTheRide(int distance) {
		double cost = 0;
		if (distance >= 10) {
			setTax(0.3);
			cost = (double) (distance * getTax());
		}
		setTax(0.4);
		return cost;
	}

}
