package com.cherniauski.trening.task5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andre on 15.10.2016.
 */
public class Mark<T extends Number> implements Comparable<T> {
    private T value;
    public Mark(T value) {
        this.value=value;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
