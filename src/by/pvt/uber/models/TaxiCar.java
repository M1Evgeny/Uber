package by.pvt.uber.models;


public abstract class TaxiCar extends Car implements TaxiMeter {
	private double tax;

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double costOfTheRide(int distance) {
		return (double) (distance * tax);
	}
}
