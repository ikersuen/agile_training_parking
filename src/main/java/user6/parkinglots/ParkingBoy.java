package user6.parkinglots;

import java.util.List;

public class ParkingBoy {
	public ParkingLot chooseParkingLot(List<ParkingLot> parkingLotsOwned) {
		if (parkingLotsOwned.size() == 0) {
			return null;
		}
		for (ParkingLot parkingLot : parkingLotsOwned) {
			if (parkingLot.getTotalVacancy() > 0){
				return parkingLot;
			}
		}
		return null;
	}
}