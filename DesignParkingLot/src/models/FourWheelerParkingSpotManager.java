package models;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerParkingSpotManager implements  ParkingSpotManager {

    List<ParkingSpot> fourWheelerParkingSpots;

    public FourWheelerParkingSpotManager() {
        this.fourWheelerParkingSpots = new ArrayList<>();
    }

    public FourWheelerParkingSpotManager(List<ParkingSpot> fourWheelerParkingSpots) {
        this.fourWheelerParkingSpots = fourWheelerParkingSpots;
    }

    @Override
    public void addParkingSpot(ParkingSpot parkingSpot) {
        this.fourWheelerParkingSpots.add(parkingSpot);
    }

    @Override
    public void removeParkingSpot(ParkingSpot parkingSpot) {
        this.fourWheelerParkingSpots.remove(parkingSpot);
    }

    @Override
    public ParkingSpot findParkingSpot() {
        return this.fourWheelerParkingSpots.get(0);
    }
}
