package com.zlateva;

public abstract class MovieFactory {
    abstract IHollywood getHollyWoodMovie(String type);
    abstract IBollywood getBollywoodMovie(String type);
}

class HollywoodFactory extends MovieFactory {

    @Override
    IHollywood getHollyWoodMovie(String type) {
        if (type.equalsIgnoreCase("ACTION")) {
            return new HollywoodAction();
        } else if (type.equalsIgnoreCase("COMEDY")) {
            return new HollywoodComedy();
        }
        return null;
    }

    @Override
    IBollywood getBollywoodMovie(String type) {
        return null;
    }
}

class BollywoodFactory extends MovieFactory {


    @Override
    IBollywood getBollywoodMovie(String type) {
        if (type.equalsIgnoreCase("ACTION")) {
            return new BollywoodAction();
        } else if (type.equalsIgnoreCase("COMEDY")) {
            return new BollywoodComedy();
        }
        return null;
    }

    @Override
    IHollywood getHollyWoodMovie(String type) {
        return null;
    }


}