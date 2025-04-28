package ParkingTicketSim;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Simulation {
	
	public static void main(String[] args) throws IOException {
		ParkedCar[] car = makeCarDataArray();
		ParkingMeter[] meter = makeMeterDataArray();
		
		PoliceOfficer officer = new PoliceOfficer("Roger Coolers", "011006");
		ParkingTicket[] ticket = new ParkingTicket[1000];
		
		@SuppressWarnings("unused")
		int legalParks = 0;	
		@SuppressWarnings("unused")
		int illegalParks =  0;
		double totalFines = 0;
		
		
		for (int i = 0; i < 1000; i++) {
			ticket[i] = officer.partol(car[i], meter[i]);
			if (ticket[i] == null) {
				legalParks++;
			}
			else if (ticket[i] != null) {
				ticket[i] = new ParkingTicket(car[i], officer, meter[i].getMinutesPurchased());
				ticket[i].calculateFine();
				totalFines = totalFines + ticket[i].getFine();
				illegalParks++;
				
				if (ticket[i].getParkedCar().getMake().equals("Toyota") && ticket[i].getFine() >= 30) {
					System.out.println(ticket[i].toString());
				}
			}
		}
		
		System.out.println(legalParks + " vehicles were parked leglly.");
		System.out.println(illegalParks + " vehicles were parked illeglly.");
		System.out.println(totalFines + "$ in total parking ticket fines.");
		
		
		
		
	}
	
	public static ParkedCar[] makeCarDataArray() throws IOException {
		File carDataFile = new File("CarData.txt");
		Scanner carScan = new Scanner(carDataFile);
		
		ParkedCar[] carData = new ParkedCar[1000];
		
		for (int x = 0; x < 1000; x++) {
			String inputLine = carScan.nextLine();
			String[] inputArray = inputLine.split(",");
			
			carData[x] = new ParkedCar(inputArray[0], inputArray[1], inputArray[2], inputArray[3],Integer.parseInt(inputArray[4]));

		}
		
		carScan.close();
		return carData;
		
		
	}
	
	public static ParkingMeter[] makeMeterDataArray() throws IOException {
		File meterDataFile = new File("MeterData.txt");
		Scanner meterScan = new Scanner(meterDataFile);
		
		ParkingMeter[] meterData = new ParkingMeter[1000];
		
		for (int x = 0; x < 1000; x++) {
			meterData[x] = new ParkingMeter(Integer.parseInt(meterScan.nextLine()));	
		}
		
		meterScan.close();
		return meterData;
	}
}
