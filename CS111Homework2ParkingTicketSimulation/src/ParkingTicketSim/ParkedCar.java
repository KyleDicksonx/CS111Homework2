package ParkingTicketSim;

public class ParkedCar {
	private String make,model,color,licensePlate;
	private int minutesParked;
	
	public ParkedCar(String make, String model, String color, String licensePlate, int minutesParked) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.licensePlate = licensePlate;
		this.minutesParked = minutesParked;
	}
	
	public ParkedCar(ParkedCar car) {
		this.make = car.make;
		this.model = car.model;
		this.color = car.color;
		this.licensePlate = car.licensePlate;
		this.minutesParked = car.minutesParked;
	}
	
	public String toString() {
		return "Make: " + this.make + "\nModel: " + this.model
				+ "\nColor: " + this.color + "\nLicense Number: " + this.licensePlate
					+ "\nMinutes Parked: " + this.minutesParked;
	}
	
	public void setMake(String make){
		this.make = make;
	}
	public String getMake() {
		return this.make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public String getmodel() {
		return this.model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public String getLicensePlate() {
		return this.licensePlate;
	}
	
	public void setMinutesParked(int minutesParked) {
		this.minutesParked = minutesParked;
	}
	public int getMinutesParked() {
		return this.minutesParked;
	}
}
