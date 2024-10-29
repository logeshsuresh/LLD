package models;

public class Location {

    String address;
    String pincode;

    public Location(String address, String pincode) {
        this.address = address;
        this.pincode = pincode;
    }

    public String toString() {
        return address + " " + pincode;
    }

}
