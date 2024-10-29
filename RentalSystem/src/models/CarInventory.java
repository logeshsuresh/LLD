package models;

import java.util.List;

public class CarInventory extends  VehicleInventory {
    public List<Vehicle> cars;

    public CarInventory(List<Vehicle> cars) {
        super(cars);
    }
}
