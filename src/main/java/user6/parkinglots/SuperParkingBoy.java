package user6.parkinglots;

import java.util.List;

public class SuperParkingBoy extends ParkingBoy{
	public ParkingLot chooseParkingLot(List<ParkingLot> parkingLotsOwned) {
		if (parkingLotsOwned.size() == 0) {
			  return null;
		  }
		  ParkingLot chosenParkingLot = parkingLotsOwned.get(0);
		  for(ParkingLot parkingLot: parkingLotsOwned) {
			  if (parkingLot.getTotalVacancy()/parkingLot.getTotalParkingSpaces() > chosenParkingLot.getTotalVacancy()/chosenParkingLot.getTotalParkingSpaces()) {
				  chosenParkingLot = parkingLot;
			  }
		  }
		  return chosenParkingLot;
	}
}