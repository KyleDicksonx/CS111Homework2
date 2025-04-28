/*
 * Kyle Dickson
 * 50116781
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 */
package ParkingTicketSim;

public class ParkingMeter {
	private int minutesPurchased;
	
	public ParkingMeter(int minutesPurchased) {
		this.minutesPurchased = minutesPurchased;
	}
	
	public String toString() {
		return "Minutes Purchased: " + this.minutesPurchased;
	}
	
	public void setMinutesPurchased(int minutesPurchased) {
		this.minutesPurchased = minutesPurchased;
	}
	public int getMinutesPurchased() {
		return this.minutesPurchased;
	}
}
