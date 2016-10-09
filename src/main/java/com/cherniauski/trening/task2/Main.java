package com.cherniauski.trening.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andre on 09.10.2016.
 */
public class Main {



    public static void main(String[] args) {

        Employee manager1 = new Employee(1,"Petr","Manager");
        Employee manager2 = new Employee(2,"Ivan","Manager");
        Stationery stationery1 = new Stationery("Pen", 1.4);
        Stationery stationery2 = new Stationery("Pencil", 1.0);
        Stationery stationery3 = new Stationery("Paper", 5.4);
        Stationery stationery4 = new Stationery("Calculator", 15.2);
        List<Stationery> stationeryList1 = new ArrayList();
        stationeryList1.add(stationery1);
        stationeryList1.add(stationery2);
        stationeryList1.add(stationery3);
        List<Stationery> stationeryList2 = new ArrayList<>();
        stationeryList2.add(stationery2);
        stationeryList2.add(stationery3);
        stationeryList2.add(stationery4);
        manager1.setStationery(stationeryList1);
        manager2.setStationery(stationeryList2);
        Sheet.addEmployee(manager1);
        Sheet.addEmployee(manager2);




        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line="";
        do {
            System.out.println("Welcome to the accounting program of stationery.");
            System.out.println("Select options:(1,2,3,4,5,6)");
            System.out.println("1.Get list of employees.");
            System.out.println("2.Get list of stationery employee.");
            System.out.println("3.Get total cost of stationery employee.");
            System.out.println("4.Adding employee.");
            System.out.println("5.Adding stationery employee.");
            System.out.println("6.Exit");
            line = "";
            try {
                line = bufferedReader.readLine();
                switch (line.trim()) {
                    case "1": {
                        List<Employee> employees = Sheet.getEmployees();
                        if (employees.isEmpty()){
                            System.out.println("Employees not on the list");
                            break;
                        }
                        for (Employee empl : employees) {
                            System.out.println(empl);
                            System.out.println();
                        }
                        break;
                    }
                    case "2": {
                        System.out.println("Input personnel number employee?");
                        String number = bufferedReader.readLine();
                        int personnelNumber = Integer.parseInt(number.trim());
                        Employee employee = Sheet.getEmployee(personnelNumber);
                        if (employee == null) {
                            System.out.println("Employee not found");
                            break;
                        }
                        List<Stationery> stationery = Sheet.getStationery(employee);
                        System.out.println("Employee name: "+employee.getName());
                        System.out.println(stationery);
                        System.out.println();
                        break;
                    }
                    case "3" :{
                        System.out.println("Input personnel number employee?");
                        String number = bufferedReader.readLine();
                        int personnelNumber = Integer.parseInt(number.trim());
                        Employee employee = Sheet.getEmployee(personnelNumber);
                        if (employee == null) {
                            System.out.println("Employee not found");
                            break;
                        }
                        double totalCostStationery = Sheet.getTotalCostStationery(employee);
                        System.out.println("Employee name: "+employee.getName());
                        System.out.println("Total cost stationery employee "+employee.getName()+" "+totalCostStationery);
                        System.out.println();
                        break;
                    }
                    case "4":{
                        System.out.println("Input personnel number employee?");
                        String number = bufferedReader.readLine();
                        int personnelNumber = Integer.parseInt(number.trim());
                        System.out.println("Input name?");
                        String name=bufferedReader.readLine();
                        System.out.println("Input position?");
                        String position=bufferedReader.readLine();
                        Sheet.addEmployee(new Employee(personnelNumber,name,position));
                        System.out.println("Success!");
                        break;
                    }
                    case "5":{
                        System.out.println("Input name stationery?");
                        String name=bufferedReader.readLine();
                        System.out.println("Input price stationery?");
                        String price=bufferedReader.readLine();
                        double priceStationery=Double.parseDouble(price.trim().replace(',','.'));
                        System.out.println("Input personnel number employee?");
                        String number = bufferedReader.readLine();
                        int personnelNumber = Integer.parseInt(number.trim());
                        Employee employee = Sheet.getEmployee(personnelNumber);
                        if (employee == null) {
                            System.out.println("Employee not found");
                            break;
                        }
                        List<Stationery> stationery = Sheet.getStationery(employee);
                        stationery.add(new Stationery(name,priceStationery));
                        employee.setStationery(stationery);
                        System.out.println("Success!");
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }catch (NumberFormatException ex){
                System.out.println("Error. Input number!");
            }catch (NullPointerException exc){
            }
        }while (!line.equals("6"));
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
