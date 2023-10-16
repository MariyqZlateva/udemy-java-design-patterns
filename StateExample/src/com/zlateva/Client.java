package com.zlateva;

public class Client {

    public static void main(String[] args) {
        System.out.println("***STATE PATTERN DEMO****\n");

        //initially TV is Off
        Off initialState = new Off();
        TV tv = new TV(initialState);

        //first time press
        tv.pressButton();
        //second time press
        tv.pressButton();
    }
}
