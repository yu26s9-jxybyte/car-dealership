package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Dealership dealership;
    private Scanner scanner = new Scanner(System.in);

    public void display() {
        init();

        while (true) {
            System.out.println("\n===== DEALERSHIP MENU =====");
            System.out.println("1. List all vehicles");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    processAllVehiclesRequest();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private void init() {
        DealershipFileManager dfm = new DealershipFileManager();
        this.dealership = dfm.getDealership();
    }

    private void displayVehicles(ArrayList<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }

    private void processAllVehiclesRequest() {
        ArrayList<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);
    }

    // all other process methods empty for now
}
