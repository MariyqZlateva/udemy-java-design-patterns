package com.zlateva;

public class Client {
    public static void main(String[] args) {
        MovieFactory movieFactory = FactoryProducer.getFactory("IHOLLYWOOD");

        IHollywood hollywoodMovie1 = movieFactory.getHollyWoodMovie("COMEDY");
        hollywoodMovie1.getMovieName();

        IHollywood hollywoodMovie2 = movieFactory.getHollyWoodMovie("ACTION");
        hollywoodMovie2.getMovieName();

        MovieFactory movieFactory2 = FactoryProducer.getFactory("IBOLLYWOOD");

        IBollywood bollywoodMovie1 = movieFactory2.getBollywoodMovie("COMEDY");
        bollywoodMovie1.getMovieName();

        IBollywood bollywoodMovie2 = movieFactory2.getBollywoodMovie("ACTION");
        bollywoodMovie2.getMovieName();
    }
}