/*
 * Kyle Dickson
 * 50116781
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 */

package ParkingTicketSim;

public class ParkedCar {
	
	//fields
	private String make,model,color,licensePlate;
	private int minutesParked;
	
	//non-default constructor, passes make, model, color, license plate, and minutes parked
	public ParkedCar(String make, String model, String color, String licensePlate, int minutesParked) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.licensePlate = licensePlate;
		this.minutesParked = minutesParked;
	}
	
	//copy constructor
	public ParkedCar(ParkedCar car) {
		this.make = car.make;
		this.model = car.model;
		this.color = car.color;
		this.licensePlate = car.licensePlate;
		this.minutesParked = car.minutesParked;
	}
	
	//toString method, returns all fields
	public String toString() {
		return "Make: " + this.make + "\nModel: " + this.model
				+ "\nColor: " + this.color + "\nLicense Number: " + this.licensePlate
					+ "\nMinutes Parked: " + this.minutesParked;
	}
	
	//make get and set 
		public void setMake(String make){
			this.make = make;
		}
		public String getMake() {
			return this.make;
		}
	
	//model get and set
		public void setModel(String model) {
			this.model = model;
		}
		public String getmodel() {
			return this.model;
		}
	
	//color get and set
		public void setColor(String color) {
			this.color = color;
		}
		public String getColor() {
			return this.color;
		}
	
	//license plate get and set
		public void setLicensePlate(String licensePlate) {
			this.licensePlate = licensePlate;
		}
		public String getLicensePlate() {
			return this.licensePlate;
		}
	
	//minutes parked get and set
		public void setMinutesParked(int minutesParked) {
			this.minutesParked = minutesParked;
		}
		public int getMinutesParked() {
			return this.minutesParked;
		}
}
