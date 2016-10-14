package com.cherniauski.trening.task5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivc4 on 11.10.2016.
 */
public class Group {
    private int idGroup;
    private String number;
    private List<Student> students;
    private Discipline discipline;

    public Group(Discipline discipline) {
        this.discipline = discipline;
        this.students=new ArrayList<>();
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public int getIdGroup() {

        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void addStudent(Student student){
        if (student==null) throw new NullPointerException();
        students.add(student);
    }


}
