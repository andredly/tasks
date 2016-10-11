package com.cherniauski.trening.task4;

import com.cherniauski.trening.task3.BeginnerSet;
import com.cherniauski.trening.task4.comparator.SortedByName;
import com.cherniauski.trening.task4.comparator.SortedByPrice;
import com.cherniauski.trening.task4.comparator.SortedByPriceAndName;

import java.util.*;

import static com.cherniauski.trening.task4.BeginnerSetSorted.SORTED_BEGINER_SET;

/**
 * Created by Andre on 10.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(BeginnerSet.BEGINNER_SET);
        for (Map.Entry<Stationery, Integer> set : SORTED_BEGINER_SET.entrySet()) {
            System.out.println(set.getKey().getPrice() + "  " + set.getKey().getName() + " " + set.getValue());
        }
        System.out.println();


//task3
        List<com.cherniauski.trening.task3.Stationery> listTask3 = new ArrayList<>();
        listTask3.add(new com.cherniauski.trening.task3.Marker("Marker \"Maxiflo\"", 0.1));
        listTask3.add(new com.cherniauski.trening.task3.Sticker("Stickers \"Q-connect\"", 0.35));
        listTask3.add(new com.cherniauski.trening.task3.PaperTray("Paper Tray \"Loop\"", 3.3));
        listTask3.add(new com.cherniauski.trening.task3.Eraser("Eraser \"Test\"", 0.5));
        listTask3.add(new com.cherniauski.trening.task3.Eraser("Eraser \"KE 30\"", 0.5));
        listTask3.add(new com.cherniauski.trening.task3.Notebook("Notebook А5 \"Виннер/Наппа\"", 2.3));
        listTask3.add(new com.cherniauski.trening.task3.Marker("Marker \"Maxiflo\"", 1.8));
        listTask3.add(new com.cherniauski.trening.task3.Notebook("Notebook А5 \"Виннер/Наппа\"", 2.3));
        listTask3.add(new com.cherniauski.trening.task3.Notebook("Notebook А5 \"Виннер/Наппа\"", 2.0));
        listTask3.add(new com.cherniauski.trening.task3.Pencil("Pencil \"Festival\"", 0.2));
        listTask3.add(new com.cherniauski.trening.task3.Pencil("Pencil \"Festival\"", Double.POSITIVE_INFINITY));
        listTask3.add(new com.cherniauski.trening.task3.Stapler("Stapler \"PRO 210\"", 5.1));
        listTask3.add(new com.cherniauski.trening.task3.Stapler("Stapler \"PRO 210\"", Double.NEGATIVE_INFINITY));
        listTask3.add(new com.cherniauski.trening.task3.AutomaticBallPen("Automatic Pen \"Joy\"", 1.3));
        listTask3.add(new com.cherniauski.trening.task3.AutomaticBallPen("Automatic Pen \"Joy\"", Double.NaN));
//sorted by name

        List<com.cherniauski.trening.task3.Stationery> tmp1=new ArrayList<>(listTask3);
        listTask3.clear();
        listTask3.addAll(tmp1);
        Collections.sort(listTask3, new SortedByName());
        printForName(listTask3);

//sorted by price
        listTask3.clear();
        listTask3.addAll(tmp1);
        Collections.sort(listTask3, new SortedByPrice());
        printForPrice(listTask3);

//sorted by price and name
        listTask3.clear();
        listTask3.addAll(tmp1);
        Collections.sort(listTask3, new SortedByPriceAndName());
        printForPriceAndName(listTask3);

//sorted by price and name (lambda)
        listTask3.clear();
        listTask3.addAll(tmp1);
        Comparator<com.cherniauski.trening.task3.Stationery> comparator = (st1, st2)
                -> {
            int result = Double.compare(st1.getPrice(), st2.getPrice());
            if (result != 0) return result;
            return st1.getName().compareTo(st2.getName());
        };
        printForPriceAndName(listTask3);

//sorted by name (lambda)
        listTask3.clear();
        listTask3.addAll(tmp1);
        Comparator<com.cherniauski.trening.task3.Stationery> comparatorName = (st1, st2)
                -> st1.getName().compareTo(st2.getName());// by price getPrice()
        Collections.sort(listTask3, comparatorName);
        printForName(listTask3);

//sorted by price and name (link method)
        listTask3.clear();
        listTask3.addAll(tmp1);
        Collections.sort(listTask3, Comparator.comparing(com.cherniauski.trening.task3.Stationery::getPrice)
                .thenComparing(com.cherniauski.trening.task3.Stationery::getName));
        printForPriceAndName(listTask3);

//sorted by name(link method)
        listTask3.clear();
        listTask3.addAll(tmp1);
        Collections.sort(listTask3, Comparator.comparing(com.cherniauski.trening.task3.Stationery::getName));
        printForName(listTask3);

//sorted by price(link method)
        listTask3.clear();
        listTask3.addAll(tmp1);
        Collections.sort(listTask3, Comparator.comparing(com.cherniauski.trening.task3.Stationery::getPrice));
        printForPrice(listTask3);

//task4
        List<Stationery> list = new ArrayList<>();
        list.add(new Sticker("Stickers \"Q-connect\"", 0.35));
        list.add(new PaperTray("Paper Tray \"Loop\"", 3.3));
        list.add(new Notebook("Aotebook А5 \"Виннер/Наппа\"", 2.3));
        list.add(new Eraser("Eraser \"KE 30\"", 0.5));
        list.add(new Notebook("Notebook А5 \"Виннер/Наппа\"", 2.3));
        list.add(new Marker("Marker \"Maxiflo\"", 1.8));
        list.add(new Notebook("Motebook А5 \"Виннер/Наппа\"", 2.3));
        list.add(new Pencil("Pencil \"Festival\"", 0.2));
        list.add(new Stapler("Stapler \"PRO 210\"", 5.1));
        list.add(new AutomaticBallPen("Automatic Pen \"Joy\"", 1.3));
        Stationery testEquals1=new Sticker("Stickers \"Q-connect\"", 0.35);
        Stationery testEquals2=new Sticker("Stickers \"Q-connect\"", 0.35);
        Stationery testEquals3=new Sticker("Stickers \"Q-connect\"", 0.35);

        Stationery test1=new Eraser("Eraser \"KE 30\"", 0.5);
        Stationery test2=new PaperTray("Paper Tray \"Loop\"", 3.3);
        Stationery test3=new Sticker("Stickers \"Q-connect\"", 0.35);


        System.out.println(testEquals1.equals(testEquals2));
        System.out.println(testEquals1.hashCode());
        System.out.println(testEquals2.hashCode());
        System.out.println(testEquals2.equals(testEquals3));
        System.out.println(testEquals2.equals(testEquals1));
        System.out.println(testEquals1.equals(testEquals3));
        System.out.println();
        System.out.println(test1.compareTo(test2)==-test2.compareTo(test1));
        System.out.println();
        System.out.println(test1.compareTo(test2));
        System.out.println(test2.compareTo(test3));
        System.out.println(test1.compareTo(test3));
        System.out.println();

        System.out.println(testEquals2.compareTo(testEquals1));
        System.out.println(testEquals2.compareTo(testEquals3));
        System.out.println(testEquals1.compareTo(testEquals3));


        ArrayList<Stationery> tmpTask4=new ArrayList<>(list);
        System.out.println(list);
//sort by price and name (Comparable)
        Collections.sort(list);
        System.out.println(list);
//sort by price and name
        list.clear();
        list.addAll(tmpTask4);
        Collections.sort(list, Comparator.comparing(Stationery::getPrice)
                .thenComparing(Stationery::getName));
        System.out.println(list);

//sort by price
        list.clear();
        list.addAll(tmpTask4);
        Collections.sort(list, Comparator.comparing(Stationery::getPrice));
        System.out.println(list);

//sort by name
        list.clear();
        list.addAll(tmpTask4);
        Collections.sort(list, Comparator.comparing(Stationery::getName));
        System.out.println(list);
    }


    private static void printForName(List<com.cherniauski.trening.task3.Stationery> listTask3){
        System.out.println("---sorted by name----");
        for (com.cherniauski.trening.task3.Stationery st : listTask3) {
            System.out.println(st.getName() + " " + st.getPrice());
        }
        System.out.println();
    }

    private static void printForPrice(List<com.cherniauski.trening.task3.Stationery> listTask3){
        System.out.println("-----sorted by price------");
        for (com.cherniauski.trening.task3.Stationery st : listTask3) {
            System.out.println(st.getPrice() + " " + st.getName());
        }
        System.out.println();
    }

    private static void printForPriceAndName(List<com.cherniauski.trening.task3.Stationery> listTask3){
        System.out.println("-----sorted by price and name-----");
        for (com.cherniauski.trening.task3.Stationery st : listTask3) {
            System.out.println(st.getPrice() + " " + st.getName());
        }
        System.out.println();
    }
}