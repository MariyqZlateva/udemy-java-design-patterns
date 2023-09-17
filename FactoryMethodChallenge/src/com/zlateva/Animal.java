package com.zlateva;

public interface Animal {
    void Speak();
}

class Duck implements Animal {

    @Override
    public void Speak() {
        System.out.println("Duck says Pack - Pack ");
    }
}

class Tiger implements Animal {
    @Override
    public void Speak() {
        System.out.println("Tiger says Halum - Halum");
    }
}