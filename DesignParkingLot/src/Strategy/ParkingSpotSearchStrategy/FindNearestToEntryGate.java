package Strategy.ParkingSpotSearchStrategy;

import models.ParkingSpot;
import models.ParkingSpotManager;

public class FindNearestToEntryGate implements ParkingSpotSearchStrategy {

    ParkingSpotManager parkingSpotManager;

    public FindNearestToEntryGate(ParkingSpotManager parkingSpotManager) {
        this.parkingSpotManager = parkingSpotManager;
    }

    @Override
    public ParkingSpot findParkingSpot() {
        return this.parkingSpotManager.findParkingSpot();
    }
}
