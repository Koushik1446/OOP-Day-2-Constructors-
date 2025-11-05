package com.codegnan.oopexamples;

 public class Parking {
    private String type;
    private String licensePlate;
    private int hoursParked;

    public Parking(String type, String licensePlate, int hoursParked) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Error: Type cannot be empty");
        }
        if (licensePlate == null || licensePlate.isEmpty()) {
            throw new IllegalArgumentException("Error: License plate cannot be empty");
        }
        if (hoursParked < 0) {
            throw new IllegalArgumentException("Error: Hours parked must be non-negative");
        }
        this.type = type;
        this.licensePlate = licensePlate;
        this.hoursParked = hoursParked;
    }

    public void displayVehicle() {
        System.out.println("Type: " + type + ", License: " + licensePlate + ", Hours Parked: " + hoursParked);
    }
}