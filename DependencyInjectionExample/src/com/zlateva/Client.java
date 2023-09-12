package com.zlateva;

public class Client {
    private Service myService;

    //inject via the constructor

    public Client(Service service) {
        this.myService = service;
    }

    public void doSomething() {
        myService.write("This is a message");
    }

    public void setService(Service service) {
        this.myService = service;
    }

    public static void main(String[] args) {
        Service service = new ServiceA(); // the injector
        Client client = new Client(service); //injects via the constructor
        client.doSomething();

        client.setService(service);
    }

}
