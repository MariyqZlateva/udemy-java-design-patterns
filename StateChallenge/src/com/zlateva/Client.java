package com.zlateva;

public class Client {
    public static void main(String[] args) {
        //initially Phone is vibration mode
        Phone p = new Phone();
        p.alert();
        p.alert();
        p.alert();
        p.setState(new Silent());
        p.alert();
        p.alert();

    }
}
