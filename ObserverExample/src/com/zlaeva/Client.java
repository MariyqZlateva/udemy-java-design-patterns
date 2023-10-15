package com.zlaeva;

public class Client {
    public static void main(String[] args) {
        // create subject
        MyTopic topic = new MyTopic();

        // create observers
        Observer o1 = new MyTopicSubscriber("Obj1");
        Observer o2 = new MyTopicSubscriber("Obj2");
        Observer o3 = new MyTopicSubscriber("Obj3");

        //register observers to the subject, could have added registration
        //as a part of the observer constructor (passing the subject)
        topic.register(o1);
        topic.register(o2);
        topic.register(o3);

        //attach observer to subject
        //(not required, could have passed in subject state to update method)
        o1.setSubject(topic);
        o2.setSubject(topic);
        o3.setSubject(topic);

        //check if any update is available, not required
        o1.update();

        //now send message to subject, trigger notifyAll
        topic.postMessage("New Message");
    }
}
