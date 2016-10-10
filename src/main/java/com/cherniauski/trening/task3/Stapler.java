package com.cherniauski.trening.task3;

/**
 * Created by Andre on 10.10.2016.
 */
public class Stapler extends SmallOfficeEquipmentStationery {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Stapler(String name, double price) {

        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stapler{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
