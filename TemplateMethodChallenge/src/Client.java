public class Client {
    public static void main(String[] args) {
        OrderProcessTemplate onlineOrder = new NetOrder();
        onlineOrder.processOrder(true);

        System.out.println("_____________________________");
        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(true);

    }
}
