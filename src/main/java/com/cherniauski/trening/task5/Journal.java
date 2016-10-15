package com.cherniauski.trening.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ivc4 on 12.10.2016.
 */
public class Journal<T extends Number> {
    private Map<Student, List<T>> map;
    private Discipline discipline;

    public Journal(Discipline discipline) {
        map = new HashMap<>();
        this.discipline = discipline;
    }

    public void addMark(Student student, T mark) {
        if (student == null) throw new NullPointerException();
        if (!discipline.getGroupOfDiscipline().checkStudentInGroup(student)){
            System.out.println("Student not belongs group");
            throw  new IllegalArgumentException();
        }
        List<T> list = new ArrayList<>();
        if (map.get(student) == null) {
            list.add(mark);
            map.put(student, list);
        } else {
            map.get(student).add(mark);
        }
    }

    public List<T> getMarks(Student student) {
        List<T> list=new ArrayList<>();
        if (student == null) throw new NullPointerException();
        if (map.get(student) == null) {
            return list;
        }
        return map.get(student);
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void clearStudentInJournal(Student student){
        if (student == null) throw new NullPointerException();
        List<T> list = map.get(student);
        if (list==null)return;
        else list.clear();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Journal)) return false;

        Journal<?> journal = (Journal<?>) o;

        if (map != null ? !map.equals(journal.map) : journal.map != null) return false;
        return discipline == journal.discipline;

    }

    @Override
    public int hashCode() {
        int result = map != null ? map.hashCode() : 0;
        result = 31 * result + (discipline != null ? discipline.hashCode() : 0);
        return result;
    }
}





