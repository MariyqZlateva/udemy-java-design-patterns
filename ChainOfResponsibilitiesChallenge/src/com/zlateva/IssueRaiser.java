package com.zlateva;

public class IssueRaiser {
    public IReceiver setFirstReceiver;
    public IssueRaiser(IReceiver firstReceiver){
        this.setFirstReceiver = firstReceiver;
    }

    public void  raiseMessage(Message msg){
        if (setFirstReceiver != null){
            setFirstReceiver.processMessage(msg);
        }
    }
}
