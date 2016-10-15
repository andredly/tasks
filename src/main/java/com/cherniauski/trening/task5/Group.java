package com.cherniauski.trening.task5;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by ivc4 on 11.10.2016.
 */
public class Group {
    private int idGroup;
    private String number;
    private Set<Student> students;

    public Group() {
        this.students=new HashSet<>();
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

    public void remove(Student student){
        if (student==null) throw new NullPointerException();
        students.remove(student);
    }

    public Set<Student> getAllStudents(){
        return students;
    }

    public boolean checkStudentInGroup(Student student){
        if (student==null)throw new NullPointerException();
        return students.contains(student);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Group)) return false;

        Group group = (Group) o;

        if (idGroup != group.idGroup) return false;
        if (number != null ? !number.equals(group.number) : group.number != null) return false;
        return students != null ? students.equals(group.students) : group.students == null;

    }

    @Override
    public int hashCode() {
        int result = idGroup;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (students != null ? students.hashCode() : 0);
        return result;
    }
}
