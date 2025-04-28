/*
 * Kyle Dickson
 * 50116781
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 */
package ParkingTicketSim;

public class PoliceOfficer {
	private String name,badgeNumber;
	
	public PoliceOfficer(String name, String badgeNumber) {
		this.name = name;
		this.badgeNumber = badgeNumber;
	}
	
	public PoliceOfficer(PoliceOfficer officer) {
		this.name = officer.name;
		this.badgeNumber = officer.badgeNumber;
	}
	
	public ParkingTicket partol(ParkedCar car, ParkingMeter meter) {
		if(car.getMinutesParked() > meter.getMinutesPurchased()) {
			ParkingTicket pt = new  ParkingTicket(car, this, meter.getMinutesPurchased());
			return pt;
		}
		else {
			return null;
		}
	}
	
	public String toString() {
		return "Officer Data:\nName: " + this.name + "\nBadge Number: " + this.badgeNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setBadgeNumber(String badgeNumber) {
		this.badgeNumber = badgeNumber;
	}
	public String getbadgeNumber() {
		return this.badgeNumber;
	}
}
