package com.zlateva;

public class Client {
    public static void main(String[] args) {
        System.out.println("***DECORATOR PATTERN DEMO***");
        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecoratorEx_1 cd_1 = new ConcreteDecoratorEx_1();
        // Decorating ConcreteComponent Object cc with ConcreteDecoratorEx_1
        cd_1.setCom(cc);
        cd_1.doJob();

        ConcreteDecoratorEx_2 cd_2 = new ConcreteDecoratorEx_2();

        // Decorating ConcreteComponent Object cc with ConcreteDecoratorEx_1 & ConcreteDecoratorEx_2
        cd_2.setCom(cd_1);
        cd_2.doJob();

    }
}
