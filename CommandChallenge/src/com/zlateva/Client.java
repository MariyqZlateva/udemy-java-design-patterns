package com.zlateva;

public class Client {
    public static void main(String[] args) {
        Stock googleStock = new Stock();

        BuyStock byStackOrder = new BuyStock(googleStock);
        SellStock sellStockOrder = new SellStock(googleStock);

        Broker broker = new Broker();
        broker.takeOrder(byStackOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrder();
    }
}
