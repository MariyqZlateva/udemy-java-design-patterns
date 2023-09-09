package com.zlateva;

public class Cube implements Shape, SolidShape, ManageShapeInterface{
    @Override
    public double volume() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double calculate() {
        return this.area() + this.volume();
    }
}
