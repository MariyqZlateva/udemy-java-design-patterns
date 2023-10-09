package com.zlateva;

public abstract class Component {
    public abstract void doJob();
}

class ConcreteComponent extends Component{
    @Override
    public void doJob() {
        System.out.println("I'm from Concrete Component - I'm closed for modification");
    }
}
