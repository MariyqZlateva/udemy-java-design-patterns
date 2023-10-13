package com.zlateva;

public class Client {
    public static void main(String[] args) {
        System.out.println("***ITERATOR PATTERN DEMO***\n");
        ISubject cs_subject = new Science();
        ISubject ar_subject = new Arts();

        Iterator sc_iterator = cs_subject.createIterator();
        Iterator ar_iterator = ar_subject.createIterator();

        System.out.println("\nScience subjects : ");
        print(sc_iterator);

        System.out.println("\nArts subjects : ");
        print(ar_iterator);

    }

    public static void print(Iterator iterator){
        while (!iterator.isDone()){
            System.out.println(iterator.next());
        }
    }
}
