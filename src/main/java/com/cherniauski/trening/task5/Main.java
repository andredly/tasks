package com.cherniauski.trening.task5;

import java.util.*;

/**
 * Created by ivc4 on 12.10.2016.
 */
public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Student(i, ("Name" + i)));
        }
        Group group1 = new Group();
        Group group2 = new Group();
        Group group3 = new Group();
        Group group4 = new Group();

        for (int i = 0; i < 5; i++) {
            group1.addStudent(list.get(i));
        }
        for (int i = 3; i < 9; i++) {
            group2.addStudent(list.get(i));
        }
        for (int i = 5; i < 10; i++) {
            group3.addStudent(list.get(i));
        }
        for (int i = 2; i < 8; i++) {
            group4.addStudent(list.get(i));
        }
        Discipline.COMPUTER_NETWORKS.addGroup(group1);
        Discipline.DATABASE_SYSTEM.addGroup(group2);
        Discipline.OPERATING_SYSTEM.addGroup(group3);
        Discipline.WEB_TECHNOLOGY.addGroup(group4);
        Journal<Double> journal1 = new Journal<>(Discipline.COMPUTER_NETWORKS);
        Journal<Long> journal2 = new Journal<>(Discipline.DATABASE_SYSTEM);
        Journal<Integer> journal3 = new Journal<>(Discipline.OPERATING_SYSTEM);
        Journal<Float> journal4 = new Journal<>(Discipline.WEB_TECHNOLOGY);
        for (int i = 0; i < 5; i++) {
            journal1.addMark(list.get(0), (double) (Math.random() * 10));
            journal1.addMark(list.get(1), (double) (Math.random() * 10));
            journal1.addMark(list.get(2), (double) (Math.random() * 10));
            journal1.addMark(list.get(3), (double) (Math.random() * 10));
            journal1.addMark(list.get(4), (double) (Math.random() * 10));
        }
        for (int i = 3; i < 9; i++) {
            journal2.addMark(list.get(3), (long) (Math.random() * 10));
            journal2.addMark(list.get(4), (long) (Math.random() * 10));
            journal2.addMark(list.get(5), (long)(Math.random() * 10));
            journal2.addMark(list.get(6), (long) (Math.random() * 10));
            journal2.addMark(list.get(7), (long) (Math.random() * 10));
            journal2.addMark(list.get(8), (long) (Math.random() * 10));
        }
        for (int i = 5; i < 10; i++) {
            journal3.addMark(list.get(5), (int) (Math.random() * 10));
            journal3.addMark(list.get(6), (int) (Math.random() * 10));
            journal3.addMark(list.get(7), (int) (Math.random() * 10));
            journal3.addMark(list.get(8), (int) (Math.random() * 10));
        }
        for (int i = 2; i < 8; i++) {
            journal4.addMark(list.get(2), (float) (Math.random() * 100));
            journal4.addMark(list.get(3), (float) (Math.random() * 100));
            journal4.addMark(list.get(4), (float) (Math.random() * 100));
            journal4.addMark(list.get(5), (float) (Math.random() * 100));
            journal4.addMark(list.get(6), (float) (Math.random() * 100));
            journal4.addMark(list.get(7), (float) (Math.random() * 100));
        }
        Set<Journal> set=new HashSet<>();
        set.add(journal1);
        set.add(journal2);
        set.add(journal3);
        set.add(journal4);
        MonitoringStudentProgress monitoringStudentProgress=new MonitoringStudentProgress(set);

        monitoringStudentProgress.printResultStudentProgress(list.get(4));
        monitoringStudentProgress.printResultStudentProgress(list.get(2));
        monitoringStudentProgress.printResultStudentProgress(list.get(3));
        monitoringStudentProgress.printResultStudentProgress(list.get(5));


    }
}




