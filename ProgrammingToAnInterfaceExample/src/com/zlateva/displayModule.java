package com.zlateva;

public interface displayModule {
    void display();
}
class Monitor implements displayModule{

    @Override
    public void display() {
        System.out.println("Display through Monitor");
    }
}

class Projector implements displayModule{

    @Override
    public void display() {
        System.out.println("Display through Projector");
    }
}

