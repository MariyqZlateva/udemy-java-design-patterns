package com.zlateva;

public class HotelKeeper {
    public VeganMenu getVegMenu(){
        VegRestaurant vegRestaurant = new VegRestaurant();
        VeganMenu veganMenu =(VeganMenu) vegRestaurant.getMenus();
        return veganMenu;
    }

    public NonVeganMenu getNonVegMenu(){
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        NonVeganMenu nonVeganMenu =(NonVeganMenu) nonVegRestaurant.getMenus();
        return nonVeganMenu;
    }
    public VeganAndNonVeganMenu getVegAndNonVegMenu(){
        VegAndNonVeganRestaurant vegAndNonVeganRestaurant = new VegAndNonVeganRestaurant();
        VeganAndNonVeganMenu veganAndNonVeganMenu =(VeganAndNonVeganMenu) vegAndNonVeganRestaurant.getMenus();
        return veganAndNonVeganMenu;
    }
}
