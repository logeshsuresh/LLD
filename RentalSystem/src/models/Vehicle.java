package models;

public class Vehicle {

    public Long vehicleId;
    public String licensePlate;
    public String model;
    public VehicleStatus vehicleStatus;
    public VehicleType vehicleType;

    public Vehicle(Long vehicleId, String licensePlate, String model, VehicleType vehicleType) {
        this.vehicleId = vehicleId;
        this.licensePlate = licensePlate;
        this.model = model;
        this.vehicleStatus = VehicleStatus.ACTIVE;
        this.vehicleType = vehicleType;
    }

}
