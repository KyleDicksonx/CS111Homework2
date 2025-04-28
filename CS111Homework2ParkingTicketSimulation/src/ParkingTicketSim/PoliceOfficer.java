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
