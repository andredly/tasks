package com.cherniauski.trening.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ivc4 on 12.10.2016.
 */
public class Journal<T> {
    private Map<Student, List<T>> map;
    private Discipline discipline;

    public Journal(Discipline discipline) {
        map = new HashMap<>();
        this.discipline = discipline;
    }

    public void addMark(Student student, T mark) {
        if (student == null) throw new NullPointerException();
        List<T> list = new ArrayList<>();
        if (map.get(student) == null) {
            list.add(mark);
            map.put(student, list);
        } else {
            map.get(student).add(mark);
        }
    }

    public List<T> getMark(Student student) {
        if (student == null) throw new NullPointerException();
        if (map.get(student) == null) {
            return new ArrayList<>();
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

    private boolean checkStudentInGroup(Student student){
        List<Group> groups=discipline.getGroupOfDiscipline();
        for (Group group:groups){
            //todo
        }
        return false;
    }

}





