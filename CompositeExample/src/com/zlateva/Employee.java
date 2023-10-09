package com.zlateva;

public interface Employee {
    void showEmployeeDetails();
}

class Developer implements Employee {
    private String name;
    public long empId;
    private String position;

    public Developer( long empId,String name, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position);
    }
}

class Manager implements Employee{
    private String name;
    public long empId;
    private String position;

    public Manager( long empId,String name, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }


    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position);
    }
}