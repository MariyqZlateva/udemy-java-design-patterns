package com.zlateva;

public interface PhoneState {
    void alert(Phone phone);
}
class Vibration implements PhoneState{

    @Override
    public void alert(Phone phone) {
        System.out.println("Vibration...");
    }
}

class Silent implements PhoneState{

    @Override
    public void alert(Phone phone) {
        System.out.println("Silent...");
    }
}