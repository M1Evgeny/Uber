package by.pvt.uber.model;

import java.util.Random;

public class Truck extends TaxiCar {

	private int cargoHold;
	private int curentCargo = 0;

	public Truck(String carModel) {

		setCarModel(carModel);
		setSpeed(setRandomSpeed());
		setCarCost(9_000);
		setFuelConsumption(setRandomFuelConsumption());
		setTax(0.6);
		cargoHold = setRandomCargoHold();
	}

	public int getCargoHold() {
		return cargoHold;
	}

	public void loadCargo(int weigth) {
		if (curentCargo < cargoHold) {
			if (cargoHold == (curentCargo + weigth)) {
				curentCargo += weigth;
			} else {
				System.out
						.println("Weigth is too heavy. The car is almostt full");
			}
		} else {
			System.out.println("The car is full");
		}
	}

	public void unloadCargo() {
		curentCargo = 0;
	}

	@Override
	public double costOfTheRide(int distance) {
		double cost = 0;
		if (distance >= 10) {
			setTax(0.5);
			cost = (double) (distance * getTax());
		}
		setTax(0.6);
		return cost;
	}

	private int setRandomSpeed() {
		Random rd = new Random();
		return rd.nextInt(50);
	}

	private int setRandomFuelConsumption() {
		Random rd = new Random();
		return rd.nextInt(15);
	}

	private int setRandomCargoHold() {
		Random rd = new Random();
		return rd.nextInt(200);
	}
}
