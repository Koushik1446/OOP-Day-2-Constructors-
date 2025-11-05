package com.codegnan.oopexamples;
public class ParkingTest {
    public static void main(String[] args) {
        try {
            new Parking("Car", "ABC123", 4).displayVehicle();
            new Parking("Scooty", "XYZ789", 3).displayVehicle();
            new Parking("Truck", "LMN456", -1).displayVehicle(); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            new Parking("Van", "PQR101", 5).displayVehicle();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


