package com.cherniauski.trening.task2.not_consistent_task_variant;

/**
 * Created by Andre on 09.10.2016.
 */
public class Stationery {
    private String name;
    private double price;

    public Stationery(String name, double price) {
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
        return "Stationery{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stationery)) return false;

        Stationery that = (Stationery) o;

        if (Double.compare(that.price, price) != 0) return false;
        return name != null ? name.equals(that.name) : that.name == null;

    }
}
