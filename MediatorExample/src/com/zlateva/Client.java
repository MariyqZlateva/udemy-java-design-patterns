package com.zlateva;

public class Client {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Jason");
        User user2 = new UserImpl(mediator, "Jenny");
        User user3 = new UserImpl(mediator, "Lucy");
        User user4 = new UserImpl(mediator, "Ben");
        User user5 = new UserImpl(mediator, "Ian");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        mediator.addUser(user5);

        user1.send("Hi all");
    }
}
