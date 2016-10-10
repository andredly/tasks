package com.cherniauski.trening.task2.correct_variant;

import com.cherniauski.trening.task2.not_consistent_task_variant.Sheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Andre on 09.10.2016.
 */
public class Main {
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        Employee manager1 = new Employee(2, "Petr", "Manager", "1");
        Employee manager2 = new Employee(3, "Ivan", "Manager", "2");
        Stationery stationery1 = new Stationery("Pen", 1.4);
        Stationery stationery2 = new Stationery("Pencil", 1.0);
        Stationery stationery3 = new Stationery("Paper", 5.4);
        Stationery stationery4 = new Stationery("Calculator", 15.2);
        SheetStationery.addStationery(stationery1);
        SheetStationery.addStationery(stationery2);
        SheetStationery.addStationery(stationery3);
        SheetStationery.addStationery(stationery4);
        manager1.getStationery().put(stationery1, 1);
        SheetEmployees.addEmployee(manager1);
        SheetEmployees.addEmployee(manager2);
        String line = "";
        do {
            System.out.println("Welcome to the accounting program of stationery.");
            System.out.println(" Select options:(1,2)");
            System.out.println("1.Enter");
            System.out.println("2.Exit");
            try {
                line = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            switch (line) {
                case "1": {
                    System.out.println("Please, enter personnel number and password?");
                    System.out.println("Enter personnel number?");
                    Employee employee = null;
                    try {
                        String pn = bufferedReader.readLine();
                        int personnelNumber = Integer.parseInt(pn);
                        System.out.println("Enter password?");
                        String password = bufferedReader.readLine();
                        if (LoginLogic.checkLogin(personnelNumber, password)) adminPanel();
                        else {
                            Employee chekEmployee = SheetEmployees.getEmployee(personnelNumber);
                            if (employeeIsNull(chekEmployee)) break;
                            if (chekEmployee.getPASSWORD().equals(password.trim())) {
                                employee = chekEmployee;
                                userPanel(employee);
                            } else {
                                System.out.println("Password incorrect");
                                break;
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
            }
        }
        while (!line.equals("2"));


        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void adminPanel() {
        String line = "";
        do {
            System.out.println("Welcome to admin panel.");
            System.out.println("Select options:(1,2,3,4,5)");
            System.out.println("1.Get list of employees.");
            System.out.println("2.Get list of stationery.");
            System.out.println("3.Adding employee.");
            System.out.println("4.Delete employee.");
            System.out.println("5.Exit to menu");
            line = "";
            try {
                line = bufferedReader.readLine();
                switch (line.trim()) {
                    case "1": {
                        Set<Employee> employees = SheetEmployees.getEmployees();
                        if (employees.isEmpty()) {
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
                        SheetStationery.printAllListStationery();
                        break;
                    }
                    case "3": {
                        List<Integer> personnelNumbers = SheetEmployees.getPersonnelNumbers();
                        System.out.println("Last personnel number: " + personnelNumbers.get(personnelNumbers.size() - 1));
                        System.out.println("Enter personnel number employee? ");
                        String number = bufferedReader.readLine();
                        int personnelNumber = Integer.parseInt(number.trim());
                        if (personnelNumbers.contains(personnelNumber)) {
                            System.out.println("Number is busy.");
                            break;
                        }
                        System.out.println("Enter name employee?");
                        String name = bufferedReader.readLine();
                        System.out.println("Enter position employee?");
                        String position = bufferedReader.readLine();
                        System.out.println("Enter password employee?");
                        String password = bufferedReader.readLine();
                        Employee employee = new Employee(personnelNumber, name, position, password);
                        if (employeeIsNull(employee)) {
                            System.out.println("Error create employee.");
                            break;
                        }
                        SheetEmployees.addEmployee(employee);
                        break;
                    }

                    case "4": {
                        System.out.println("Enter personnel number employee?");
                        String number = bufferedReader.readLine();
                        int personnelNumber = Integer.parseInt(number.trim());
                        SheetEmployees.removeEmployee(SheetEmployees.getEmployee(personnelNumber));
                        System.out.println("Operation success!");
                        break;

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException ex) {
                System.out.println("Error. Input number!");
            } catch (NullPointerException exc) {
            }
        } while (!line.equals("5"));
    }


    private static void userPanel(Employee employee) {
        String line = "";
        do {
            System.out.println("Welcome!");
            System.out.println("Select options:(1,2,3,4,5,6)");
            System.out.println("1.Get list of stationery.");
            System.out.println("2.Adding stationery.");
            System.out.println("3.Delete count stationery.");
            System.out.println("4.Total cost stationery.");
            System.out.println("5.Get list all of stationery from base.");
            System.out.println("6.Exit to menu");
            line = "";
            try {
                line = bufferedReader.readLine();
                switch (line.trim()) {
                    case "1": {
                        Map<Stationery, Integer> stationery = employee.getStationery();
                        if (stationery.isEmpty()) System.out.println("List stationery is empty.");
                        for (Map.Entry<Stationery, Integer> stationeryIntegerEntry : stationery.entrySet()) {
                            System.out.println(stationeryIntegerEntry.getKey().getName()
                                    + ", count " + stationeryIntegerEntry.getValue()
                                    + ", price " + stationeryIntegerEntry.getKey().getPrice());
                        }
                        break;
                    }
                    case "2": {
                        System.out.println("Enter name stationery?");
                        String name = bufferedReader.readLine();
                        List<Stationery> stationeryForNameFromBase = SheetStationery.getStationeryForNameFromBase(name);
                        System.out.println("List stationery: " + name + " from base");
                        System.out.println(stationeryForNameFromBase);
                        System.out.println("List stationery: " + name + " from employee");
                        System.out.println(employee.getStationery(name));
                        System.out.println("Enter price stationery?");
                        String price = bufferedReader.readLine();
                        double priceStationery = Double.parseDouble(price.trim().replace(',', '.'));
                        System.out.println("Enter count stationery?");
                        String count = bufferedReader.readLine();
                        int countStationery = Integer.parseInt(count);
                        employee.putStationery(new Stationery(name, priceStationery), countStationery);
                        break;
                    }
                    case "3": {
                        System.out.println("Enter name stationery?");
                        String name = bufferedReader.readLine();
                        List<Stationery> stationeryForNameFromBase = SheetStationery.getStationeryForNameFromBase(name);
                        System.out.println("List stationery from base");
                        System.out.println(stationeryForNameFromBase);
                        System.out.println("List stationery from employee");
                        System.out.println(employee.getStationery(name));
                        System.out.println("Enter price stationery?");
                        String price = bufferedReader.readLine();
                        double priceStationery = Double.parseDouble(price.trim().replace(',', '.'));
                        System.out.println("Enter count stationery?");
                        String count = bufferedReader.readLine();
                        int countStationery = Integer.parseInt(count);
                        employee.removeStationery(name, priceStationery, countStationery);
                        break;
                    }
                    case "4": {
                        double totalCostStationery = SheetEmployees.getTotalCostStationery(employee);
                        System.out.println("Total cost stationery: " + totalCostStationery);
                        break;
                    }
                    case "5": {
                        SheetStationery.printAllListStationery();
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException ex) {
                System.out.println("Error. Input number!");
            } catch (NullPointerException exc) {
            }
        } while (!line.equals("6"));
    }

    private static boolean employeeIsNull(Employee employee) {
        if (employee == null) {
            System.out.println("Error. Employee not found!");
            return true;
        }
        return false;
    }
}
