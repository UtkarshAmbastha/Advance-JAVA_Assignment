package com.que12;

import java.io.*;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
    }

    int empID, empAGE;
    String empName;

    Employee(int empID, String empName, int empAGE) {

        this.empID = empID;
        this.empName = empName;
        this.empAGE = empAGE;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empAGE=" + empAGE +
                ", empName='" + empName + '\'' +
                '}';
    }

    static {
        BufferedReader br1, br2;
        FileReader file, file1;
        String line;

        int l_No = 0;
        String[] data;
        Employee[] employee = null;
        Scanner sc = new Scanner(System.in);

        try {
            file1 = new FileReader("src/com/que12/EmpOutPut.txt");
            br1 = new BufferedReader(file1);

            int i = 0;
            while ((line = br1.readLine()) != null) {
                data = line.split(",");
                employee[i] = new Employee(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]));
                i++;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        int in;
        do {
            assert employee != null;
            for (Employee emp : employee) {
                System.out.println(emp);
            }
            System.out.println("_______________ Enter Your Choice ___________________" + "Edit: Press 1 for editing" + "Exit: Press 2 for Exit ");
            in = sc.nextInt();
            if (in == 1) {
                System.out.println("Editing enabling...");
                Employee[] employees = editEmployee(employee);
//
                updateFile(employees);
            }
        } while (in != 2);
        System.out.println("BYE BYE");
    }


    static Employee[] editEmployee(Employee[] employees) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id");
        int employeeID = sc.nextInt();
        for (Employee employee : employees) {
            if (employee.empID == employeeID) {
                System.out.println("Enter Name");
                String editName = sc.next();
                System.out.println("Enter Age");
                int editAge = sc.nextInt();
                employee.empName = editName;
                employee.empAGE = editAge;
            }
        }
        return employees;
    }

    static void updateFile(Employee[] employees) {
        FileWriter writer = null;
        File fileToBeModified = new File("src/com/que12/EmpOutPut.txt");
        StringBuilder newContent = new StringBuilder();
        try {
            for (Employee emp : employees) {
                newContent.append(emp.empID).append(",").append(emp.empName).append(",").append(emp.empAGE).append(System.lineSeparator());
            }
            System.out.println(newContent);
            writer = new FileWriter(fileToBeModified);
            writer.write(newContent.toString());
            System.out.println("The File has been updated successfully!");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                assert writer != null;
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
