package com.zlateva;

public interface Item {

    String name();

    double price();

    Packing packing();
}

abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}


class VegBurger extends Burger{

    @Override
    public String name() {
        return "Veg burger";
    }

    @Override
    public double price() {
        return 6.00;
    }
}

class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken burger";
    }

    @Override
    public double price() {
        return 5.00d;
    }
}
    abstract class ColdDrink implements Item{
        @Override
        public Packing packing() {
            return new Bottle();
        }

        public abstract double price();
    }
class Coke extends ColdDrink{

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public double price() {
        return 2.55;
    }
}

    class Pepsi extends ColdDrink {

        @Override
        public String name() {
            return "Pepsi";
        }

        @Override
        public double price() {
            return 2.55;
        }
    }

