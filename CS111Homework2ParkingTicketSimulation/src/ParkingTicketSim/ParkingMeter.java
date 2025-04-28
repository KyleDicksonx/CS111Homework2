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
