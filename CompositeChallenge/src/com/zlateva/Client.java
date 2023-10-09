package com.zlateva;

public class Client {

    public static void main(String[] args) {
        System.out.println("***COMPOSITE PATTERN DEMO***");
        System.out.println("The college has the following structure");

        FacultyInterface professor1 = new Professor("Math", "Professor1", "Adjunct");
        FacultyInterface professor2 = new Professor("Math", "Professor2", "Associate");

        Supervisor technologyDean = new Supervisor("Dr. Mike", " Dean of Technology");
        Supervisor math = new Supervisor("Mrs. D.Dats", "Math");
        math.add(professor1);
        math.add(professor2);

        FacultyInterface professor3 = new Professor("CSE", "Professor1", "Adjunct");
        FacultyInterface professor4 = new Professor("CSE", "Professor2", "Professor");
        FacultyInterface professor5 = new Professor("CSE", "Professor3", "Professor");

        Supervisor cse = new Supervisor("Mr. V.Sarcar", "CSE");
        cse.add(professor3);
        cse.add(professor4);
        cse.add(professor5);

        technologyDean.add(math);
        technologyDean.add(cse);
        technologyDean.getDetails();

        cse.remove(professor5);
        System.out.println("After CSE Professor5 living the organization - CSE department has the following team: ");
        cse.getDetails();
    }
}
