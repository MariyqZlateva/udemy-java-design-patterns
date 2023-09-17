package com.zlateva;

class AnimalFactory extends AnimalFactoryInterface {
    @Override
    public Animal getAnimalType(String animalType) throws Exception {
        if (animalType == null) {
            return null;
        } else if (animalType.equalsIgnoreCase("DUCK")) {
            return new Duck();
        } else if (animalType.equalsIgnoreCase("TIGER")) {
            return new Tiger();
        }
        throw new Exception("Animal type " + animalType + " can't be instantiated");
    }
}
