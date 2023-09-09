package com.zlateva;

public class Square implements Shape, ManageShapeInterface{

    @Override
    public double calculate() {
        return this.area();
    }

    @Override
    public double area() {
        return 0;
    }
}
