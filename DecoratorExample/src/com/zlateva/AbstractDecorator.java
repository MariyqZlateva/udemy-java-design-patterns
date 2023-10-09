package com.zlateva;

public abstract class AbstractDecorator extends Component {
    protected Component com;

    public void setCom(Component com) {
        this.com = com;
    }

    @Override
    public void doJob() {
        if (com != null) {
            com.doJob();
        }
    }
}

class ConcreteDecoratorEx_1 extends AbstractDecorator {
    @Override
    public void doJob() {
        super.doJob();
        // add additional responsibilities
        System.out.println("I am explicitly from Ex_1");
    }
}

class ConcreteDecoratorEx_2 extends AbstractDecorator {
    @Override
    public void doJob() {
        System.out.println("***START Ex_2");
        super.doJob();
        // add additional responsibilities
        System.out.println("I am explicitly from Ex_2");
        System.out.println("END Ex_2***");
    }
}