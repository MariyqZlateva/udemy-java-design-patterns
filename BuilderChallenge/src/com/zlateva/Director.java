package com.zlateva;

class Director {
    MealBurger myBuilder;

    public void construct(MealBurger burger){
        myBuilder = burger;
        myBuilder.buildBurger();;
        myBuilder.buildDrink();
    }
}
