package by.pvt.uber.model;

import java.util.Arrays;
import java.util.Comparator;

public class TaxiPark {

	private TaxiCar[] carPark;
	private int taxiCount = 0;

	public void setCarPark(TaxiCar[] carPark) {
		this.carPark = carPark;
	}

	public TaxiCar[] getCarPark() {
		return carPark;
	}

	public void addCar(TaxiCar car) {
		if (carPark != null) {
			if (taxiCount < carPark.length) {
				addOneCar(car);
			} else {
				newTaxiArray();
				addOneCar(car);
			}
		} else {
			carPark = new TaxiCar[10];
			addOneCar(car);
		}
	}

	private void addOneCar(TaxiCar car) {
		carPark[taxiCount] = car;
		taxiCount++;
	}

	private void newTaxiArray() {
		TaxiCar[] carPark = new TaxiCar[taxiCount + 5];
		for (int i = 0; i < this.carPark.length - 1; i++) {
			carPark[i] = this.carPark[i];
		}
	}

	public void sortCarsByFuelConsumption() {
		Arrays.sort(carPark, new Comparator<TaxiCar>() {
			@Override
			public int compare(TaxiCar c1, TaxiCar c2) {
				int result = 0;
				if (c1 != null & c2 != null) {
					result = c1.getFuelConsumption() - c2.getFuelConsumption();
				}
				return result;
			}
		});
	}

	public void taxiParkInfo() {
		if (carPark != null) {
			for (TaxiCar car : carPark) {
				if (car != null) {
					System.out.println("Car madel: " + car.getCarModel());
					System.out.println("Car speed: " + car.getSpeed());
					System.out.println("Fuel consumation: "
							+ car.getFuelConsumption());
					System.out.println("Tax: " + car.getTax());
				}
			}
		}
	}
}
