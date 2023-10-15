package com.zlaeva;

import java.util.ArrayList;
import java.util.List;

public interface Subject {

    // methods to register and unregister observers
    void register(Observer obj);

    void unregister(Observer obj);

    //method to notify observers of changes
    void notifyObservers();

    //method to get updates from subject, not required, but,
    // added so observers can query
    public Object getUpdate(Observer obj);
}

class MyTopic implements Subject {

    private List<Observer> observers;
    private String message;
    private boolean changed;

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) {
            throw new NullPointerException("Null Observer");
        }
        if (!observers.contains(obj)) {
            observers.add(obj);
        }
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observerLocal = null;
        if (!changed){
            return;
        }
        observerLocal = new ArrayList<>(this.observers);
        this.changed = false;
        for (Observer obj : observerLocal){
            obj.update();
        }

    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    //method to post message to topic, change state(trigger notification)
    public void postMessage(String msg){
        System.out.println("Message Posted to Topic: "+ msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}
