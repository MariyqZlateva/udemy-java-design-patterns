package com.zlateva;

import java.util.Random;

public class Client {
    public static void main(String[] args) throws Exception {
        RobotFactory myRobotFactory = new RobotFactory();
        System.out.println("\n***FLYWEIGHT PATTERN EXAMPLE****\n");

        Robot shape = null;

        // Here we want to get 3 King type robots.
        for (int i = 0; i < 3; i++) {
            shape =(Robot) myRobotFactory.getRobotFromFactory("King");
            shape.setColor(getRandomColor());
            shape.print();
        }


        // Here we want to get 3 Queen type robots.
        for (int i = 0; i < 3; i++) {
            shape =(Robot) myRobotFactory.getRobotFromFactory("Queen");
            shape.setColor(getRandomColor());
            shape.print();
        }
        int numOfDistinctRobots = myRobotFactory.totalObjectsCrated();
        System.out.println("\nFinally no of Distinct Robot objects created: "+ numOfDistinctRobots);

    }

    private static String getRandomColor() {
        Random r = new Random();
        int random = r.nextInt(20);
        if (random%2 == 0){
            return "red";
        }else {
            return "green";
        }
    }
}
