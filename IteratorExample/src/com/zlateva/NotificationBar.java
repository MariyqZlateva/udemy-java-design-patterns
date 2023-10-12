package com.zlateva;

// contains collection of notifications as an object of NotificationCollection
public class NotificationBar {

    NotificationCollection notification;

    public NotificationBar(NotificationCollection notification) {
        this.notification = notification;
    }

    public void printNotifications(){
        Iterator iterator = notification.createIterator();
        System.out.println("---------NOTIFICATION BAR------------");
        while (iterator.hasNext()){
            Notification n = (Notification) iterator.next();
            System.out.println(n.getNotification());
        }
    }

}
