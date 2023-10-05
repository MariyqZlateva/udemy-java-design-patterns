package com.zlateva;

public class Client {
    public static void main(String[] args) {
        Vehicle v1 = new Car(new Produce(), new Assemble());
        v1.manufacture();

        Vehicle v2 = new Bike(new Produce(), new Assemble());
        v2.manufacture();
    }
}
