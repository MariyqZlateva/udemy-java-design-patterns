package com.zlateva;

public class Message {
    private String text;
    private MessagePriority priority;

    public Message(String text, MessagePriority priority) {
        this.text = text;
        this.priority = priority;
    }

    public String getText() {
        return text;
    }

    public MessagePriority getPriority() {
        return priority;
    }
}

enum MessagePriority{
    HIGH_LEVEL_PRIORITY,
    NORMAL_LEVEL_PRIORITY
}