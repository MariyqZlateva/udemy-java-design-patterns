package com.zlateva;

import java.util.Random;

public abstract class BasicCar implements Cloneable {

    protected String modelName;
    protected double price;

    public double getPrice() {
        return price;
    }

    public static double setPrice() {
        double price = 0;
        Random r = new Random();
        double p = r.nextDouble(10000);
        price = p;
        return price;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public BasicCar clone() throws CloneNotSupportedException {
      return (BasicCar) super.clone();
    }
}

class Nano extends BasicCar implements Cloneable {
    public Nano(String model) {
        modelName = model;

    }

    @Override
    public Nano clone() throws CloneNotSupportedException {

        return (Nano) super.clone();
    }

}

class Ford extends BasicCar implements Cloneable {
    public Ford(String model) {
        modelName = model;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }
}