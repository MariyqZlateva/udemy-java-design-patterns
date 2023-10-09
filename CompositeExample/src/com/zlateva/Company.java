package com.zlateva;

public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer(100, "Jason Fedin", "Pro Developer");
        Employee dev2 = new Developer(101, "Myra Fedin", "Entry level Developer");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Employee men1 = new Manager(200, "Jenifer Fedin", "SEO Manager");
        Employee men2 = new Manager(201, "Ian Fedin", "Myra's Manager");

        Directory accDirectory = new Directory();
        accDirectory.addEmployee(men1);
        accDirectory.addEmployee(men2);

        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(accDirectory);
        companyDirectory.showEmployeeDetails();
    }
}
