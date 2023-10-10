package com.zlateva;

import java.util.Random;

public class CounterStrike {
    private static String[] playerType = {"Terrorist", "CounterTerrorist"};
    private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};
    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 10; i++) {
            Player player = PlayerFactory.getPlayerFromFactory(getRandomType());
            player.assignWeapon(getRandomWeapon());
            player.mission();
        }
    }

    private static String getRandomWeapon() {
        Random r = new Random();
        int rnd = r.nextInt(weapons.length);
        return weapons[rnd];
    }

    private static String getRandomType() {
        Random r = new Random();
        int rnd = r.nextInt(playerType.length);
        return playerType[rnd];
    }

}
