package user6.parkinglots;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParkingLotsTest {
    @Test
    public void haveVacancySituationAndParkACar() {
    	//ParkingLot parkingLotA  = new ParkingLot(1);
        ParkingLots parkingLotsOwned = new ParkingLots();
        ParkingLot currentParkingA = new ParkingLot("parkA", 1);
        parkingLotsOwned.add(currentParkingA);
        
        Car carA = new Car();
        ParkingBoy boyA = new ParkingBoy();
        assertTrue(parkingLotsOwned.parkCar(carA, boyA));
        assertEquals(currentParkingA.getTotalVacancy(), 0);
    }
    
    @Test
    public void canPickUpParkedCar() {
    	ParkingLots parkingLotsOwned = new ParkingLots();
        parkingLotsOwned.add(new ParkingLot("parkA", 1));
        Car carA = new Car();
        carA.setPark(parkingLotsOwned.getFirstParkingLot());
        assertTrue(parkingLotsOwned.pickCar(carA));
    }
    
    @Test
    public void canNotPickUpUnparkedCar() {
    	ParkingLots parkingLotsOwned = new ParkingLots();
        parkingLotsOwned.add(new ParkingLot("parkA", 1));
        Car carA = new Car();
        carA.setPick();
        assertTrue(!parkingLotsOwned.pickCar(carA));
    }
    
    @Test
    public void haveNoVacancySituationAndParkACar() {
    	ParkingLots parkingLotsOwned = new ParkingLots();
        parkingLotsOwned.add(new ParkingLot("parkA", 0));
        Car carA = new Car();
        ParkingBoy boyA = new ParkingBoy();
        assertFalse(parkingLotsOwned.parkCar(carA, boyA));
    }
    
    @Test
    public void CompareVacancyAndSmartParkingBoyParkACar() {
    	ParkingLots parkingLotsOwned = new ParkingLots();
        parkingLotsOwned.add(new ParkingLot("parkA", 2));
        parkingLotsOwned.add(new ParkingLot("parkB", 1));
        Car carA = new Car();
        SmartParkingBoy boyA = new SmartParkingBoy();
        
        parkingLotsOwned.parkCar(carA,boyA);
        assertTrue(carA.getParkingLot().getName().equals("parkA"));
    }
    
    @Test
    public void CompareVacancyAndSuperParkingBoyParkACar() {
    	ParkingLots parkingLotsOwned = new ParkingLots();
        parkingLotsOwned.add(new ParkingLot("parkA", 2));
        parkingLotsOwned.add(new ParkingLot("parkB", 1));
        Car carA = new Car();
        SuperParkingBoy boyA = new SuperParkingBoy();
        
        parkingLotsOwned.parkCar(carA,boyA);
        assertTrue(carA.getParkingLot().getName().equals("parkA"));
    }
    
}