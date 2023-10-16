package com.zlateva;
//Remote control is the state class
public abstract class RemoteControl {
    public abstract void pressSwitch(TV context);
}

class ON extends RemoteControl{

    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already On. Going to be Off now");
        context.setState(new Off());
    }
}

class Off extends RemoteControl{
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am Off. Going to e On now");
        context.setState(new ON());
    }
}