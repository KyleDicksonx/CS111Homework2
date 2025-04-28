/*
 * Kyle Dickson
 * 50116781
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 */
package ParkingTicketSim;

public class PoliceOfficer {
	
	//fields
	private String name,badgeNumber;
	
	//non-default constructor, passes values for name and badge number
	public PoliceOfficer(String name, String badgeNumber) {
		this.name = name;
		this.badgeNumber = badgeNumber;
	}
	
	//copy constructor
	public PoliceOfficer(PoliceOfficer officer) {
		this.name = officer.name;
		this.badgeNumber = officer.badgeNumber;
	}
	
	//patrol method, checks to see if a parked car has exceded its purchased time and returns a ticket if it does
	public ParkingTicket partol(ParkedCar car, ParkingMeter meter) {
		
		//if the time the car has been parked is greater than the purchased time check
		if(car.getMinutesParked() > meter.getMinutesPurchased()) {
			//creates a new parking ticket with the data for the car, officer, and the minutes purchased
			ParkingTicket pt = new  ParkingTicket(car, this, meter.getMinutesPurchased());
			return pt;
		}
		else {
			return null;
		}
	}
	
	//toString method, returns all fields
		public String toString() {
			return "Officer Data:\nName: " + this.name + "\nBadge Number: " + this.badgeNumber;
		}
	
	//get and set name
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return this.name;
		}
	
	//get and set badge number
		public void setBadgeNumber(String badgeNumber) {
			this.badgeNumber = badgeNumber;
		}
		public String getbadgeNumber() {
			return this.badgeNumber;
		}
}
