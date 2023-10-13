package com.zlateva;

import java.util.LinkedList;

public interface ISubject {
    Iterator createIterator();
}
class Arts implements ISubject {

    private String[] subjects;

    public Arts() {
        this.subjects = new String[2];
        subjects[0] = "Bengali";
        subjects[1] = "English";
    }

    @Override
    public Iterator createIterator() {
        return new ArtsIterator(subjects);
    }
}

class Science implements ISubject {

    private LinkedList<String> subjects;

    public Science() {
        subjects = new LinkedList<>();
        subjects.addLast("Maths");
        subjects.addLast("Comp. Sc.");
        subjects.addLast("Physics");

    }

    @Override
    public Iterator createIterator() {
        return new ScienceIterator(subjects);
    }
}