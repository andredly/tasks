package com.cherniauski.trening.task2.correct_variant;

import java.util.*;

/**
 * Created by Andre on 09.10.2016.
 */
class SheetStationery{

    private static final Set<Stationery> listAllStationery=new HashSet<>();


    public static void addStationery(Stationery stationery){
        if (stationeryIsNull(stationery)){return;}
        listAllStationery.add(stationery);
        System.out.println("Stationery added success.");
    }

    public static void removeStationery(Stationery stationery){
        if (stationeryIsNull(stationery)){return;}
        listAllStationery.remove(stationery);
        System.out.println("Stationery removed success.");
    }
    public static boolean containsStationery(Stationery stationery){
        if (stationeryIsNull(stationery)){return false;}
        return listAllStationery.contains(stationery);
    }

    public static List<Stationery> getStationeryForNameFromBase(String name){
        if (name==null){
            System.out.println("Incorrect name");
            return null;
        }
        List<Stationery> list=new ArrayList<>();
        for (Stationery stationery:listAllStationery){
            if (stationery.getName().equals(name))list.add(stationery);
        }
        return list;
    }
    public static Stationery getStationeryForName(String name, double price){
        if (name==null||price<0){
            System.out.println("Incorrect name or price");
            return null;
        }
        Stationery tmpStationery=new Stationery(name,price);
        for (Stationery stationery:listAllStationery){
            if (stationery.equals(tmpStationery)) return stationery;
        }
        return null;
    }

    public static void printAllListStationery(){
        System.out.println(listAllStationery);
    }


    private static boolean stationeryIsNull(Stationery stationery){
        if (stationery==null){
            System.out.println("Error. Stationery incorrect!");
            return true;}
        return false;
    }
}
