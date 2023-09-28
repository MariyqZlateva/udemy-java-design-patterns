package com.zlateva;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Meal Pattern Demo***\n");
        Director director = new Director();

        MealBurger vegMealBurger = new VegMealBurger();
        MealBurger nonVegMealBurger = new NonVegMealBurger();

        director.construct(vegMealBurger);
        Meal vegMeal = vegMealBurger.getMeal();

        // making veg meal
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: "+vegMeal.getCost());

        // making non veg meal
        director.construct(nonVegMealBurger);
        Meal nonVegMeal = nonVegMealBurger.getMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost: "+nonVegMeal.getCost());

    }
}
