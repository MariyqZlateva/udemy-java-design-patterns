package com.zlateva;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}


class ShapeFactory extends AbstractFactory{

    @Override
   public Shape getShape(String shapeType) {
        if (shapeType == null){
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}

class ColorFactory extends AbstractFactory{

    @Override
    Color getColor(String colorType) {
        if (colorType == null){
            return null;
        }

        if (colorType.equalsIgnoreCase("RED")){
            return new Red();
        }else if (colorType.equalsIgnoreCase("BLUE")){
            return new Blue();
        }else if (colorType.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}