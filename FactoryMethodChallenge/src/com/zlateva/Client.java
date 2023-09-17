package com.zlateva;

public class Client {
    public static void main(String[] args) throws Exception {
        AnimalFactoryInterface animalFactory = new AnimalFactory();
        Animal animal1 = animalFactory.getAnimalType("DUCK");
        animal1.Speak();

        Animal animal2 = animalFactory.getAnimalType("TIGER");
        animal2.Speak();

        Animal animal3 = animalFactory.getAnimalType("LION");
        animal3.Speak();

    }
}
