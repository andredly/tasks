package com.cherniauski.trening.task2.correct_variant;

import java.util.*;

/**
 * Created by Andre on 09.10.2016.
 */
class SheetEmployees {

    private static final Set<Employee> employees=new HashSet<>();

    public static Set<Employee> getEmployees() {
        return employees;
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

    public static double getTotalCostStationery(Employee employee){
        if (employee==null) {
            System.out.println("Employee not found");
            return 0;}
        Map<Stationery,Integer> map = employee.getStationery();
        double sum=0;
        for (Map.Entry<Stationery,Integer> set:map.entrySet()){
            sum=sum+set.getKey().getPrice()*set.getValue();
        }
        return sum;
    }

    public static List<Integer> getPersonnelNumbers(){
        List<Integer> pn=new ArrayList<>();

        for (Employee empl:employees) {
            pn.add(empl.getPersonnelNumber());
        }
        Collections.sort(pn);
        return pn;
    }

}
