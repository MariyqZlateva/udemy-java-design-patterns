package com.zlateva;

import java.util.LinkedList;

public interface Iterator {
    void first();// reset to the first element

    String next();//get next element

    boolean isDone();//end of collection check

    String currentItem();//retrieve current item
}

class ArtsIterator implements Iterator {
    private String[] subjects;
    private int position;

    public ArtsIterator(String[] subjects) {
        this.subjects = subjects;
        this.position = 0;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        return subjects[position++];
    }

    @Override
    public boolean isDone() {
        return position >= subjects.length;
    }

    @Override
    public String currentItem() {
        return subjects[position];
    }
}

class ScienceIterator implements Iterator {
    private LinkedList<String> subjects;

    private int position;

    public ScienceIterator(LinkedList<String> subjects) {
        this.subjects = subjects;
        this.position = 0;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        return subjects.get(position++);
    }

    @Override
    public boolean isDone() {
        return position >= subjects.size();
    }

    @Override
    public String currentItem() {
        return subjects.get(position);
    }
}