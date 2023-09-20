package com.zlateva;

public interface IHollywood {
    void getMovieName();
}

class HollywoodAction implements IHollywood {

    @Override
    public void getMovieName() {
        System.out.println("HollyWood action movie");
    }
}

class HollywoodComedy implements IHollywood {

    @Override
    public void getMovieName() {
        System.out.println("HollyWood comedy movie");
    }
}
