package com.zlateva;

public interface Iterator {

    // indicates where there are more elements to iterator over
    boolean hasNext();

    // returns the next element
    Object next();
}
