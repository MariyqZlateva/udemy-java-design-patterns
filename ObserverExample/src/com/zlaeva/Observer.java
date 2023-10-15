package com.zlaeva;

public interface Observer {
    // method update the observer, by subject
    void update();

    //attach with subject to observe, not required,
    // but added so that the observer can query the subject to see if an update has occured
    void setSubject(Subject sub);

}

class MyTopicSubscriber implements Observer {
    private String name;
    //not required, could just pass subject state update method,
    // but also used to attach
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        //this method could take date of subjects state that was changed,
        //do not need to ask topic for it
        String msg = (String) topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name + ":: No new message");
        } else {
            System.out.println(name + ":: Consuming message ::" + msg);
        }
    }

    @Override
    public void setSubject(Subject sub) {
        // not required, added so observer can ask subject for state
        this.topic = sub;
    }
}