package models;

public class FourWheelerParkingSpot extends ParkingSpot {

    public FourWheelerParkingSpot(int spotNumber) {
        super(spotNumber);
    }

    public double getPrice() {
        return 120.0;
    }

}
