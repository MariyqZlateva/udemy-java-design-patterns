package com.zlateva;

public class Computer {
    displayModule dm;

    public void setDm(displayModule dm) {
        this.dm = dm;
    }

    public void display() {
        dm.display();
    }

    public static void main(String[] args) {
        Computer cm = new Computer();
        displayModule dm = new Monitor();
        displayModule dm1 = new Projector();


        cm.setDm(dm);
        cm.display();
        cm.setDm(dm1);
        cm.display();
    }
}
