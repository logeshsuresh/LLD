package models;

import java.util.Date;

public class Ticket {

    private Vehicle vehicle;

    private Date entryTime;

    private ParkingSpot parkingSpot;

    public Ticket(Vehicle vehicle, Date entryTime, ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
    }

    public void setVehicle(Vehicle newVehicle) {
        this.vehicle = newVehicle;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public void setEntryTime(Date newEntryTime) {
        this.entryTime = newEntryTime;
    }

    public Date getEntryTime() {
        return this.entryTime;
    }

}
