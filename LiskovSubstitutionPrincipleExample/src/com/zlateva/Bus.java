package com.zlateva;

public class Bus extends Vehicle {
    int getSpeed() {
        return 0;
    }

    int getCubicCapacity() {
        return 0;
    }

    String getEmergencyExitLoc() {
        return " ";
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        vehicle.getSpeed();
        vehicle = new Car();
        vehicle.getCubicCapacity();
    }
}
