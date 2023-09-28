package com.zlateva;

public interface MealBurger {
    void buildBurger();
    void buildDrink();

    Meal getMeal();
}

class VegMealBurger implements MealBurger{

   private Meal vegMeal = new Meal();

    @Override
    public void buildBurger() {
        vegMeal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
        vegMeal.addItem(new Coke());
    }


    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}

class NonVegMealBurger implements MealBurger{
    private Meal nonVegMeal = new Meal();

    @Override
    public void buildBurger() {
        nonVegMeal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        nonVegMeal.addItem(new Coke());
    }


    @Override
    public Meal getMeal() {
        return nonVegMeal;
    }
}