package com.zlateva;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Adapter Pattern Demo***");

        Triangle t = new Triangle(20, 10);

        CalculatorInterface calculatorAdopter = new CalculatorAdapter(t);

        System.out.println("Area of triangle is "+ calculatorAdopter.getArea(null));
    }

}
