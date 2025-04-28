/*
 * Kyle Dickson
 * 50116781
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 */
package ParkingTicketSim;

//only the required imports 
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Simulation {
	
	public static void main(String[] args) throws IOException {
		
		//creates an array of type ParkedCar using the makeCarDataArray method
		ParkedCar[] car = makeCarDataArray();
		
		//creates an array of type ParkingMeter by calling the makeMeterDataArray method
		ParkingMeter[] meter = makeMeterDataArray();
		
		//creates a new PoliceOfficer object passing "Roger Coolers" as the name and "011006" as the badge number
		PoliceOfficer officer = new PoliceOfficer("Roger Coolers", "011006");
		
		//creates an array of type ParkingTicket of length 1000
		ParkingTicket[] ticket = new ParkingTicket[1000];
		
		//fields
		int legalParks = 0;	
		int illegalParks =  0;
		double totalFines = 0;
		
		//calls the patrol method from PoliceOfficer for each value of i (0-9999)
		for (int i = 0; i < 1000; i++) {
			
			//calls the patrol method from PoliceOfficer passing objects car and meter at i
			//a ticket or null is returned and assigned to ticket at position i
			ticket[i] = officer.partol(car[i], meter[i]);
			
			//checks to see if the ticket at position i is null
			if (ticket[i] == null) {
				//if ticket is null add 1 to the legal parks counter
				legalParks++;
			}
			//checks to see if the parking ticket is not equal to null
			else if (ticket[i] != null) {
				//creates a new parking ticket object and calls the constructor, passing car at i, officer, and minutes purchased on the meter
				ticket[i] = new ParkingTicket(car[i], officer, meter[i].getMinutesPurchased());
				
				//calculates the fine
				ticket[i].calculateFine();
				
				//adds the calculated fine to the total fine count
				totalFines = totalFines + ticket[i].getFine();
				
				//adds one to the illegal parks counter
				illegalParks++;
				
				//checks to see if the ticket was issues to a Toyota and if the fine was greater than 30$
				if (ticket[i].getParkedCar().getMake().equals("Toyota") && ticket[i].getFine() >= 30) {
					//calls the to string method for ticket at pos i and prints it to the console
					System.out.println(ticket[i].toString());
				}
			}
		}
		//prints the statistics for the parked cats
		System.out.println(legalParks + " vehicles were parked leglly.");
		System.out.println(illegalParks + " vehicles were parked illeglly.");
		System.out.println(totalFines + "$ in total parking ticket fines.");
	}
	
	//creates an array of type ParkedCar[] and populates it with date from the CarData.txt file
	public static ParkedCar[] makeCarDataArray() throws IOException {
		
		//opens the file CarData.txt
		File carDataFile = new File("CarData.txt");
		
		//creates a scanner obj to read CarData.txt
		Scanner carScan = new Scanner(carDataFile);
		
		//creates an array of type ParkedCar of length 1000 
		ParkedCar[] carData = new ParkedCar[1000];
		
		//reads each line and creates a new parked car object to populate
		for (int x = 0; x < 1000; x++) {
			//reads the next line of CarData.txt
			String inputLine = carScan.nextLine();
			
			//splits the line into an array based on ","
			String[] inputArray = inputLine.split(",");
			
			//creates a new ParkedCar object and passes the values
			carData[x] = new ParkedCar(inputArray[0], inputArray[1], inputArray[2], inputArray[3],Integer.parseInt(inputArray[4]));

		}	
		//closes the scanner for CarData.txt
		carScan.close();
		
		//returns the array of car data
		return carData;	
	}
	
	//creates  an array of type ParkingMeter and populates the single field
	public static ParkingMeter[] makeMeterDataArray() throws IOException {
		
		//opens the file MeterData.txt
		File meterDataFile = new File("MeterData.txt");
		
		//creates a scanner to read MeterData.txt
		Scanner meterScan = new Scanner(meterDataFile);
		
		//creates an array of type ParkingMeter of length 1000 
		ParkingMeter[] meterData = new ParkingMeter[1000];
		
		//reads each line and sends it through the ParkingMeter constructor
		for (int x = 0; x < 1000; x++) {
			//calls the constructor for the ParkingMeter object from meterData at position x 
			//and passes the next line from MeterData.txt as a parsed int
			meterData[x] = new ParkingMeter(Integer.parseInt(meterScan.nextLine()));	
		}
		//closes the scanner for MeterData.txt
		meterScan.close();
		
		//returns the meterData array of type ParkingMeter[]
		return meterData;
	}
}
