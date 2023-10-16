package com.zlateva;

public class Client {
    public static void main(String[] args) {

        AverageScoreDispaly averageScoreDispaly = new AverageScoreDispaly();
        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

        //pass the elements to cricket data
        CricketData cricketData = new CricketData();

        //register display elements
        cricketData.register(averageScoreDispaly);
        cricketData.register(currentScoreDisplay);

        //in real app there will have some logic to call this function when data changes
        cricketData.dataChanges();

        //remove an observer
        cricketData.unregister(averageScoreDispaly);

        cricketData.dataChanges();
    }
}
