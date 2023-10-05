package com.zlateva;

public abstract class Shape {
   protected IColor color1;

    protected Shape(IColor color1) {
        this.color1 = color1;

    }

    public abstract void drawShape(int border);
    public abstract void modifyBorder(int border, int increment);
}

class Triangle extends Shape {

    public Triangle(IColor color1) {
        super(color1);
    }

    // this is Implementer-specific method
    @Override
    public void drawShape(int border) {
        System.out.println("This triangle is colored with ");
        color1.fillWithColor(border);
    }

    // abstraction-specific method
    @Override
    public void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are changing the border length "+ increment+ " times");
        border = border * increment;
        drawShape(border);

    }
}

class Rectangle extends Shape {

    public Rectangle(IColor color1) {
        super(color1);
    }

    @Override
    public void drawShape(int border) {
        System.out.println("This rectangle is colored with ");
        color1.fillWithColor(border);
    }

    @Override
    public void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are changing the border length "+ increment+ " times");
        border = border * increment;
        drawShape(border);
    }

}