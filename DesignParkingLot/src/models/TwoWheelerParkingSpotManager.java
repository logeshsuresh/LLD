package models;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingSpotManager implements ParkingSpotManager {

    List<ParkingSpot> twoWheelerParkingSpots;

    public TwoWheelerParkingSpotManager() {
        this.twoWheelerParkingSpots = new ArrayList<>();
    }


    public TwoWheelerParkingSpotManager(List<ParkingSpot> twoWheelerParkingSpots) {
        this.twoWheelerParkingSpots = twoWheelerParkingSpots;
    }


    @Override
    public void addParkingSpot(ParkingSpot parkingSpot) {
        twoWheelerParkingSpots.add(parkingSpot);
    }

    @Override
    public void removeParkingSpot(ParkingSpot parkingSpot) {
        twoWheelerParkingSpots.remove(parkingSpot);
    }

    @Override
    public ParkingSpot findParkingSpot() {
        return this.twoWheelerParkingSpots.get(0);
    }

}
