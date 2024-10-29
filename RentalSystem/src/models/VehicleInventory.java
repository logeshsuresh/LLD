package models;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventory {

    public Long vehicleInventoryId;
    public List<Vehicle> vehicles;

    public VehicleInventory() {
        vehicles = new ArrayList<>();
    }

    public VehicleInventory(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
       vehicles.remove(vehicle);
    }
}
