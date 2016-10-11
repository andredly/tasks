package com.cherniauski.trening.task3;

/**
 * Created by Andre on 10.10.2016.
 */
public class Eraser extends SmallOfficeEquipmentStationery {
    private String name;
    private double price;

    public Eraser(String name, double price) {
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
        return "Eraser{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Eraser eraser = (Eraser) o;

        if (Double.compare(eraser.price, price) != 0) return false;
        return name != null ? name.equals(eraser.name) : eraser.name == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
