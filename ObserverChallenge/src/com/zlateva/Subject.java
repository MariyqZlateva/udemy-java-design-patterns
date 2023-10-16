package com.zlateva;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface Subject {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();
}

class CricketData implements Subject {
    private int run;
    private int wickets;
    private float overs;

    private List<Observer> observers;

    public CricketData() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Iterator<Observer> it = observers.iterator(); it.hasNext(); ) {
            Observer o = it.next();
            o.update(run, wickets, overs);
        }
    }

    //get latest runs from stadium
    public int getLatestRuns() {
        return 90;
    }

    //get latest wickets from stadium
    public int getLatestWickets() {
        return 2;
    }

    //get latest overs from stadium
    public float getLatestOvers() {
        return (float) 10.2;
    }

    //this method is used update when data changes
    public void dataChanges(){
        //get latest data
        run = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();
        notifyObservers();
    }
}
