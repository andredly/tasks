package com.cherniauski.trening.task2.correct_variant;

/**
 * Created by Andre on 09.10.2016.
 */
public class Stationery {
    private int identificationNumber;
    private String name;
    private double price;

    public Stationery(int identificationNumber, String name, double price) {
        this.identificationNumber = identificationNumber;
        this.name = name;
        this.price = price;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
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

        return  (identificationNumber != that.identificationNumber);
    }
}
