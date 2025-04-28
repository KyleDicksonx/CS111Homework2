/*
 * Kyle Dickson
 * 50116781
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 */
package ParkingTicketSim;

public class ParkingTicket {
	
	//fields
	private ParkedCar car;
	private PoliceOfficer officer;
	private double fine;
	private int minutes;
	public double base_Fine = 25.0;
	public double hourly_fine = 10.0;
	
	//non default constructor, passes objects for car and officer and an int for the minutes on the meter
	public ParkingTicket(ParkedCar car, PoliceOfficer officer, int meterMinutes) {
		this.car = car;
		this.officer = officer;
		this.minutes = meterMinutes;
	}
	
	//copy constructor
	public ParkingTicket(ParkingTicket ticket) {
		this.car = ticket.car;
		this.officer = ticket.officer;
		this.minutes = ticket.minutes;
	}
	
	//calculates the fine bases on the base fine and the hourly fine
	public void calculateFine() {
		//get the time diffrence between the time the car has been parked and the purchased minutes
		int overflowTime = car.getMinutesParked() - this.minutes;
		
		//checks to see if the car has time remaining (when overflow time is 0 or negative)
		if (overflowTime < 0) {
			//if the car has time remaining there is no fine
			this.fine = 0;
		}
		else { //otherwise there must be a fine
			
			//add the base fine that gets added no matter what
			fine = fine + base_Fine;	
			
			//add an extra hourly fine for every hour except the first
			while (overflowTime > 60) {
				fine = fine + hourly_fine;
				overflowTime = overflowTime - 60;
			}
		}	
	}
	//toString method, calls toString from car and officer and returns the overflow time and the fine
	public String toString() {
		return car.toString() + "\n" + officer.toString() + "\n"
					+ "Minutes Illegaly Parked: " + (car.getMinutesParked() - this.minutes)
						+ "\nFine: " + this.fine + "\n";
	}
	
	//set and get for PakredCar object
		public void setParkedCar(ParkedCar car) {
			this.car = car;
		}
		public ParkedCar getParkedCar() {
			return this.car;
		}
	
	//set and get for PoliceOfficer object
		public void setOfficer(PoliceOfficer officer) {
			this.officer = officer;
		}
		public PoliceOfficer getOfficer() {
			return this.officer;
		}
	
	//set and get fine
		public void setFine(double fine) {
			this.fine = fine;
		}
		public double getFine() {
			return this.fine;
		}
	
	//set and get minutes
		public void setMinutes(int minutes) {
			this.minutes = minutes;
		}
		public int getMinutes() {
			return this.minutes;
		}
	
	//set and get base_fine
		public void setBase_Fine(double base_Fine) {
			this.base_Fine = base_Fine;
		}
		public double getBase_Fine() {
			return this.base_Fine;
		}
		
	//set and get hourly fine
		public void setHourly_Fine(double hourly_fine) {
			this.hourly_fine = hourly_fine;
		}
		public double getHourly_Fine() {
			return this.hourly_fine;
		}
}
