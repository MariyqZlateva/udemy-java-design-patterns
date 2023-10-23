package com.zlateva;

public class Client {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{new Book(20, "1234"),
                                                new Book(100, "5678"),
                                                new Fruit(10, 2, "Banana"),
                                                new Fruit(5, 5, "Apple")};
        int total = calculatePrice(items);
        System.out.println("Total cost = "+ total);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor shoppingCartVisitor = new ShoppingCartVisitorImp();
        int sum = 0;
        for (ItemElement item:items){
            sum = sum + item.accept(shoppingCartVisitor);
        }
        return sum;
    }
}
