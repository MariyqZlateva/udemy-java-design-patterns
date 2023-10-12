package com.zlateva;

public class InterpreterContext {
    String input;

    public InterpreterContext(String input) {
        this.input = input;
    }

    public boolean getResult(String s) {
        if (input.contains(s)) {
            return true;
        }
        return false;
    }
}
