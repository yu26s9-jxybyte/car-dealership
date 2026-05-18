package com.pluralsight;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;
    }

    // empty for now
    public void removeVehicle(int vin) {}

    // all search methods return null for now
    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) { return null; }
    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) { return null; }
    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) { return null; }
    public ArrayList<Vehicle> getVehiclesByColor(String color) { return null; }
    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) { return null; }
    public ArrayList<Vehicle> getVehiclesByType(String type) { return null; }

    // getters/setters for name, address, phone
}
