/*
 * Kyle Dickson
 * 50116781
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 */
package ParkingTicketSim;

public class ParkingMeter {
	
	//fields
	private int minutesPurchased;
	
	//non-default constructor, passes integer minutes purchased
	public ParkingMeter(int minutesPurchased) {
		this.minutesPurchased = minutesPurchased;
	}
	
	//to string method, returns all 1 fields
		public String toString() {
			return "Minutes Purchased: " + this.minutesPurchased;
		}
	
	//minutes purchased get and set
		public void setMinutesPurchased(int minutesPurchased) {
			this.minutesPurchased = minutesPurchased;
		}
		public int getMinutesPurchased() {
			return this.minutesPurchased;
		}
	}
