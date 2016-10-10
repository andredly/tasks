package com.cherniauski.trening.task2.correct_variant;

import com.cherniauski.trening.task2.not_consistent_task_variant.Sheet;

import java.util.*;

/**
 * Created by Andre on 09.10.2016.
 */
    public class Employee {
    private int personnelNumber;
    private String name;
    private String position;
    private Map<Stationery,Integer> allStationeryForEmployee;
    private final String PASSWORD;

    public Employee(int personnelNumber, String name, String position, String password) {
        this.personnelNumber = personnelNumber;
        this.name = name;
        this.position = position;
        this.PASSWORD=password;
        this.allStationeryForEmployee=new HashMap<>();
    }

    public int getPersonnelNumber() {
        return personnelNumber;
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

    Map<Stationery,Integer> getStationery() {
        return allStationeryForEmployee;
    }

    public void putStationery(Stationery stationery, int count){
        if (stationery==null||count<=0){
            System.out.println("Incorrect data");
            return;}
        if(!SheetStationery.containsStationery(stationery)) SheetStationery.addStationery(stationery);
        int startCount=0;
        if (allStationeryForEmployee.get(stationery)==null)startCount=0;
        else startCount=allStationeryForEmployee.get(stationery);
        allStationeryForEmployee.put(stationery,(startCount+count));
        System.out.println("Put success.");
    }

    final String getPASSWORD() {
        return PASSWORD;
    }

    public void removeStationery(String name, double price, int count){
        if (count<=0){
            System.out.println("Incorrect count stationery");
            return;
        }
        if (price<0){
            System.out.println("Incorrect price stationery");
            return;
        }
        Stationery stationery = SheetStationery.getStationeryForName(name, price);
        if (!allStationeryForEmployee.containsKey(stationery)){
            System.out.println("Stationery not found");
            return;
        }
        Integer countHaveEmployee = allStationeryForEmployee.get(stationery);
        if ((countHaveEmployee-count)<0) {System.out.println("Error. Count : "+count+ ", bat have "+countHaveEmployee);
            return;
        }
        allStationeryForEmployee.put(stationery,(countHaveEmployee-count));
        System.out.println("Success.");
    }
    public Map<Stationery,Integer> getStationery(String  name){
        if (name==null){
            System.out.println("Incorrect name");
            return null;
        }
        Map<Stationery,Integer> map=new HashMap<>();
        for (Map.Entry<Stationery,Integer> set: allStationeryForEmployee.entrySet()){
            if (set.getKey().getName().equals(name)) map.put(set.getKey(),set.getValue());
        }
        return map;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "personnelNumber=" + personnelNumber +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        return  (personnelNumber != employee.personnelNumber);
    }

    @Override
    public int hashCode() {
        int result = personnelNumber;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (allStationeryForEmployee != null ? allStationeryForEmployee.hashCode() : 0);
        return result;
    }
}
