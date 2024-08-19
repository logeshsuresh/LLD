package models;

import Factory.ParkingSpotManagerFactory;

import java.util.Date;

public class EntryGate {

    int gateNumber;

    Vehicle vehicle;

    Ticket ticket;

    ParkingSpotManager parkingSpotManager;

    public EntryGate(int gateNumber) {
        this.gateNumber = gateNumber;
        this.parkingSpotManager = new ParkingSpotManagerFactory(vehicle.getVehicleType()).getParkingSpotManager();
    }

    public void generateTicket() {
        ParkingSpot parkingSpot = this.parkingSpotManager.findParkingSpot();
        parkingSpot.parkVehicle(vehicle);
        this.ticket = new Ticket(vehicle, new Date(), parkingSpot);
    }

}
