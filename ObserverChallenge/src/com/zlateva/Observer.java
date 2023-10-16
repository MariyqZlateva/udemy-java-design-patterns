package com.zlateva;

public interface Observer {
    void update(int runs, int wickets, float overs);
}

class AverageScoreDispaly implements Observer {

    private float runRate;
    private int predictedScore;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runRate = (float) runs / overs;
        this.predictedScore = (int) (this.runRate * 50);
        display();
    }

    public void display() {
        System.out.println("\nAverage Score Display: \n"
                + "Run Rate: " + runRate +
                "\nPredictedScore " +
                predictedScore);
    }
}

class CurrentScoreDisplay implements Observer {
    private int runs, wickets;
    private float overs;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    public void display() {
        System.out.println("\nCurrent Score Display: \n"
                + "Run Rate: " + runs +
                "\nWickets " + wickets+
                "\nOvers " + overs);
    }
}
