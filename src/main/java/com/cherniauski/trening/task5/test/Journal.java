package com.cherniauski.trening.task5.test;

import com.cherniauski.trening.task5.Discipline;
import com.cherniauski.trening.task5.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ivc4 on 12.10.2016.
 */
public class Journal<I extends Integer,D extends Double> {
    private Map<Student, List<I>>mapInteger;
    private Map<Student, List<D>>mapReal;
    private Discipline discipline;

    public Journal(Discipline discipline) {
        mapInteger = new HashMap<>();
        mapReal = new HashMap<>();
        this.discipline = discipline;
    }

    public void addMark(Student student, I mark) {
        if (student == null) throw new NullPointerException();
        if (!discipline.getGroupOfDiscipline().checkStudentInGroup(student)){
            System.out.println("Student not belongs group");
            throw  new IllegalArgumentException();
        }
        List<I> list = new ArrayList<>();
        if (mapInteger.get(student) == null) {
            list.add(mark);
            mapInteger.put(student, list);
        } else {
            mapInteger.get(student).add(mark);
        }
    }


    public void addMark(Student student, D mark) {
        if (student == null) throw new NullPointerException();
        if (!discipline.getGroupOfDiscipline().checkStudentInGroup(student)){
            System.out.println("Student not belongs group");
            throw  new IllegalArgumentException();
        }
        List<D> list = new ArrayList<>();
        if (mapReal.get(student) == null) {
            list.add(mark);
            mapReal.put(student, list);
        } else {
            mapReal.get(student).add(mark);
        }
    }



    public List<I> getMarksInteger(Student student) {
        List<I> list=new ArrayList<>();
        if (student == null) throw new NullPointerException();
        if (mapInteger.get(student) == null) {
            return list;
        }
        return mapInteger.get(student);
    }

    public List<D> getMarksReal(Student student) {
        List<D> list=new ArrayList<>();
        if (student == null) throw new NullPointerException();
        if (mapReal.get(student) == null) {
            return list;
        }
        return mapReal.get(student);
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void clearStudentInJournal(Student student){
        if (student == null) throw new NullPointerException();
        List<I> listInteger = mapInteger.get(student);
        List<D> listReal = mapReal.get(student);
        if (listInteger!=null)listInteger.clear();
        if (listReal!=null)listReal.clear();
    }
}





