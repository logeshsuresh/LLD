package models;

public class ParkingSpot {

    int spotNumber;

    Vehicle vehicle;

    boolean isEmpty;

    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.vehicle = null;
        this.isEmpty = true;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    public void removeVehicle() {
        if (this.vehicle == null && this.isEmpty) {
            return;
        }
        this.vehicle = null;
        this.isEmpty = true;
    }

    public double getPrice() {
        return 100.0;
    }

}
