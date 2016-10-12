package com.cherniauski.trening.task5;


import com.cherniauski.trening.task5.mark.Mark;
import com.cherniauski.trening.task5.mark.Num;
import com.cherniauski.trening.task5.mark.Re;

/**
 * Created by ivc4 on 12.10.2016.
 */
public class Main {
    public static void main(String[] args) {
//
//        System.out.println(Discipline.COMPUTER_NETWORKS.get().getONE());
//        System.out.println(Discipline.OPERATING_SYSTEM.get().getONE());
//        System.out.println(Discipline.DATABASE_SYSTEM.get().getONE());
//        System.out.println(Discipline.WEB_TECHNOLOGY.get().getONE());
        Discipline operatingSystem = Discipline.OPERATING_SYSTEM;
        Mark<Discipline> mark=new Mark<>(Discipline.COMPUTER_NETWORKS);
        Discipline discipline = mark.get();
        Class<Discipline> declaringClass = discipline.getDeclaringClass();


    }
}
