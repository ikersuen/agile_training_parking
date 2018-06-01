package user6.parkinglots;

public class Car
{
	public boolean park;
	public ParkingLot parkingLot;

	public ParkingLot getParkingLot() {
		return parkingLot;
	}
	public void setParkingLot(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}
	public Car() {
		park = false;
		parkingLot = null;
	}
	public void setPark(ParkingLot parkingLot) {
		park = true;
		this.parkingLot = parkingLot;
	}
	public void setPick() {
		park = false;
		parkingLot = null;
	}
	public boolean isPicked(){
	    return park == false ;
	  }
	public boolean isParked(){
	    return park;
	  }
}