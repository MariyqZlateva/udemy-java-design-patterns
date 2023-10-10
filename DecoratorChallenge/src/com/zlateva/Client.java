package com.zlateva;

public class Client {
    public static void main(String[] args) {
        System.out.println("DECORATOR PATTERN CHALLENGE");


        System.out.println("--------------------------");
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();



    }
}
