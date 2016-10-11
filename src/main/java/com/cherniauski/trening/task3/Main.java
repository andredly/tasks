package com.cherniauski.trening.task3;

import java.util.Map;

import static com.cherniauski.trening.task3.BeginnerSet.BEGINNER_SET;

/**
 * Created by Andre on 10.10.2016.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(BEGINNER_SET);

        for (Map.Entry<Stationery,Integer> set:BEGINNER_SET.entrySet()){
            System.out.println(set.getKey().getName()+"  "+set.getKey().getPrice()+" "+set.getValue());
        }
        Stationery stationery=new Eraser("Test",0.2);
        System.out.println(stationery.getName());
    }


}