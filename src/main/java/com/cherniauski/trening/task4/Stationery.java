package com.cherniauski.trening.task4;

import java.util.Comparator;
import java.util.NoSuchElementException;

/**
 * Created by Andre on 10.10.2016.
 */
public abstract class Stationery implements Comparable<Stationery> {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


}
