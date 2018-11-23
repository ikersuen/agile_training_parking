package user6.parkinglots;

import java.util.ArrayList;
import java.util.List;

public class ParkingLots{
	List<ParkingLot> parkingLotsOwned;
	public ParkingLots(){
		this.parkingLotsOwned = new ArrayList<ParkingLot>();
	}
  public void add(ParkingLot parkingLot) {
	  parkingLotsOwned.add(parkingLot);
  }
  public List<ParkingLot> get() {
	  return parkingLotsOwned;
  }
  public ParkingLot getFirstParkingLot() {
	  return parkingLotsOwned.get(0);
  }
  
  public boolean parkCar(Car aCar, ParkingBoy aBoy){
	  ParkingLot choseParkingLot = aBoy.chooseParkingLot(parkingLotsOwned);
	  if (choseParkingLot == null) {
		  return false;
	  }
	  return choseParkingLot.parkCar(aCar);
  }
  
  public boolean pickCar(Car aCar){
	  if (aCar.getParkingLot() == null) {
		  return false;
	  }
	  return aCar.getParkingLot().pickCar(aCar);
  }
}