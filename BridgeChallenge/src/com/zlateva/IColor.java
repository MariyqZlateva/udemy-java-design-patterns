package com.zlateva;

public interface IColor {
    void fillWithColor(int border);
}

class GreenColor implements IColor{

    @Override
    public void fillWithColor(int border) {
        System.out.print("Green color with "+ border + " inch border");
    }
}
class RedColor implements IColor{

    @Override
    public void fillWithColor(int border) {
        System.out.print("Red color with "+ border + " inch border");
    }
}
