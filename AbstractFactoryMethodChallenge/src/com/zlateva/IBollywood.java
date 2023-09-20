package com.zlateva;

public interface IBollywood {
    void getMovieName();
}

class BollywoodAction implements IBollywood {

    @Override
    public void getMovieName() {
        System.out.println("Bollywood action movie");
    }
}

class BollywoodComedy implements IBollywood {

    @Override
    public void getMovieName() {
        System.out.println("Bollywood comedy movie");
    }
}
