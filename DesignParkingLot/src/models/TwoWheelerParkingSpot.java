package models;

public class TwoWheelerParkingSpot extends ParkingSpot {
    public TwoWheelerParkingSpot(int spotNumber) {
        super(spotNumber);
    }

    @Override
    public double getPrice() {
        return 75.0;
    }

}