package com.cherniauski.trening.task4;

/**
 * Created by Andre on 10.10.2016.
 */
public class Notebook extends PaperStationery {
    private String name;
    private double price;

    public Notebook(String name, double price) {
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
        return "Notebook{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Notebook notebook = (Notebook) o;

        if (Double.compare(notebook.price, price) != 0) return false;
        return name != null ? name.equals(notebook.name) : notebook.name == null;

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
