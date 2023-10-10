package com.zlateva;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    private static Map<String, Player> hm = new HashMap<>();

    public int totalObjectsCreated() {
        return hm.size();
    }

    public static Player getPlayerFromFactory(String playerType) throws Exception {
        Player p = null;
        if (hm.containsKey(playerType)) {
            p = hm.get(playerType);
        } else {
            switch (playerType) {
                case "Terrorist":
                    System.out.println("Terrorist created");
                    p = new Terrorist();
                    break;
                case "CounterTerrorist":
                    System.out.println("Counter Terrorist Created");
                    p = new CounterTerrorist();
                    break;
                default:
                    System.out.println("Unreachable code!");
            }
            hm.put(playerType, p);
        }
        return p;

    }
}
