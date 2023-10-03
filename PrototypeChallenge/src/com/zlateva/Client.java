package com.zlateva;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("***Prototype Pattern Demo****\n");

        BasicCarCache.loadCache();
        BasicCar basicCar = (BasicCar) BasicCarCache.getCar("Green Nano");

        basicCar.price = basicCar.price + BasicCar.setPrice();
        System.out.println("Car is: "+ basicCar.modelName + " and it's price is Rs."+ basicCar.price);


    }
}
