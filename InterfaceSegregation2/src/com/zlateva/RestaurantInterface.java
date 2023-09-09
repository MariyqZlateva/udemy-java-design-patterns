package com.zlateva;

public interface RestaurantInterface {
    void acceptOnlineOrder();
    void takeTelephoneOrder();
    void payOnline();
    void walkInCustomerOrder();
    void payInPerson();

    // have to separate payment and order in different interfaces
}
