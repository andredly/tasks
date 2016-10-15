package com.cherniauski.trening.task5;


import java.math.BigDecimal;
import java.util.*;
import java.util.List;

/**
 * Created by Andre on 14.10.2016.
 */
public class MonitoringStudentProgress<T extends Number> {
    private final Set<Journal<T>> journals;

    public MonitoringStudentProgress(Set<Journal<T>> journals) {
        this.journals = journals;
    }

    public void addJournal(Journal<T> journal) {
        journals.add(journal);
    }

    public void remove(Journal<T> journal) {
        journals.remove(journal);
    }

    public Iterator<Journal<T>> getIterator() {
        return journals.iterator();
    }

    public void printResultStudentProgress(Student student) {
        for (Journal journal : journals) {

            List<T> marks = journal.getMarks(student);
            if (marks.isEmpty())break;
            double valueMarkDouble=0;
            for (T mark : marks) {
                valueMarkDouble=valueMarkDouble+mark.doubleValue();
            }
            System.out.println();
            double resultGPA=valueMarkDouble/marks.size();
            BigDecimal resultGPABigDecimal=new BigDecimal(valueMarkDouble);
            BigDecimal result = resultGPABigDecimal.divide(new BigDecimal(marks.size()),2,2);
            System.out.println("Student: "+student.getName()+ ", discipline: "+journal.getDiscipline().typeDiscipline+" GPA: "+result);
        }
    }
}
