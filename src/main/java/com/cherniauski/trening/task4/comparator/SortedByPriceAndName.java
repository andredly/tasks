package com.cherniauski.trening.task4.comparator;

import com.cherniauski.trening.task3.Stationery;

import java.util.Comparator;

/**
 * Created by ivc4 on 11.10.2016.
 */
public class SortedByPriceAndName implements Comparator<Stationery> {
    @Override
    public int compare(Stationery o1, Stationery o2) {
        int result= Double.compare(o1.getPrice(),o2.getPrice());
        if (result!=0)return result;
        return o1.getName().compareTo(o2.getName());
    }
}
