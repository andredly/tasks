package com.cherniauski.trening.task1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        Notebook notebook=new Notebook(20);
        Notebook notebook=new Notebook();

        for (int i = 0; i < 12; i++) {
            notebook.addNote(new Note("Привет"+i,new Date()));
        }
        Note note1=new Note("Проверка",new Date());
        notebook.addNote(note1);
        notebook.viewAll();
        System.out.println();
        notebook.removeNote(note1);
        notebook.viewAll();
        System.out.println();
        notebook.removeNote(1);
        notebook.viewAll();
        System.out.println();
        notebook.removeNote(0);
        notebook.viewAll();
        System.out.println();

        Note note=notebook.getNote(1);
        System.out.println(note);
        notebook.replace(1,note1);

        notebook.viewAll();
        System.out.println();
    }
}
