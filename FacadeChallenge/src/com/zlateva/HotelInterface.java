package com.zlateva;

public interface HotelInterface {

    Menus getMenus();
}
class NonVegRestaurant implements HotelInterface{

    @Override
    public Menus getMenus() {
        NonVeganMenu nvm = new NonVeganMenu();
        return nvm;
    }
}

class VegRestaurant implements HotelInterface{

    @Override
    public Menus getMenus() {
        VeganMenu vm = new VeganMenu();
        return vm;
    }
}

class VegAndNonVeganRestaurant implements HotelInterface{

    @Override
    public Menus getMenus() {
        VeganAndNonVeganMenu vAndNonVegMenue = new VeganAndNonVeganMenu();
        return vAndNonVegMenue;
    }
}