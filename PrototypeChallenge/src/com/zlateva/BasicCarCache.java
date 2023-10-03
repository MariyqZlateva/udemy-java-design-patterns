package com.zlateva;

import java.util.Hashtable;

public class BasicCarCache {

    public static Hashtable<String, BasicCar> basicCarMap = new Hashtable<>();

    public static BasicCar getCar(String name) throws CloneNotSupportedException {
        BasicCar cashedBasicCar = basicCarMap.get(name);
        return (BasicCar) cashedBasicCar.clone();
    }

    public static void loadCache(){
        BasicCar nanoBase = new Nano("Green Nano");
        nanoBase.price = 100000;
        basicCarMap.put("Green Nano", nanoBase);

        BasicCar fordBasic = new Nano("Ford Yellow");
        nanoBase.price = 100000;
        basicCarMap.put("Ford Yellow", fordBasic);
    }
}
