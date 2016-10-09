package com.cherniauski.trening.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andre on 09.10.2016.
 */
public class Employee {
    private int personnelNumber;
    private String name;
    private String position;
    private List<Stationery> stationery;

    public Employee(int personnelNumber, String name, String position) {
        this.personnelNumber = personnelNumber;
        this.name = name;
        this.position = position;
        this.stationery=new ArrayList<>();
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(int personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<Stationery> getStationery() {
        return stationery;
    }

    public void setStationery(List<Stationery> stationery) {
        this.stationery = stationery;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personnelNumber=" + personnelNumber +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
