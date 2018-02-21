package by.pvt.uber.model;

import java.util.Random;

public class AverageCar extends TaxiCar {
	public AverageCar(String carModel) {
		setCarModel(carModel);
		setSpeed(setRandomSpeed());
		setCarCost(9_000);
		setFuelConsumption(setRandomFuelConsumption());
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

	public void driverTellsJoke() {
		System.out.println("Sorry");
	}

	private int setRandomSpeed() {
		Random rd = new Random();
		return rd.nextInt(70);
	}

	private int setRandomFuelConsumption() {
		Random rd = new Random();
		return rd.nextInt(10);
	}
}
