package models;

public interface ParkingSpotManager {

    public void addParkingSpot(ParkingSpot parkingSpot);

    public void removeParkingSpot(ParkingSpot parkingSpot);

    public ParkingSpot findParkingSpot();

}
