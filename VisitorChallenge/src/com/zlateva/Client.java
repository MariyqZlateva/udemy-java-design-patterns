package com.zlateva;

import java.util.ArrayList;

public class Client {
    private static ArrayList<Element> shoppingItems = new ArrayList<>();

    private static double calculatePrice(Visitor visitor) {
        for (Element item : shoppingItems) {
            item.accept(visitor);
        }
        return visitor.getTotalPostage();
    }

    public static void main(String[] args) {

        Visitor usVisitor = new USPostageVisitor();
        Visitor saVisitor = new SouthAmericaVisitor();


        Element book = new Book(8.52, 1.05);
        Element cd = new CD(18.52, 3.05);
        Element dvd = new DVD(8.53, 4.02);

        shoppingItems.add(book);
        shoppingItems.add(cd);
        shoppingItems.add(dvd);


        double total = calculatePrice(usVisitor);
        System.out.println("Total postage for shipping my items to the US is " + total);

        System.out.println("-------------------------------");
        total = calculatePrice(saVisitor);
        System.out.println("Total postage for shipping my items to the South America is " + total);

    }
}
