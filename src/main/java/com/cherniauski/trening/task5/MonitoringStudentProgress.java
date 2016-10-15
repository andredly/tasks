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
            if (marks.isEmpty()) break;
            double valueMarkDouble = 0;
            long valueMarkLong = 0;
            Class<? extends Number> aClass = null;
            System.out.println("Result student: " + student.getName() + ", discipline: " + journal.getDiscipline().typeDiscipline);
            System.out.print("Marks: ");
            for (T mark : marks) {
                aClass = mark.getClass();
//                System.out.println(aClass+"----------"+ aClass.isInstance(Double.class));
                valueMarkDouble = valueMarkDouble + mark.doubleValue();
                valueMarkLong = valueMarkLong + mark.longValue();
                if (aClass.equals(Double.class) || aClass.equals(Float.class)) {
                    System.out.printf("%.2f, ", mark.doubleValue());
                } else {
                    System.out.printf("%d, ", mark.longValue());
                }
            }
            BigDecimal resultGPABigDecimal;
            if (aClass.equals(Double.class) || aClass.equals(Float.class)) {
                resultGPABigDecimal = new BigDecimal(valueMarkDouble);
            } else {
                resultGPABigDecimal = new BigDecimal(valueMarkLong);
            }
            System.out.println();
//            double resultGPA = valueMarkDouble / marks.size();
            BigDecimal result = resultGPABigDecimal.divide(new BigDecimal(marks.size()), 2, 2);
            System.out.println(" GPA: " + result);
        }
    }
}
