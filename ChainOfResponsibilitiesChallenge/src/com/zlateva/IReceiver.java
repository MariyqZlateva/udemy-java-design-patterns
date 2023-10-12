package com.zlateva;

public interface IReceiver {
    boolean processMessage(Message message);

    void setNextChain(IReceiver nextChain);
}

class EmailErrorHandler implements IReceiver {

    private IReceiver nextReceiver;

    @Override
    public void setNextChain(IReceiver nextReciever) {
        nextReceiver = nextReciever;
    }

    @Override
    public boolean processMessage(Message message) {
        if (message.getText().contains("Email")) {
            System.out.println("EmailErrorHandler proceed " + message.getPriority() +
                    " priority issue: " + message.getText());
            return true;
        } else {
            if (nextReceiver != null) {
                nextReceiver.processMessage(message);
            }
        }
        return false;
    }
}

class FaxErrorHandler implements IReceiver {

    private IReceiver nextReceiver;

    @Override
    public void setNextChain(IReceiver nextReciever) {
        nextReceiver = nextReciever;
    }

    @Override
    public boolean processMessage(Message message) {
        if (message.getText().contains("Fax")) {
            System.out.println("FaxErrorHandler proceed " + message.getPriority() +
                    " priority issue: " + message.getText());
            return true;
        } else {
            if (nextReceiver != null) {
                nextReceiver.processMessage(message);
            }
        }
        return false;
    }
}