package com.zlateva;

public class Client {
    public static void main(String[] args) {
        System.out.println("****Bridge pattern****");
        //coloring green to rectangle
        System.out.println("\n***Coloring Rectangle***");
        IColor green = new GreenColor();
        Shape rectangleShape = new Rectangle(green);
        rectangleShape.drawShape(20);
        rectangleShape.modifyBorder(20, 3);

        //coloring red to triangle
        System.out.println("\n\n***Coloring Triangle***");
        IColor red = new RedColor();
        Shape triangleShape = new Triangle(red);
        triangleShape.drawShape(26);
        triangleShape.modifyBorder(26, 5);
    }
}
