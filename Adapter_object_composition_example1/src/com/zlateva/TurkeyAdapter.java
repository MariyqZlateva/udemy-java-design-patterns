package com.zlateva;

public class TurkeyAdapter implements Duck{
    Turkey turkey; // this is the type we are gone adapt to

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }


    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
