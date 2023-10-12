package com.zlateva;

public class Client {
    public static void main(String[] args) {
        System.out.println("***CHAIN OF RESPONSIBILITY PATTERN DEMO***\n");

        //making the chain Fax->Email
        IReceiver fahHandler, emailHandler;

        emailHandler = new EmailErrorHandler();
        fahHandler = new FaxErrorHandler();

        fahHandler.setNextChain(emailHandler);

        // starting point: reiser will raise issues and set the first handler
        IssueRaiser raiser = new IssueRaiser(fahHandler);

        Message m1 = new Message("Fax is reaching late to the destination", MessagePriority.NORMAL_LEVEL_PRIORITY);
        Message m2 = new Message("Email is not going", MessagePriority.HIGH_LEVEL_PRIORITY);
        Message m3 = new Message("In Email, BBX field id disabled occasionally", MessagePriority.NORMAL_LEVEL_PRIORITY);
        Message m4 = new Message("Fax is not reaching destination", MessagePriority.HIGH_LEVEL_PRIORITY);

        raiser.raiseMessage(m1);
        raiser.raiseMessage(m2);
        raiser.raiseMessage(m3);
        raiser.raiseMessage(m4);

    }
}
