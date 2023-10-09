package com.zlateva;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Supervisor implements FacultyInterface {

    private List<FacultyInterface> professorList;
    private String name;
    private String departmentName;


    public Supervisor(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
        this.professorList = new ArrayList<>();
    }

    public void add(FacultyInterface professor) {
        professorList.add(professor);
    }

    public void remove(FacultyInterface professor) {
        professorList.remove(professor);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public void getDetails() {
        System.out.println("-----------------------");
        System.out.println(name + " is the Chair of " + departmentName + " Department");

        Iterator<FacultyInterface> professorIterator = professorList.stream().iterator();
        while (professorIterator.hasNext()) {
            FacultyInterface professor = professorIterator.next();
            professor.getDetails();
        }
    }
}
