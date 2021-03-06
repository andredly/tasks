package com.cherniauski.trening.task4;

/**
 * Created by Andre on 10.10.2016.
 */
public class Sticker extends PaperStationery {
    private String name;
    private double price;

    public Sticker(String name, double price) {
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
        return "Sticker{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sticker sticker = (Sticker) o;

        if (Double.compare(sticker.price, price) != 0) return false;
        return name != null ? name.equals(sticker.name) : sticker.name == null;

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
    @Override
    public int compareTo(Stationery o) {
        int result=Double.compare(price,o.getPrice());
        if (result!=0)return result;
        return name.compareTo(o.getName());
    }
}
