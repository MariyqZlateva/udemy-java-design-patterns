package com.zlateva;

public interface FacultyInterface {
    void getDetails();
}

class Professor implements FacultyInterface {
    private String name;
    private String position;
    private String officeNumber;

    public Professor(String name, String officeNumber, String position) {
        this.name = name;
        this.position = position;
        this.officeNumber = officeNumber;
    }

    @Override
    public void getDetails() {
        System.out.println(name + " " + officeNumber + " is the " + position);
    }
}
