package com.zlateva;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, RobotInterface> shapes = new HashMap<>();

    public int totalObjectsCrated() {
        return shapes.size();
    }

    public RobotInterface getRobotFromFactory(String robotType) throws Exception {
        RobotInterface myRobotCategory = null;
        if (shapes.containsKey(robotType)) {
            myRobotCategory = shapes.get(robotType);
        } else {
            switch (robotType) {
                case "King":
                    System.out.println("We do not have a King Robot. So we creating a King Robot category");
                    myRobotCategory = new Robot("King");
                    shapes.put("King", myRobotCategory);
                    break;
                case "Queen":
                    myRobotCategory = new Robot("Queen");
                    System.out.println("We do not have Queen Robot. So we creating a Queen Robot category");
                    shapes.put("Queen", myRobotCategory);
                    break;
                default:
                    throw new Exception("Robot factory can create only King and Queen Robots");
            }
        }
        return myRobotCategory;

    }
}
