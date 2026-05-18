package com.pluralsight;

import java.io.*;
import java.util.*;

public class DealershipFileManager {

    private static final String FILE_NAME = "inventory.csv";

    public Dealership getDealership() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

            String name = br.readLine();
            String address = br.readLine();
            String phone = br.readLine();

            Dealership dealership = new Dealership(name, address, phone);

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");

                Vehicle v = new Vehicle(
                        Integer.parseInt(parts[0]),
                        Integer.parseInt(parts[1]),
                        parts[2],
                        parts[3],
                        parts[4],
                        parts[5],
                        Integer.parseInt(parts[6]),
                        Double.parseDouble(parts[7])
                );

                dealership.addVehicle(v);
            }

            br.close();
            return dealership;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void saveDealership(Dealership dealership) {
        // Leave empty for now
    }
}

