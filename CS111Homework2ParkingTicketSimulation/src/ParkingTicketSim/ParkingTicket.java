package ParkingTicketSim;

public class ParkingTicket {
	private ParkedCar car;
	private PoliceOfficer officer;
	private double fine;
	private int minutes;
	public double base_Fine = 25.0;
	public double hourly_fine = 10.0;
	
	public ParkingTicket(ParkedCar car, PoliceOfficer officer, int meterMinutes) {
		this.car = car;
		this.officer = officer;
		this.minutes = meterMinutes;
	}
	
	public ParkingTicket(ParkingTicket ticket) {
		this.car = ticket.car;
		this.officer = ticket.officer;
		this.minutes = ticket.minutes;
	}
	
	public void calculateFine() {
		int overflowTime = car.getMinutesParked() - this.minutes;
		
		if (overflowTime < 0) {
			this.fine = 0;
		}
		else {
			fine = fine + 25;	
			while (overflowTime > 60) {
				fine = fine + 10;
				overflowTime = overflowTime - 60;
			}
		}	
	}
	
	public void setParkedCar(ParkedCar car) {
		this.car = car;
	}
	public ParkedCar getParkedCar() {
		return this.car;
	}
	
	public void setOfficer(PoliceOfficer officer) {
		this.officer = officer;
	}
	public PoliceOfficer getOfficer() {
		return this.officer;
	}
	
	public void setFine(double fine) {
		this.fine = fine;
	}
	public double getFine() {
		return this.fine;
	}
	
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getMinutes() {
		return this.minutes;
	}
	
	public void setBase_Fine(double base_Fine) {
		this.base_Fine = base_Fine;
	}
	public double getBase_Fine() {
		return this.base_Fine;
	}
	
	public void setHourly_Fine(double hourly_fine) {
		this.hourly_fine = hourly_fine;
	}
	public double getHourly_Fine() {
		return this.hourly_fine;
	}
}
