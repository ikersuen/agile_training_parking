package user6.parkinglots;

public class ParkingLot {
	public int totalParkingSpaces;
	public int getTotalParkingSpaces() {
		return totalParkingSpaces;
	}

	public void setTotalParkingSpaces(int totalParkingSpaces) {
		this.totalParkingSpaces = totalParkingSpaces;
	}

	public int totalVacancy;
	public String name;

	public int getTotalVacancy() {
		return totalVacancy;
	}

	public void setTotalVacancy(int totalVacancy) {
		this.totalVacancy = totalVacancy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ParkingLot(String name, int totalParkingSpaces) {
		this.name = name;
		this.totalParkingSpaces = totalParkingSpaces;
		this.totalVacancy = totalParkingSpaces;
	}

	public boolean haveVacancy() {
		if (totalVacancy != 0) {
			return true;
		}
		return false;
	}

	public boolean parkCar(Car aCar) {
		if (haveVacancy() && aCar.isPicked()) {
			aCar.setPark(this);
			totalVacancy--;
			return true;
		}
		return false;
	}

	public boolean pickCar(Car aCar) {
		if (aCar.isParked()) {
			aCar.setPick();
			totalVacancy++;
			return true;
		}
		return false;
	}
}