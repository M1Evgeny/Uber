package by.pvt.uber.model;


public abstract class TaxiCar extends Car implements TaxiMeter {
	private double tax;
	
	public TaxiCar(){
		
	}

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
