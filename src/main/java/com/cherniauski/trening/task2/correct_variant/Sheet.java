package com.cherniauski.trening.task2.correct_variant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andre on 09.10.2016.
 */
public class Sheet{

    private static List<Employee> employees=new ArrayList<>();

    public static List<Employee> getEmployees() {
        return employees;
    }

    public static void setEmployees(List<Employee> employees) {
        Sheet.employees = employees;
    }

    public static void addEmployee(Employee employee){
        if(employee==null){throw new NullPointerException();}
        employees.add(employee);
    }

    public static void removeEmployee(Employee employee){
        if(employee==null){throw new NullPointerException();}
        employees.remove(employee);
    }

    public static Employee getEmployee(int personnelNumber){
        if(personnelNumber<=0){
            System.out.println("Personnel number incorrect");
            return null;
        }
        Employee tmpEmployee = null;
        for (Employee empl : employees) {
            if (empl.getPersonnelNumber() == personnelNumber) {
                tmpEmployee = empl;
                break;
            }
        }
        return tmpEmployee;
    }

    public static List<Stationery> getStationery(Employee employee){
        if (employee==null) {
            System.out.println("Employee not found");
            return null;}
        return employee.getStationery();
    }

    public static double getTotalCostStationery(Employee employee){
        if (employee==null) {
            System.out.println("Employee not found");
            return 0;}
        List<Stationery> stationery = employee.getStationery();
        double sum=0;
        for (Stationery st:stationery){
            sum=sum+st.getPrice();
        }
        return sum;
    }
}
