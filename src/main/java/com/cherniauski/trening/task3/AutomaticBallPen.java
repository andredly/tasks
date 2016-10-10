package com.cherniauski.trening.task3;

/**
 * Created by Andre on 10.10.2016.
 */
public class AutomaticBallPen extends WritingStationery {
    private String name;
    private double price;

    public AutomaticBallPen(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "AutomaticBallPen{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
