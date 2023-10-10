package com.zlateva;

public interface Menus {
    void showMenu();
}

class NonVeganMenu implements Menus{
    public NonVeganMenu() {
        System.out.println("Creating a non-vegan menu");
    }

    @Override
    public void showMenu() {
        System.out.println("Menu items in non-vegan menu");
    }
}

class VeganMenu implements Menus{
    public VeganMenu() {
        System.out.println("Creating a vegan menu");
    }
    @Override
    public void showMenu() {
        System.out.println("Menu items in vegan menu");
    }
}

class VeganAndNonVeganMenu implements Menus{
    public VeganAndNonVeganMenu() {
        System.out.println("Creating a vegan and non-vegan menu");
    }
    @Override
    public void showMenu() {
        System.out.println("Menu items in vegan and non-vegan menu");
    }
}