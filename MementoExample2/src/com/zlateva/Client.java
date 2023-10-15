package com.zlateva;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        originator.setState("State #2");
        caretaker.addToList(originator.saveStateFromMemento());

        originator.setState("State #3");
        caretaker.addToList(originator.saveStateFromMemento());


        originator.setState("State #4");
        System.out.println("Current State: "+ originator.getState());

        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("First Saved State: "+ originator.getState());

    }
}
