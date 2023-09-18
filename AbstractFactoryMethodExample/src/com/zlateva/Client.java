package com.zlateva;

public class Client {
    public static void main(String[] args) {
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        //get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        //get an object of Shape Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        //get an object of Shape Square
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        //get an object ot Color Red
        Color color1 = colorFactory.getColor("RED");
        color1.fill();
        //get an object ot Color Blue
        Color color2 = colorFactory.getColor("BLUE");
        color2.fill();
        //get an object ot Color Green
        Color color3 = colorFactory.getColor("GREEN");
        color3.fill();

    }
}