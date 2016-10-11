package com.cherniauski.trening.task4.comparator;

import com.cherniauski.trening.task3.Stationery;

import java.util.Comparator;

/**
 * Created by ivc4 on 11.10.2016.
 */
public class SortedByName implements Comparator<Stationery> {
    @Override
    public int compare(Stationery o1, Stationery o2) {

        return o1.getName().compareTo(o2.getName());
    }
}
