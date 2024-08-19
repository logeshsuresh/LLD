package Factory;

import models.FourWheelerParkingSpotManager;
import models.ParkingSpotManager;
import models.TwoWheelerParkingSpotManager;
import models.VehicleType;

public class ParkingSpotManagerFactory {

    VehicleType vehicleType;

    ParkingSpotManager parkingSpotManager;

    public ParkingSpotManagerFactory(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
        if (this.vehicleType.equals(VehicleType.TWO_WHEELER)) {
            this.parkingSpotManager = new TwoWheelerParkingSpotManager();
        } else if (this.vehicleType.equals(VehicleType.FOUR_WHEELER)) {
            this.parkingSpotManager = new FourWheelerParkingSpotManager();
        }
    }

    public ParkingSpotManager getParkingSpotManager() {
        return this.parkingSpotManager;
    }

}
