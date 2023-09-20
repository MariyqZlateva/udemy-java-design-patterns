package com.zlateva;

public class FactoryProducer {
    public static MovieFactory getFactory(String typeFactory) {
        if (typeFactory.equalsIgnoreCase("IHOLLYWOOD")) {
            return new HollywoodFactory();
        } else if (typeFactory.equalsIgnoreCase("IBOLLYWOOD")) {
            return new BollywoodFactory();
        }
        return null;
    }
}
