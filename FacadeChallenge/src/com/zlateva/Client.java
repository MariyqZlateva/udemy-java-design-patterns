package com.zlateva;

public class Client {
    public static void main(String[] args) {
        HotelKeeper keeper = new HotelKeeper();
        VeganMenu v = keeper.getVegMenu();
        NonVeganMenu nv = keeper.getNonVegMenu();
        VeganAndNonVeganMenu b = keeper.getVegAndNonVegMenu();


    }
}
