package by.pvt.uber.model;

public abstract class Car {
	private String carModel;
	private int speed;
	private int carCost;
	private int fuelConsumption;
	
	public Car(){
		
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getCarCost() {
		return carCost;
	}

	public void setCarCost(int carCost) {
		this.carCost = carCost;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

}
