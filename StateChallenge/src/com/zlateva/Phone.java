package com.zlateva;

public class Phone {

    private PhoneState state;

    public void setState(PhoneState state) {
        this.state = state;
    }

    public Phone() {
        this.state = new Vibration(); // default state
    }

    public void alert(){
      state.alert(this);
    }
}
